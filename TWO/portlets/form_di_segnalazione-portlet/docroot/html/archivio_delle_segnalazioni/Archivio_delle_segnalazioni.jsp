<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>
<%@page import="com.daffo.form_di_segnalazione.service.form_di_segnalazioneLocalServiceUtil"%>
<%@page import="com.daffo.form_di_segnalazione.model.form_di_segnalazione"%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>


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
<div class="form-group pull-right">
   <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder='<liferay-ui:message key="walf"/>'>
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="scrollTable results" cellpadding="0" cellspacing="0" border="0">
<thead>
<tr> 
	<th width="10%"><b>#</b></th>
    <th width="10%"><b>CODICE SEGNALAZIONE</b></th>
    <th width="10%"><b>INIZIALI PAZIENTE</b></th>
    <th width="10%"><b>DATA di NASCITA o ETÀ</b></th>
    <th width="10%"><b>SESSO</b></th>
    <th width="10%"><b>DATA INSORGENZA REAZIONE</b></th>
    <th width="10%"><b><liferay-ui:message key="action"/></b></th>
</tr>
<tr class="warning no-result">
      <td colspan="8" style="color:black;background-color:#ffe6e6;"><div style="display:block;padding: 10px 5px 5px 5px; font-weight: bold"><liferay-ui:message key="noresult"/></div></td>
</tr>
</thead>
<tbody>
 <%
  	List<form_di_segnalazione> el=(List<form_di_segnalazione>)form_di_segnalazioneLocalServiceUtil.getform_di_segnalaziones(-1,-1);
 	System.out.println("value:"+el);

       for(form_di_segnalazione fds: el)
       {
    	   %>

<portlet:actionURL name="form_di_segnalazione_fetch_from" var="form_id">
<portlet:param name="form_id" value='<%= fds.getForm_di_segnalazione_id()+""%>'></portlet:param>
</portlet:actionURL>
<tr>
<td><%-- <aui:a href="${form_id}" style="color:black;text-decoration:none;"> --%><%-- </aui:a> --%><%=fds.getForm_di_segnalazione_id()%></td>
<td><%=fds.getCODICE()%></td>
<td><%=fds.getINIZIALI_1()%></td>
<td><%=fds.getDATA_2()%></td>
<td><%=fds.getSESSO_3()%></td>
<td><%=fds.getDATA_4()%></td>
<td> <button class="btn btn-primary" onclick="getRowId('<%=fds.getForm_di_segnalazione_id()+""%>')"><liferay-ui:message key="View"/></button>
</td>
</tr>
 <%  
 }
       
 %>
</tbody>
</table>
<portlet:renderURL var="readOnly" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
<portlet:param name="mvcPath" value="/html/archivio_delle_segnalazioni/Form_di_segnalazione_readOnly.jsp" />
</portlet:renderURL> 

<aui:script>
function getRowId(userData)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('formID', userData);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/archivio_delle_segnalazioni/Form_di_segnalazione_readOnly.jsp');
	    // Now we can use the URL
	  // alert(portletURL.toString());
	   Liferay.Util.openWindow({
			dialog: {
			centered: true,
			cssClass: 'my-liferay-popup',
			constrain2view: true,
			modal: true,
			width: 1600
			},
			id: '<portlet:namespace/>viewdialog',
			title: 'Form di segnalazione' ,
			uri:  portletURL.toString()
			});
}

</aui:script>

