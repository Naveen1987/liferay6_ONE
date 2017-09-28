<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />


<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>

<div style="text-align:right;">
<span class="medownload btn btn-warning"><liferay-ui:message key="download"/></span>
<br/>
</div>
<div style="text-align:center" style="width:1240px; height:1698px">
<img src="<%=request.getContextPath() %>/documents/istruzioni-page-001.jpg"/>
<%-- <%-- <object><embed style="overflow:none;" src="<%=request.getContextPath()%>/documents/istruzioni.pdf" height="1045" width="850"
 type="application/pdf"></embed></object>
</div> 
style="overflow:hidden !important; width: 900px; height:1250px;margin-left: 0px;"

<object id="myObject" data="<%=request.getContextPath() %>/documents/istruzioni.pdf" type="application/pdf" hspace="0" width="100%" height="1550px">
    <embed src="<%=request.getContextPath() %>/documents/istruzioni.pdf"/>
</object> 
 --%>
</div>
<script type="text/javascript">
$(function(){
	
});
</script>
<script>
$('.medownload').click(function(e) {
   e.preventDefault();  //stop the browser from following
    window.location.href = '<%=request.getContextPath()%>/documents/istruzioni.pdf';
   
});
</script>