<%@page import="com.liferay.portal.model.Role"%>
<%@ include file="init.jsp" %>
<%
boolean flag=false;
System.out.println(user.getFullName());
for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Sistemi Informativi role")||r.getName().equalsIgnoreCase("Administrator"))
{
	flag=true;
	break;
}
}
%>
<%
String url=(flag==true)?"/html/telephone/AdminPage.jsp":"/html/telephone/GuestPage.jsp";

%> 
<jsp:include page="<%=url%>"/>
<%-- <jsp:include page="/html/telephone/AdminPage.jsp"></jsp:include> --%>
