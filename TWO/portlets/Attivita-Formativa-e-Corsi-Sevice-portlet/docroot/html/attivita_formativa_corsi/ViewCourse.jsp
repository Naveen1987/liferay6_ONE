<%@page import="com.liferay.sample.service.suiluppo_courseLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.suiluppo_course"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>
<%-- <%=request.getParameter("courseId") %> --%>
<%

suiluppo_course ls=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(request.getParameter("courseId")).longValue());			
%>  
<table class="table table-bordered" style="width:100%">
<%-- <thead style="background-color: #45CBF5;color:white;">
<tr>
<th colspan="2">
<b><liferay-ui:message key="CourseView"/></b>
</th>
</tr>
</thead> --%>
<tbody>
<tr>
<td><b>Docente</b></td><td><%=ls.getDocente() %></td>
</tr>
<tr>
<td><b>Evento Progetto</b></td><td><%=ls.getEvento_Progetto()%></td>
</tr>
<tr>
<td><b>Titolo</b></td><td><%=ls.getTitolo() %></td>
</tr>
<tr>
<td><b>Descrizione</b></td><td><%=ls.getDescrizione() %></td>
</tr>
<tr>
<td><b>Figure Professionali Coinvolte</b></td><td><%=ls.getFigure_Professionali_Coinvolte()%></td>
</tr>
<tr>
<td><b>Nr Edizione</b></td><td><%=ls.getNr_Edizione() %></td>
</tr>
<tr>
<td><b>Sede</b></td><td><%=ls.getSede() %></td>
</tr>
<tr>
<td><b>Abstract</b></td><td><%=ls.getAbstract() %></td>
</tr>
<tr>
<td><b>Data Inizio</b></td><td><%=ls.getData_Inizio()%></td>
</tr>
<tr>
<td><b>Data Fine</b></td><td><%=ls.getData_Fine() %></td>
</tr>
<tr>
<td><b>Tot Ore</b></td><td><%=ls.getTot_Ore()%></td>
</tr>
<tr>
<td><b>Scadenza Iscrizioni</b></td><td><%=ls.getScadenza_Iscrizioni() %></td>
</tr>
<tr>
<td><b>Ammessi al corso</b></td><td><%=ls.getAmmessi_al_corso() %></td>
</tr>
<tr>
<td><b>Visibile</b></td><td><%=(ls.getVisibile().equalsIgnoreCase("true"))?"SI":"NO" %></td>
</tr>
<tr>
<td><b>Bloccato</b></td><td><%=(ls.getBloccato().equalsIgnoreCase("true"))?"SI":"NO" %></td>
</tr>
<tr>
<td><b>Dispensa corso</b></td><td><a href="<%=ls.getDispensa_corso() %>">Scaricare</a></td>
</tr>
</tbody>
</table>

