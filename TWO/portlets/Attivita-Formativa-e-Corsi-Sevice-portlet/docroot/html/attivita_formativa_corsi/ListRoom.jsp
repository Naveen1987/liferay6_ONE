<%@page import="com.liferay.sample.service.suiluppo_roomLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.suiluppo_room"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<%@ include file="init.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" />
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<script src='<%=request.getContextPath()+"/js/jquery-ui.min.js"%>'></script>
<script src='<%=request.getContextPath()+"/js/jquery.scrolltable.js"%>'></script>

<script type="text/javascript">
		$(function(){
		$('.scrollTable').scrolltable({
			maxHeight: 650,
			stripe: true,
			oddClass: 'odd'
		});
		});
	</script>
<style type="text/css">
.scrollTable {
width: 100%;
}
.scrollTable thead {
background-color: #45CBF5;
color:white;
}
.scrollTable thead th {
text-align: left;
height:35px;
padding: 0.1em 0.3em;
}
.scrollTable tbody td {
border-top: 1px solid #eee;
border-right: 1px solid #eee;
padding: 0.1em 0.3em;
}
.scrollTable tbody tr.odd td {
background-color: #f9f9f9;
}
</style>

<style>
.results tr[visible='false'],
.no-result{
  display:none;
}

.results tr[visible='true']{
  display:table-row;
}

.counter{
  padding:8px; 
  color:#ccc;
}
</style>

<script>
$(document).ready(function() {
	  $(".search").keyup(function () {
	    var searchTerm = $(".search").val();
	    var listItem = $('.results tbody').children('tr');
	    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")
	    
	  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
	        return (elem.textContent || elem.innerText || '').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
	    }
	  });
	    
	  $(".results tbody tr").not(":containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','false');
	  });

	  $(".results tbody tr:containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','true');
	  });

	  var jobCount = $('.results tbody tr[visible="true"]').length;
	    $('.counter').text(jobCount + ' <liferay-ui:message key="item"/>');

	  if(jobCount == '0') {$('.no-result').show();}
	    else {$('.no-result').hide();}
			  });
	});
</script>
<div>
<span id="btnNewRoom" class="btn btn-success"><liferay-ui:message key="NewRoom"/></span>
</div>

<div class="form-group pull-right">
   <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder='<liferay-ui:message key="walf"/>'>
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="scrollTable results" cellpadding="0" cellspacing="0" border="0">
<thead>
<tr>
	<th><b><liferay-ui:message key="rmId"/></b></th>
    <th><b><liferay-ui:message key="rmName"/></b></th>
    <th><b><liferay-ui:message key="rmDescription"/></b></th>
    <th width="30%"><b><liferay-ui:message key="action"/></b></th>
</tr>
<tr class="warning no-result">
      <td colspan="10" style="color:black;background-color:#ffe6e6;"><div style="display:block;padding: 10px 5px 5px 5px; font-weight: bold"><liferay-ui:message key="noresult"/></div></td>
</tr>
</thead>
<tbody>
     <%
 
    List<suiluppo_room> lsr=suiluppo_roomLocalServiceUtil.getsuiluppo_rooms(-1, -1);
    		for(suiluppo_room sr:lsr){
    			%>
    			<tr>
    			<td><%=sr.getRoomID() %></td>
    			<td><%=sr.getRoom_name() %></td>
    			<td><%=sr.getRoom_description() %></td>
    			<td>
    			<span class="btn btn-warning" onClick="onRoomEdit('<%=sr.getRoomID()%>')"><liferay-ui:message key="edit"/></span>&nbsp;
    			<span class="btn btn-danger" onClick="onRoomDelete('<%=sr.getRoomID()%>')"><liferay-ui:message key="delete"/></span>
    			</td>
    			</tr>
    			<%
    		}
    %>
    </tbody>
    </table>

<portlet:resourceURL var="roomDelete" id="roomDelete">
</portlet:resourceURL>
<script>
$("#btnNewRoom").click(function(){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('jspPage', '/html/attivita_formativa_corsi/NewRoom.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="NewRoom"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>NewRoom',
	                dialog: {
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 800,
	                    height:450,
	                    toolbars: {
	                    	header: []	
	                    }
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	window.location.reload();
	            });
	        });
	    });

	
});


function onRoomDelete(roomId){
	var a=  confirm('<liferay-ui:message key="DoyoureadytoRoomDelete"/>');
	  if(a==true)
	  {
		  AUI().use('aui-base','aui-io-request', function(A){
				//aui ajax call to get updated content
				A.io.request('<%=roomDelete%>',{
		  		dataType: 'json',
		  		method: 'POST',
		  		data:{'<portlet:namespace/>roomID':roomId},
		  		on: {
		   			 success: function() {
		   				var data=this.get('responseData');
		   				if(data!=null){
		   	   				if(data.flag=='no'){
		   	   					alert('<liferay-ui:message key="roomnotdelete"/>');
		   	   				}else if(data.flag=='yes'){
		   	   				alert('<liferay-ui:message key="RoomDeletedSuccessfully"/>')  			
		   	   					
		   	   				}
		   	   			}

		   			 window.location.reload();
		    		}
		  		}
				});
				});	
	  }
	
}


function onRoomEdit(roomId){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	 	portletURL.setParameter('roomId', roomId); 
	 	portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/EditRoom.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="EditRoom"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Edit_Room',
	                dialog: {
	                	constrain2view: true,
	                	destroyOnHide: true,
	                	//destroyOnClose: true,
	                	resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 800,
	                    height:450,
	                    toolbars: {
	                    	header: []	
	                    }
	                }
		             
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	window.location.reload();
	            });
	        });
	    });

	}
	

</script>

<aui:script>
Liferay.provide(
	    window,
	    '<portlet:namespace/>closePopup',
	        function(popupIdToClose) {

	            var popupDialog = Liferay.Util.Window.getById(popupIdToClose);

	            popupDialog.destroy();
	        },
	        ['liferay-util-window']
	    );
</aui:script>