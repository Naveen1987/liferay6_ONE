<%@page import="com.liferay.sample.service.TelephonicLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.Telephonic"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>


<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" />
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<script src='<%=request.getContextPath()+"/js/jquery-ui.min.js"%>'></script>
<script src='<%=request.getContextPath()+"/js/jquery.scrolltable.js"%>'></script>

<script type="text/javascript">
		$(function(){
		$('.scrollTable').scrolltable({
			maxHeight: 600,
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

<div style="text-align: right;">
<table>
<tr>
<td>
<span class="btn btn-primary" id="addnew"><liferay-ui:message key="addnewcontact"/></span>
</td>
<td>
<a style="cursor: pointer;text-decoration: none;" href="/group/internal-intranet/welcome" class="btn btn-primary" id="gotoInt"><liferay-ui:message key="goInternalIntranet"/></a>
</td>
</tr>
</table>
</div>

<div class="form-group pull-right">
   <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder='<liferay-ui:message key="walf"/>'>
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="scrollTable results" cellpadding="0" cellspacing="0" border="0">
<thead>
<tr> 
	<th width="10%"><b>#</b></th>
    <th width="10%"><b>Nome</b></th>
    <th width="10%"><b>Tipo</b></th>
    <th width="10%"><b>Tipo Sede</b></th>
    <th width="10%"><b>Comune Sede</b></th>
    <th width="10%"><b>Interno</b></th>
    <th width="10%"><b>Piano</b></th>
	<th width="10%"><b>Unità Operativa</b></th>
    <th width="10%"><b><liferay-ui:message key="action"/></b></th>
</tr>
<tr class="warning no-result">
      <td colspan="11" style="color:black;background-color:#ffe6e6;"><div style="display:block;padding: 10px 5px 5px 5px; font-weight: bold"><liferay-ui:message key="noresult"/></div></td>
</tr>
</thead>
<tbody>
<%

  	List<Telephonic> el=(List<Telephonic>)TelephonicLocalServiceUtil.getTelephonics(-1, -1);
 	//System.out.println("value:"+el);

       for(Telephonic fds: el)
       {
    	   %>

<portlet:actionURL name="form_di_segnalazione_fetch_from" var="form_id">
<portlet:param name="form_id" value='<%= fds.getTelephonicId()+""%>'></portlet:param>
</portlet:actionURL>
<tr>
<td><%--<aui:a href="${form_id}" style="color:black;text-decoration:none;"> --%><%-- </aui:a>--%><%=fds.getTelephonicId()%></td>
<td><%=fds.getNome()%></td>
<td><%=fds.getTipo()%></td>
<td><%=fds.getTipoSede()%></td>
<td><%=fds.getComuneSede()%></td>
<td><%=fds.getInterno()%></td>
<td><%=fds.getPiano()%></td>
<td><%=fds.getUnitaOperativa()%></td>
<td><button class="btn btn-primary" onclick="getRowId('<%=fds.getTelephonicId()+""%>')"><liferay-ui:message key="View"/></button>
<button class="btn btn-warning" onclick="getRowIdEdit('<%=fds.getTelephonicId()+""%>')"><liferay-ui:message key="Edit"/></button>
</td>
</tr>
 <%  
 }
    
 %>
 </tbody>
 </table>
<aui:script>
$("#addnew").click(function(){
	var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/telephone/Telephone_new.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	            	title: 'Aggiungi nuovo contatto' ,
	                uri: portletURL,
	                id: '<portlet:namespace/>New dialog',
	    			dialog: {
	    				resizable: false,
	                	centered: true,
	                    destroyOnHide: true,
	                    cache: false,
	                    modal: true,
	                    width: 800
	                }
	            }).after('destroy', function(event) {
	            	//location.reload();
	            	window.location = window.location.href;
	            });
	        });
	    });
	   
	   
});
function getRowId(userData)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('teleId', userData);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/telephone/Telephone_readOnly.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	            	title: '<liferay-ui:message key="View"/>' ,
	                uri: portletURL,
	                id: '<portlet:namespace/>ViewDialog',
	    			dialog: {
	    				resizable: false,
	                	centered: true,
	                    destroyOnHide: true,
	                    cache: false,
	                    modal: true,
	                    width: 500,
	                    height:600
	                }
	            }).after('destroy', function(event) {
	            	//location.reload();
	            	window.location = window.location.href;
	            });
	        });
	    });
}

function getRowIdEdit(userData)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('teleId', userData);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/telephone/Telehone_Edit.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="EditInformation"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>editdialog',
	                dialog: {
	                	centered: true,
	                    destroyOnHide: true,
	                    cache: false,
	                    modal: true,
	                    width: 800
	                }
	            }).after('destroy', function(event) {
	            
	            	window.location = window.location.href;
	            });
	        });
	    });
}
</aui:script>
 