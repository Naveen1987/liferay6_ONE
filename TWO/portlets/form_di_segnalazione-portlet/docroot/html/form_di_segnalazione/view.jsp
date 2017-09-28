
<%@page import="com.liferay.portal.model.Role"%>
<%@ include file="init.jsp" %>
<%-- <%
boolean flag=false;
System.out.println(user.getFullName());
for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Medico")||r.getName().equalsIgnoreCase("Farmacia")
||r.getName().equalsIgnoreCase("Administrator")||r.getName().equalsIgnoreCase("Power User"))
{
	flag=true;
	break;
}
}
%>
 --%>
<%-- <%
String url=(flag==true)?"/html/views/InRoles.jsp":"/html/views/NonRoles.jsp";
%> --%>
<jsp:include page="/html/form_di_segnalazione/Form_di_segnalazione.jsp"></jsp:include>	




