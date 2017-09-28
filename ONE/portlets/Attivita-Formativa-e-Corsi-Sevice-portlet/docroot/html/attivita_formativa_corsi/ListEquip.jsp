<%@page import="com.liferay.sample.service.EquipmentLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.Equipment"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
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

/* .glyphicon.glyphicon-edit {
    font-size: 30px;
    color:#e09833;
    cursor:pointer;
}
.glyphicon.glyphicon-edit:hover {
    color:#7d4b05;
}
.glyphicon.glyphicon-trash {
    font-size: 30px;
    color:#d9534f;
    cursor:pointer;
}

.glyphicon.glyphicon-trash:hover {

    color:red;
}

 .box{
  height:650px;
  border-radius:10px; 
  border:1px solid #666;
  padding:6px 0px;
}

.box-content{
  height:635px;
  overflow:auto;
  border-radius:8px;
} */
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
	    $('.counter').text(jobCount + ' item');

	  if(jobCount == '0') {$('.no-result').show();}
	    else {$('.no-result').hide();}
			  });
	});
</script>
<%-- <div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<br/>
<h1><liferay-ui:message key="ListOfEquipments"/></h1>
</div>
</div> --%>
<div>
<span id="btnNewEquip" class="btn btn-success"><liferay-ui:message key="NewEquipment"/></span>
</div>
<div class="form-group pull-right">
    <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder='<liferay-ui:message key="walf"/>'>
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b><liferay-ui:message key="EquipmentName"/></b></th>
    <th><b><liferay-ui:message key="EqDescription"/></b></th>
    <th><b><liferay-ui:message key="EqQuantity"/></b></th>
    <th><b><liferay-ui:message key="action"/></b></th>
    </tr>
     <tr class="warning no-result">
      <td colspan="10"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
    </thead>
    <tbody>
   
    <%
    
    List<Equipment> lsr=EquipmentLocalServiceUtil.getEquipments(-1, -1);
    		for(Equipment sr:lsr){
    			%>
    			<tr>
    			<td><%=sr.getEquipment_name() %></td>
    			<td><%=sr.getEquip_description() %></td>
    			<td><%=sr.getEquip_quantity() %></td>
    			<td>
    			<span class="btn btn-warning" onClick="onEquipEdit('<%=sr.getEquip_id()%>')"><liferay-ui:message key="edit"/></span>&nbsp;
    			<span class="btn btn-danger" onClick="onEquipDelete('<%=sr.getEquip_id()%>')"><liferay-ui:message key="delete"/></span>
    			</td>
    			</tr>
    			<%
    		}
    %>
    </tbody>
    </table>




<portlet:actionURL name="equipDelete" var="equipDelete">
<portlet:param name="mvcPath" value="/html/attivita_formativa_corsi/ListEquip.jsp" />
</portlet:actionURL>
 
<script>
$("#btnNewEquip").click(function(){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/NewEquip.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="NewEquipment"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>New_Equipment',
	                dialog: {
	                	
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
	            	location.reload();
	            });
	        });
	    });

	
});

function onEquipDelete(equipId){
	var a=  confirm('<liferay-ui:message key="DoyoureadytoEquipmentDelete?"/>');
	  if(a==true)
	  {
		  AUI().use('aui-base','aui-io-request', function(A){
				//aui ajax call to get updated content
				A.io.request('<%=equipDelete%>',{
		  		dataType: 'json',
		  		method: 'POST',
		  		data:{'<portlet:namespace/>equipId':equipId},
		  		on: {
		   			 success: function() {
		   			 alert('<liferay-ui:message key="EquipmentDeletedSuccessfully"/>')  			
		   			 location.reload();
		    		}
		  		}
				});
				});	
	  }
	
}


function onEquipEdit(equipId){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	 	portletURL.setParameter('equipId', equipId); 
	 	portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	     portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/EditEquip.jsp'); 
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="EditEquipment"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Edit_Equipment',
	                dialog: {
	                	
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
	            	location.reload();
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