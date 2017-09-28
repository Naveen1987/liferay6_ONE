<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<%= %>
<%System.out.println(UserLocalServiceUtil.decryptUserId(20154, "20198", "AAAAoAAB9AD+5Z/SYQXzg9DkWTo7qBnOukYsLhG7Mnwfwz9a"));%>