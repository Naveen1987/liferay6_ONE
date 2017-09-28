<%@page import="com.liferay.sample.service.TelephonicLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.Telephonic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="init.jsp" %>
<portlet:actionURL name="formSubmit" var="formSubmit">
</portlet:actionURL>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<link href="<%= request.getContextPath()%>/css/on-off-switch.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/js/on-off-switch.js"></script>
<script src="<%= request.getContextPath()%>/js/on-off-switch-onload.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" />
<script src='<%=request.getContextPath()+"/js/jquery-ui.min.js"%>'></script>
<liferay-ui:success key="success" message="successkey"/>

<style>
#header {
	width: 100%;
}

.container_di {
	width: 100%;
	border: 1px solid lightgray;
	box-sizing: border-box;
	font-family: "Arial";
	font-size: 12px;
}

#first {
	width: 70%;
	float: left;
	height: auto;
	/*          padding-left: 20px;
    padding-right: 20px;
 */
}
</style>
<%
String teleId=request.getParameter("teleId");
Telephonic tele=TelephonicLocalServiceUtil.getTelephonic(new Long(teleId).longValue());
%>
<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-right: 20%; text-align: left">
			<table style="width: 100%">
			<tr><td>Tipo</td><td>
			<%=tele.getTipo() %>
			</td>
			<td>
			<span style="color:red;display:none" id="_Tipo"><liferay-ui:message key="PleaseSelectValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Tipo Sede</td><td>
			<%=tele.getTipoSede() %>
			</td>
			</tr>
			<tr>
			<td>Comune Sede</td><td>
			<%=tele.getComuneSede() %>
			</td>
			</tr>
			<tr>
			<td>Descrizione Sede </td><td>
			<%=tele.getDescrizioneSede() %>
			</td>
			</tr>
			<tr>
			<td>Interno</td><td>
			<%=tele.getInterno() %>
			</td>
			</tr>
			<tr>
			<td>Piano</td><td>
			<%=tele.getPiano() %>
			</td>
			</tr>
			<tr>
			<td>Area</td><td>
			<%=tele.getArea() %>
			</td>
			</tr>
			<tr>
			<td>Blocco</td><td>
			<%=tele.getBlocco() %>
			</td>
			</tr>
			<tr>
			<td>Stanza</td><td>
			<%=tele.getStanza() %>
			</td>
			</tr>
			<tr>
			<td>Marca</td><td>
			<%=tele.getMarca() %>
			</td>
			</tr>
			<tr>
			<td>Modello</td><td>
			<%=tele.getModello() %>
			</td>
			
			</tr>
			<tr>
			<td>Inventario SN</td><td>
			<%=tele.getInventarioSN() %>
			</td>
			
			</tr>
			<tr>
			<td>Unità Operativa</td><td>
			<%=tele.getUnitaOperativa() %>
			</td>
			
			</tr>
			<tr>
			<td>Descrizione</td><td>
			<%=tele.getDescrizione() %>
			</td>
			</tr>
			<tr>
			<td>Nome</td><td>
			<%=tele.getNome() %>
			</td>
			</tr>
			<tr>
			<td>Note</td><td>
			<%=tele.getNote() %>
			</td>
			</tr>
			<tr>
			<td>Visibile</td><td>
			<div class="checkbox-container">
   			<input type="checkbox"  id='Visibile' <%=tele.getVisibile().equalsIgnoreCase("true")?"checked":"" %>>
			</div>
			<script type="text/javascript">
    		new DG.OnOffSwitch({
        	el: '#Visibile',
       		textOn: 'SI',
        	textOff: 'NO',
       	 	width: 100,
       	 	height: 30,
       	 listener:function(name, checked){    
        	}
  });
</script>		
			</td>
			</tr>
			</table>
		</div>
		<div style="clear: both"></div>
	</div>

	