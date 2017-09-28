
<%@page import="com.liferay.portal.model.Role"%>
<%@ include file="init.jsp" %>
<%
boolean flag=false;
System.out.println(user.getFullName());
for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Medico role")||r.getName().equalsIgnoreCase("Farmacia role")
||r.getName().equalsIgnoreCase("Administrator"))
{
	flag=true;
	break;
}
}
%>

 <%
String url=(flag==true)?"/html/archivio_delle_segnalazioni/Archivio_delle_segnalazioni_edit.jsp":"/html/archivio_delle_segnalazioni/Archivio_delle_segnalazioni.jsp";
%> 
<jsp:include page="<%=url%>"/>
<%-- <jsp:include page="/html/archivio_delle_segnalazioni/Archivio_delle_segnalazioni_edit.jsp"></jsp:include> --%>

