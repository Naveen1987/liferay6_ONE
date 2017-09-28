<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portlet.blogs.model.BlogsEntry"%>
<%@page import="com.liferay.portlet.blogs.service.BlogsEntryLocalServiceUtil"%>
<%@page import="java.util.*"%>
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
font-weight: bold;
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
 <table class="scrollTable">
        <thead>
            <tr>
                <th width="15%"><span class="text"><liferay-ui:message key="nePublishDate"/></span></th>
                <th width="40%"><span class="text"><liferay-ui:message key="neTitle"/></span></th>
                <th width="30%"><span class="text"><liferay-ui:message key="neBody"/></span></th>
                <th width="15%"><span class="text"><liferay-ui:message key="neExplirationDate"/></span></th>
            </tr>
        </thead>
        <tbody>
<% 
	List<BlogsEntry>lt=BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());
	for(BlogsEntry b:lt){
	%>
	<tr>
	<td><%=new SimpleDateFormat("dd/MM/yyyy").format(b.getCreateDate()).toString()%></td>
	<td><%=b.getTitle()%></td>
	<td><%=b.getContent()%></td>
	<td><%=new SimpleDateFormat("dd/MM/yyyy").format(b.getStatusDate()).toString()%></td>
	</tr>
	<%
	}
%>
    </tbody>
</table>