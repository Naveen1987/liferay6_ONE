<%@page import="java.util.Map"%>
<%@page import="java.util.Locale"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.storage.StorageEngineUtil"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.storage.Fields"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryMetadataLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntryMetadata"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntryType"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.model.DDMStructure"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="java.util.List"%>
<%@page import="com.daffo.filelib.model.FolderAndDocType_Service"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="init.jsp" %>
 <%
FolderAndDocType_Service fb=new FolderAndDocType_Service();
Folder folder=fb.getFolder(themeDisplay, "Comitati_Gruppi di Miglioramento");
%>
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
<th width="10%"><b>COD</b></th>
<th width="40%"><b>TITOLO</b></th>
<th width="10%"><b>REV</b></th>
<th width="20%"><b>Dimensioni</b></th>
<th width="10%"><b>LINGUA</b></th>
</tr>
<tr class="warning no-result">
      <td colspan="8" style="color:black;background-color:#ffe6e6;"><div style="display:block;padding: 10px 5px 5px 5px; font-weight: bold"><liferay-ui:message key="noresult"/></div></td>
</tr>
</thead>
<tbody>
<%
List<DLFileEntry> fileEntryService=fb.getAllFiles(themeDisplay, folder.getFolderId());
for(DLFileEntry dlFileEntry : fileEntryService){
	Map<String,String> values=fb.getFileData(themeDisplay, folder, dlFileEntry);
%>
<tr>
<td><aui:a href='<%=values.get("url")%>' style="color:black;text-decoration:none;"><%=values.get("COD")%></aui:a></td>
<td><aui:a href='<%=values.get("url")%>' style="color:black;text-decoration:none;"><%=values.get("title")%></aui:a></td>
<td><aui:a href='<%=values.get("url")%>' style="color:black;text-decoration:none;"><%=values.get("REV")%></aui:a></td>
<td>
<aui:a href='<%=values.get("url")%>' style="color:black;text-decoration:none;">
<img src="<%=request.getContextPath()%>/images/<%=values.get("icon")%>" style="width:25px;height: 25px" alt='<%=values.get("extension")%> file'/>
<%=values.get("size")%>
</aui:a>
</td>
<td><aui:a href='<%=values.get("url")%>' style="color:black;text-decoration:none;"><%=values.get("Lingua")%></aui:a></td>
</tr>	
<%
}
%>
</tbody>
</table>


