<%@page import="com.liferay.portal.model.Role"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>

<%
boolean flag=false;
//System.out.println(user.getFullName());
for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Farmacia")
||r.getName().equalsIgnoreCase("Administrator")||r.getName().equalsIgnoreCase("Power User"))
{
	flag=true;
	break;
}
}
%>
<%
String jspage=((flag==true)?"/html/prontuario/InRole.jsp":"/html/prontuario/NotInRole.jsp");
%>
<jsp:include page="<%=jspage%>"></jsp:include>	

