<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="init.jsp" %>
<%@page import="com.daffo.form_di_segnalazione.service.form_di_segnalazioneLocalServiceUtil"%>
<%@page import="com.daffo.form_di_segnalazione.model.form_di_segnalazione"%>


<style>
#header {
	width: 100%;
}

.container_di {
	width: 100%;
	border: 1px solid black;
	box-sizing: border-box;
	font-family: "Arial";
	font-size: 12px;
}

#first {
	width: auto;
	float: left;
	height: auto;
	/*          padding-left: 20px;
    padding-right: 20px;
 */
}

#second {
	width: auto;
	float: left;
	height: auto;
	/* border-left: 1px solid black; */
	/*      padding-left: 20px; */
}

#third {
	width: auto;
	float: left;
	height: auto;
	/* border-left: 1px solid black;
     */ /* padding-left: 20px; */
}

#forth {
	width: auto;
	float: left;
	height: auto;
	/* border-left: 1px solid black;
    border-left-height : auto;
     */ /*   padding-left: 20px; */
}

#fifth {
	width: auto;
	float: left;
	height: auto;
	/* border-left: 1px solid black;
    border-left-height : auto; 
     */
	/* padding-right: 20px; */
}

#sixth {
	width: auto;
	float: left;
	height: auto;
	/* border-left: 1px solid black;
    border-left-height : auto; 
    */
}
</style>

<script>
YUI().use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#DATA_2',
		         mask: '%d/%m/%Y',
		         popover: {
		          toolbars: {
		            header: [[
		              {
		                icon:'icon-trash',
		                label: '<liferay-ui:message key="Clear"/>',
		                on: {
		                  click: function() {
		                    datepicker.clearSelection();
		                  }
		                }
		              },
		              
		            ]]
		          },
		          zIndex: 1
		        }
		      }
		    );
		  }
		);

YUI().use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#DATA_4',
		         mask: '%d/%m/%Y',
		         popover: {
		          toolbars: {
		            header: [[
		              {
		                icon:'icon-trash',
		                label: '<liferay-ui:message key="Clear"/>',
		                on: {
		                  click: function() {
		                    datepicker.clearSelection();
		                  }
		                }
		              },
		              
		            ]]
		          },
		          zIndex: 1
		        }
		      }
		    );
		  }
		);
YUI().use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#DATA_40',
		         mask: '%d/%m/%Y',
		         popover: {
		          toolbars: {
		            header: [[
		              {
		                icon:'icon-trash',
		                label: '<liferay-ui:message key="Clear"/>',
		                on: {
		                  click: function() {
		                    datepicker.clearSelection();
		                  }
		                }
		              },
		              
		            ]]
		          },
		          zIndex: 1
		        }
		      }
		    );
		  }
		);
YUI().use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#INIZIALI_1_c',
		         mask: '%d/%m/%Y',
		         popover: {
		          toolbars: {
		            header: [[
		              {
		                icon:'icon-trash',
		                label: '<liferay-ui:message key="Clear"/>',
		                on: {
		                  click: function() {
		                    datepicker.clearSelection();
		                  }
		                }
		              },
		              
		            ]]
		          },
		          zIndex: 1
		        }
		      }
		    );
		  }
		);		
function show(){
	alert("Hello");
}
</script> 
 
 <%

form_di_segnalazione frm=null;
try{
frm=form_di_segnalazioneLocalServiceUtil.getform_di_segnalazione(new Long(request.getParameter("formID")).longValue());
System.out.println("Param:"+frm);
}catch(Exception ex){
	try{
		frm=form_di_segnalazioneLocalServiceUtil.getform_di_segnalazione(new Long(request.getAttribute("formID").toString()).longValue());
		System.out.println("Attr:"+frm);
	}catch(Exception em){}
}

%>
<portlet:actionURL name="updateRecord" var="updateRecord">
<%-- <portlet:param name="mvcPath" value="/Form_di_segnalazione_Edit.jsp"/> --%>
</portlet:actionURL>
<liferay-ui:success key="success" message="successkey"/>

<%--<%=request.getParameter("formID") %> --%>
<%-- <%
form_di_segnalazione frm=form_di_segnalazioneLocalServiceUtil.getform_di_segnalazione(new Long(request.getParameter("formID")).longValue());
System.out.println(frm);
%> --%>
<style> 
tr{ //text-align:center; font-family: Arial Unicode MS, Lucida Sans Unicode, sans-serif; font-weight:bold; font-size:13px; } .row{ margin-bottom: 4px; } .border_cols{ border: 1px solid; } 

</style>
<aui:form name="fm" id="fm" action="${updateRecord}">  
<aui:input name="formID" type="hidden" value='<%=frm.getForm_di_segnalazione_id()+"" %>' /> 
<div id="header">
		<img src="<%=request.getContextPath() %>/images/formImg_2_1500x.jpg" width="100%" height="100px"></img>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-right: 3%;">
			<span style="font-weight: bold">1. INIZIALI PAZIENTE</span> <br>&nbsp&nbsp
			Nome-Connome<br> &nbsp&nbsp<input id="INIZIALI_1"  value="<%=frm.getINIZIALI_1()%>" type="text" style="max-width: 115px"
				name="<portlet:namespace/>INIZIALI_1">
		</div>
		<div id="second" style="padding-right: 3%;">
			<span style="font-weight: bold">2. DATA di NASCITA o ETÀ </span><br> <br> &nbsp&nbsp<input style="max-width: 100px"
				id="DATA_2" placeholder="dd/mm/yyyy"  value="<%=frm.getDATA_2()%>" type="text" name="<portlet:namespace/>DATA_2">
		</div>
		<div id="third" style="padding-right: 3%;">
			<span style="font-weight: bold">3. SESSO</span> <br> <br> M&nbsp&nbsp<input type="radio" id="SESSO_3"
				name="<portlet:namespace/>SESSO_3" style="outline:<%=frm.getSESSO_3().contains("M")?"none":""%>" <%=frm.getSESSO_3().contains("M")?"checked":""%>   value="M"> F&nbsp&nbsp<input
				id="SESSO_3" style="outline:<%=frm.getSESSO_3().contains("F")?"none":""%>" <%=frm.getSESSO_3().contains("F")?"checked":""%>   type="radio" name="<portlet:namespace/>SESSO_3"
				value="F">
		</div>
		<div id="forth" style="padding-right: 3%;">
			<span style="font-weight: bold">4. DATA INSORGENZA <br>&nbsp&nbsp&nbsp&nbspREAZIONE</span> <br> &nbsp&nbsp<input
				id="DATA_4" placeholder="dd/mm/yyyy"  value="<%=frm.getDATA_4()%>" style="max-width: 100px" type="text" name="<portlet:namespace/>DATA_4">
		</div>
		<div id="fifth" style="padding-right: 3%;">
			<span style="font-weight: bold">5. ORIGINE ETNICA</span> <br> <br> &nbsp&nbsp<input type="text"  value="<%=frm.getORIGINE_5()%>" style="max-width: 115px"
				id="ORIGINE_5" name="<portlet:namespace/>ORIGINE_5">
		</div>
		<div id="sixth">
			<span style="font-weight: bold">CODICE SEGNALAZIONE </span><br> <br> &nbsp&nbsp<input type="text" style="max-width: 115px"
				id="CODICE"  value="<%=frm.getCODICE()%>" required name="<portlet:namespace/>CODICE">
		</div>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-right: 3%;">
			<span style="font-weight: bold">1.a. PESO (kg) </span><br> <br> &nbsp&nbsp<input type="text" style="max-width: 100px"
				id="INIZIALI_1_a"  value="<%=frm.getINIZIALI_1_a()%>"  name="<portlet:namespace/>INIZIALI_1_a">
		</div>
		<div id="second" style="padding-right: 3%;">
			<span style="font-weight: bold">1.b. ALTEZZA (cm) </span><br> <br> &nbsp&nbsp<input type="text" style="max-width: 100px"
				id="INIZIALI_1_b"  value="<%=frm.getINIZIALI_1_b()%>" name="<portlet:namespace/>INIZIALI_1_b">
		</div>
		<div id="third" style="padding-right: 3%;">
			<span style="font-weight: bold">1.c. DATA ULTIMA<br>&nbsp&nbsp MESTRUAZIONE</span>  <br> &nbsp&nbsp<input style="max-width: 100px"
				id="INIZIALI_1_c" placeholder="dd/mm/yyyy" type="text"  value="<%=frm.getINIZIALI_1_c()%>"
				name="<portlet:namespace/>INIZIALI_1_c">
		</div>
		<div id="forth">
			<span style="font-weight: bold">1.d. GRAVIDANZA </span><br> <br> 
			&nbsp&nbsp<input type="radio"
				id="INIZIALI_1_d" name="<portlet:namespace/>INIZIALI_1_d"
				style="outline:<%=frm.getINIZIALI_1_d().contains("1° trimestre")?"none":""%>" <%=frm.getINIZIALI_1_d().contains("1° trimestre")?"checked":""%>   
				value="1° trimester" >1° trimester&nbsp&nbsp<input
				id="INIZIALI_1_d" type="radio"
				style="outline:<%=frm.getINIZIALI_1_d().contains("2° trimestre")?"none":""%>"  <%=frm.getINIZIALI_1_d().contains("2° trimestre")?"checked":"" %>  
				name="<portlet:namespace/>INIZIALI_1_d" value="2° trimester">2°
			trimester
		</div>
		<div id="fifth" style="padding-right: 3%;">
			<br> &nbsp&nbsp<input id="INIZIALI_1_d" type="radio"
						name="<portlet:namespace/>INIZIALI_1_d"  style="outline:<%=frm.getINIZIALI_1_d().contains("sconosciuta")?"none":""%>" <%=frm.getINIZIALI_1_d().contains("sconosciuta")?"checked":""%>  value="sconosciuta">sconosciuta
			<br> &nbsp&nbsp<input id="INIZIALI_1_d" type="radio"
			style="outline:<%=frm.getINIZIALI_1_d().contains("3° trimester")?"none":""%>" <%=frm.getINIZIALI_1_d().contains("3° trimester")?"checked":"" %>  
				name="<portlet:namespace/>INIZIALI_1_d" value="3° trimester">3°
			trimester
		</div>
		
		<div id="sixth">
			<span style="font-weight: bold">1.e. ALLATTAMENTO </span><br> <br> &nbsp&nbsp<input type="radio"
				style="outline:<%=frm.getINIZIALI_1_e().contains("SI")?"none":""%>" <%=frm.getINIZIALI_1_e().contains("SI")?"checked":""%>  
				name="<portlet:namespace/>INIZIALI_1_e" value="SI">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>INIZIALI_1_e"
			style="outline:<%=frm.getINIZIALI_1_e().contains("NO")?"none":""%>" <%=frm.getINIZIALI_1_e().contains("NO")?"checked":""%>  
				value="NO">NO
		</div>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">6. DESCRIZIONE DELLA REAZIONE ED EVENTUALE DIAGNOSI</span> (*se il
			segnalatore è un medico) <br>
			<textarea id="DESCRIZIONE_6" rows="5" style="width: 100%" name="<portlet:namespace/>DESCRIZIONE_6" ><%=frm.getDESCRIZIONE_6()%>
				</textarea>
		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">7. INDICARE SE LA REAZIONE OSSERVATA DERIVA DA:</span> <br> &nbsp&nbsp<input
				type="radio" id="INDICARE_7_1"
				style="outline:<%=frm.getINDICARE_7_1().equalsIgnoreCase("")?"":"none"%>"  <%=frm.getINDICARE_7_1().contains("INTERAZIONE")?"checked":""%> 
				name="<portlet:namespace/>INDICARE_7_1" value="INTERAZIONE">INTERAZIONE
			&nbsp&nbsp<input type="radio" id="INDICARE_7_2"
			style="outline:<%=frm.getINDICARE_7_2().equalsIgnoreCase("")?"":"none"%>" <%=frm.getINDICARE_7_2().equalsIgnoreCase("")?"":"checked"%> 
				name="<portlet:namespace/>INDICARE_7_2" value="ERRORE"
				style="padding-left: 85px">ERRORE TERAPEUTICO<br> &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>INDICARE_7_3"
				style="outline:<%=frm.getINDICARE_7_3().equalsIgnoreCase("")?"":"none"%>" <%=frm.getINDICARE_7_3().contains("ABUSO")?"checked":""%> 
				id="INDICARE_7_3" value="ABUSO">ABUSO &nbsp&nbsp<input type="radio"
				style="outline:<%=frm.getINDICARE_7_4().equalsIgnoreCase("")?"":"none"%>" <%=frm.getINDICARE_7_4().equalsIgnoreCase("")?"":"checked"%> 
				name="<portlet:namespace/>INDICARE_7_4" id="INDICARE_7_4"
				value="MISUSO" style="padding-left: 122px">MISUSO<br> &nbsp&nbsp<input
				style="outline:<%=frm.getINDICARE_7_5().equalsIgnoreCase("")?"":"none"%>" <%=frm.getINDICARE_7_5().contains("OFF LABEL")?"checked":""%> 
				type="radio" name="<portlet:namespace/>INDICARE_7_5"
				id="INDICARE_7_5" value="OFF LABEL">OFF LABEL &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>INDICARE_7_6"
				style="outline:<%=frm.getINDICARE_7_6().equalsIgnoreCase("")?"":"none"%>" <%=frm.getINDICARE_7_6().equalsIgnoreCase("")?"":"checked"%> 
				id="INDICARE_7_6" value="OVERDOSE" style="padding-left: 100px">OVERDOSE<br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>INDICARE_7_7"
			style="outline:<%=frm.getINDICARE_7_7().equalsIgnoreCase("")?"":"none"%>" <%=frm.getINDICARE_7_7().contains("ESPOSIZIONE PROFESSIONALE")?"checked":""%> 
				id="INDICARE_7_7" value="ESPOSIZIONE PROFESSIONALE">ESPOSIZIONE
			PROFESSIONALE
		</div>

		<div id="second" style="padding-left: 2%;">
			<span style="font-weight: bold">8. GRAVITA' DELLA REAZIONE: </span><br> <span style="font-weight: bold">GRAVE</span><br> &nbsp&nbsp<input
			style="outline:<%=frm.getGRAVITA_8_1().equalsIgnoreCase("")?"":"none"%>" <%=frm.getGRAVITA_8_1().equalsIgnoreCase("")?"":"checked"%> 
				type="radio" name="<portlet:namespace/>GRAVITA_8_1" id="GRAVITA_8_1"
				value="DECESSO">DECESSO &nbsp&nbsp<input type="radio"
				style="outline:<%=frm.getGRAVITA_8_2().equalsIgnoreCase("")?"":"none"%>" <%=frm.getGRAVITA_8_2().equalsIgnoreCase("")?"":"checked"%> 
				name="<portlet:namespace/>GRAVITA_8_2" id="GRAVITA_8_2"
				value="OSPEDALIZZAZIONE O PROLUNGAMENTO" style="padding-left: 240px">OSPEDALIZZAZIONE
			O PROLUNGAMENTO<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>GRAVITA_8_3" id="GRAVITA_8_3"
				style="outline:<%=frm.getGRAVITA_8_3().equalsIgnoreCase("")?"":"none"%>" <%=frm.getGRAVITA_8_3().equalsIgnoreCase("")?"":"checked"%> 
				value="INVALIDITA' GRAVE O PERMANENTE">INVALIDITA' GRAVE O
			PERMANENTE &nbsp&nbsp<input type="radio" name="<portlet:namespace/>GRAVITA_8_4"
			style="outline:<%=frm.getGRAVITA_8_4().equalsIgnoreCase("")?"":"none"%>" <%=frm.getGRAVITA_8_4().equalsIgnoreCase("")?"":"checked"%> 
				id="GRAVITA_8_4 value=" HA MESSO IN PERICOLO DI
				VITA"
				style="padding-left: 86px">HA MESSO IN PERICOLO
			DI VITA<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>GRAVITA_8_5" id="GRAVITA_8_5"
				style="outline:<%=frm.getGRAVITA_8_5().equalsIgnoreCase("")?"":"none"%>" <%=frm.getGRAVITA_8_5().equalsIgnoreCase("")?"":"checked"%> 
				value="ANOMALIE	CONGENITE/DEFICIT NEL NEONATO ">ANOMALIE
			CONGENITE/DEFICIT NEL NEONATO &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>GRAVITA_8_6"
				style="outline:<%=frm.getGRAVITA_8_6().equalsIgnoreCase("")?"":"none"%>" <%=frm.getGRAVITA_8_6().equalsIgnoreCase("")?"":"checked"%> 
				value="ALTRA CONDIZIONE CLINICAMENTE RILEVANTE"
				style="padding-left: 23px"> ALTRA CONDIZIONE CLINICAMENTE
			RILEVANTE<br> &nbsp&nbsp<input type="radio" id="GRAVITA_8_7"
			style="outline:<%=frm.getGRAVITA_8_7().equalsIgnoreCase("")?"":"none"%>" <%=frm.getGRAVITA_8_7().equalsIgnoreCase("")?"":"checked"%> 
				name="<portlet:namespace/>GRAVITA_8_7" value="NON GRAVE"> <span style="font-weight: bold">NON
				GRAVE</span>

		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">9. EVENTUALI ESAMI DI LABORATORIO RILEVANTI PER ADR </span><br>(riportare
			risultati e date in cui gli accertamenti sono stati eseguiti): <br>
			<textarea rows="5" style="width: 100%" name="EVENTUALI_9" id="EVENTUALI_9"
				form="usrform"
><%=frm.getEVENTUALI_9()%></textarea>
			<br> <br>  <span style="font-weight: bold">11. AZIONI
				INTRAPRESE</span> (specificare): <br>
			<textarea rows="5" style="width: 100%" name="AZIONI_11" id="AZIONI_11"
				form="usrform" ><%=frm.getAZIONI_11()%>
</textarea>


		</div>


		<div id="second" style="padding-left: 15%;">
			<span style="font-weight: bold">10. ESITO DATA:</span> &nbsp&nbsp<input type="text" id="ESITO_10"
			 value="<%=frm.getESITO_10()%>"
				name="<portlet:namespace/>ESITO_10"> <br> &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>ESITO_10_1" id=ESITO_10_1
				style="outline:<%=frm.getESITO_10_1().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_1().equalsIgnoreCase("")?"":"checked"%> 
				value="RISOLUZIONE COMPLETA ADR">RISOLUZIONE COMPLETA ADR <br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>ESITO_10_2"
			style="outline:<%=frm.getESITO_10_2().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_2().equalsIgnoreCase("")?"":"checked"%> 
				id="ESITO_10_2" value="RISOLUZIONE CON POSTUMI">RISOLUZIONE
			CON POSTUMI<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_3" id="ESITO_10_3"
				style="outline:<%=frm.getESITO_10_3().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_3().equalsIgnoreCase("")?"":"checked"%> 
				value="MIGLIORAMENTO">MIGLIORAMENTO <br> &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>ESITO_10_4" id="ESITO_10_4"
				style="outline:<%=frm.getESITO_10_4().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_4().equalsIgnoreCase("")?"":"checked"%> 
				value="REAZIONE INVARIATA O PEGGIORATA">REAZIONE INVARIATA O
			PEGGIORATA<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_5" id="ESITO_10_5"
				style="outline:<%=frm.getESITO_10_5().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_5().equalsIgnoreCase("")?"":"checked"%> 
				value="DECESSO">DECESSO<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_6" id="ESITO_10_6"
				style="outline:<%=frm.getESITO_10_6().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_6().equalsIgnoreCase("")?"":"checked"%> 
				value="dovuto alla reazione avversa" style="padding-left: 100px;">
			dovuto alla reazione avversa<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_7" id="ESITO_10_7"
				style="outline:<%=frm.getESITO_10_7().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_7().equalsIgnoreCase("")?"":"checked"%> 
				value="il farmaco può avere contribuito"
				style="padding-left: 100px;"> il farmaco può avere
			contribuito<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_8" id="ESITO_10_8"
				style="outline:<%=frm.getESITO_10_8().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_8().equalsIgnoreCase("")?"":"checked"%> 
				value="non dovuto al farmaco" style="padding-left: 100px;">
			non dovuto al farmaco<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_9" id="ESITO_10_9"
				style="outline:<%=frm.getESITO_10_9().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_9().equalsIgnoreCase("")?"":"checked"%> 
				value="causa sconosciuta" style="padding-left: 100px;">
			causa sconosciuta<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_10" id="ESITO_10_10"
				<%=frm.getESITO_10_10().equalsIgnoreCase("")?"":"checked"%>  style="outline:<%=frm.getESITO_10_10().equalsIgnoreCase("")?"":"none"%>" <%=frm.getESITO_10_9().equalsIgnoreCase("")?"":"checked"%> 
				value="NON DISPONIBILE"> NON DISPONIBILE
		</div>
		<!-- <br> <p style="padding-left: 500px; padding-top: 20px">In caso di
				sospensione compilare i campi da 17 a 20</p>   -->
		<div style="clear: both"></div>
	</div>
	<img src="<%=request.getContextPath() %>/images/middle-1.jpg" width="100%" height="30px"></img>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">12. FARMACO/I SOSPETTO/I</span> (indicare il nome della specialità
			medicinale o del generico*). Riportare il numero di lotto per vaccini
			e medicinali biologici<br> <br> A)&nbsp&nbsp<input type="text"
			id="FARMACO_12_a"   value="<%=frm.getFARMACO_12_a()%>" name="<portlet:namespace/>FARMACO_12_a">
			&nbsp&nbsp&nbsp&nbsp 13. LOTTO &nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_a_13()%>"
				name="<portlet:namespace/>FARMACO_12_a_13" id="FARMACO_12_a_13">
			&nbsp&nbsp&nbsp&nbsp 14. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
				type="text" name="<portlet:namespace/>FARMACO_12_a_14"
				 value="<%=frm.getFARMACO_12_a_14()%>"
				id="FARMACO_12_a_14"><br> <br> 15. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_a_15()%>"
				name="<portlet:namespace/>FARMACO_12_a_15" id="FARMACO_12_a_15">&nbsp&nbsp&nbsp
			16. DURATA DELL'USO: &nbsp DAL&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_a_16_1()%>"
				name="<portlet:namespace/>FARMACO_12_a_16_1" id="FARMACO_12_a_16_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_12_a_16_2"
			 value="<%=frm.getFARMACO_12_a_16_2()%>"
				id="FARMACO_12_a_16_2"><br> <br> 17. IL FARMACO E
			STATO SOSPESO? &nbsp&nbsp<input type="radio"
			style="outline:<%=frm.getFARMACO_12_a_17().contains("SI")?"none":""%>" <%=frm.getFARMACO_12_a_17().contains("SI")?"checked":""%> 
				name="<portlet:namespace/>FARMACO_12_a_17" id="FARMACO_12_a_17"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				style="outline:<%=frm.getFARMACO_12_a_17().contains("NO")?"none":""%>" <%=frm.getFARMACO_12_a_17().contains("NO")?"checked":""%> 
				type="radio" name="<portlet:namespace/>FARMACO_12_a_17"
				id="FARMACO_12_a_17" value="NO" style="padding-left: 10px;" >NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 18. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
			 style="outline:<%=frm.getFARMACO_12_a_18().contains("SI")?"none":""%>" <%=frm.getFARMACO_12_a_18().contains("SI")?"checked":""%> 
				name="<portlet:namespace/>FARMACO_12_a_18" id="FARMACO_12_a_18"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_a_18"
				style="outline:<%=frm.getFARMACO_12_a_18().contains("NO")?"none":""%>" <%=frm.getFARMACO_12_a_18().contains("NO")?"checked":""%> 
				id="FARMACO_12_a_18" value="No" style="padding-left: 10px;">NO
			<br> <br> 19. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_a_19"
				 <%=frm.getFARMACO_12_a_19().contains("SI")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_a_19().contains("SI")?"none":""%>"
				id="FARMACO_12_a_19" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_12_a_19"
			style="outline:<%=frm.getFARMACO_12_a_19().contains("NO")?"none":""%>" <%=frm.getFARMACO_12_a_19().contains("NO")?"checked":""%> 
				id="FARMACO_12_a_19" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 20. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_a_20" id="FARMACO_12_a_20"
				style="outline:<%=frm.getFARMACO_12_a_20().contains("SI")?"none":""%>" <%=frm.getFARMACO_12_a_20().contains("SI")?"checked":""%> 
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				style="outline:<%=frm.getFARMACO_12_a_20().contains("NO")?"none":""%>" <%=frm.getFARMACO_12_a_20().contains("NO")?"checked":""%> 
				type="radio" name="<portlet:namespace/>FARMACO_12_a_20"
				id="FARMACO_12_a_20" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> B)&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_b()%>"
				name="<portlet:namespace/>FARMACO_12_b" id="FARMACO_12_b">
			&nbsp&nbsp&nbsp&nbsp 13. LOTTO &nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_b_13()%>"
				name="<portlet:namespace/>FARMACO_12_b_13" id="FARMACO_12_b_13">
			&nbsp&nbsp&nbsp&nbsp 14. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
				type="text" name="<portlet:namespace/>FARMACO_12_b_14"
				 value="<%=frm.getFARMACO_12_b_14()%>"
				id="FARMACO_12_b_14"><br> <br> 15. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_b_15()%>"
				name="<portlet:namespace/>FARMACO_12_b_15" id="FARMACO_12_b_15">&nbsp&nbsp&nbsp
			16. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_b_16_1()%>"
				name="<portlet:namespace/>FARMACO_12_b_16_1" id="FARMACO_12_b_16_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_12_b_16_2"
			 value="<%=frm.getFARMACO_12_b_16_2()%>"
				id="FARMACO_12_b_16_2"><br> 17. IL FARMACO E STATO
			SOSPESO? &nbsp&nbsp<input type="radio"
			style="outline:<%=frm.getFARMACO_12_b_17().contains("SI")?"none":""%>" <%=frm.getFARMACO_12_b_17().contains("SI")?"checked":""%> 
				name="<portlet:namespace/>FARMACO_12_b_17" id="FARMACO_12_b_17"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_17"
				style="outline:<%=frm.getFARMACO_12_b_17().contains("NO")?"none":""%>"  <%=frm.getFARMACO_12_b_17().contains("NO")?"checked":""%> 
				id="FARMACO_12_b_17" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 18. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_b_18" id="FARMACO_12_b_18"
				style="outline:<%=frm.getFARMACO_12_b_18().contains("SI")?"none":""%>"  <%=frm.getFARMACO_12_b_18().contains("SI")?"checked":""%> 
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_18" value="NO"
				<%=frm.getFARMACO_12_b_18().contains("NO")?"checked":""%>  style="outline:<%=frm.getFARMACO_12_b_18().contains("NO")?"none":""%>" 
				id="FARMACO_12_b_18" style="padding-left: 10px;">NO <br>
			<br> 19. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_b_19" id="FARMACO_12_b_19"
				style="outline:<%=frm.getFARMACO_12_b_19().contains("SI")?"none":""%>"  <%=frm.getFARMACO_12_b_19().contains("SI")?"checked":""%> 
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_19" value="NO"
				<%=frm.getFARMACO_12_b_19().contains("NO")?"checked":""%>   style="outline:<%=frm.getFARMACO_12_b_19().contains("NO")?"none":""%>"
				id="FARMACO_12_b_19" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 20. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_b_20" id="FARMACO_12_b_20"
				style="outline:<%=frm.getFARMACO_12_b_20().contains("SI")?"none":""%>"  <%=frm.getFARMACO_12_b_20().contains("SI")?"checked":""%> 
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_20"
				<%=frm.getFARMACO_12_b_20().contains("NO")?"checked":""%>   style="outline:<%=frm.getFARMACO_12_b_20().contains("NO")?"none":""%>"
				id="FARMACO_12_b_20" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> C)&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_c()%>"
				name="<portlet:namespace/>FARMACO_12_c">
			&nbsp&nbsp&nbsp&nbsp 13. LOTTO &nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_c_13()%>"
				name="<portlet:namespace/>FARMACO_12_c_13" id="FARMACO_12_c_13">
			&nbsp&nbsp&nbsp&nbsp 14. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
			 value="<%=frm.getFARMACO_12_b_14()%>"
				type="text" name="<portlet:namespace/>FARMACO_12_c_14"
				id="FARMACO_12_c_14"><br> <br> 15. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_c_15()%>"
				name="<portlet:namespace/>FARMACO_12_c_15" id="FARMACO_12_c_15">&nbsp&nbsp&nbsp
			16. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_12_c_16_1()%>"
				name="<portlet:namespace/>FARMACO_12_c_16_1" id="FARMACO_12_c_16_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_12_c_16_2"
				 value="<%=frm.getFARMACO_12_c_16_2()%>"
				id="FARMACO_12_c_16_2"><br> <br> 17. IL FARMACO E
			STATO SOSPESO? &nbsp&nbsp<input type="radio"
			<%=frm.getFARMACO_12_c_17().contains("SI")?"checked":""%>   style="outline:<%=frm.getFARMACO_12_c_17().contains("SI")?"none":""%>"
				name="<portlet:namespace/>FARMACO_12_c_17" id="FARMACO_12_c_17"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_12_c_17().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_c_17().contains("NO")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_12_c_17" value="NO"
				id="FARMACO_12_c_17" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 18. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_c_18" value="SI"
				<%=frm.getFARMACO_12_c_18().contains("SI")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_c_18().contains("SI")?"none":""%>"
				id="FARMACO_12_c_18" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_12_c_18().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_c_18().contains("NO")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_12_c_18"
				id="FARMACO_12_c_18" value="NO" style="padding-left: 10px;">NO
			<br> <br> 19. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
			<%=frm.getFARMACO_12_c_19().contains("SI")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_c_19().contains("SI")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_12_c_19"
				id="FARMACO_12_c_19" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_12_c_19"
			<%=frm.getFARMACO_12_c_19().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_c_19().contains("NO")?"none":""%>"
				id="FARMACO_12_c_19" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 20. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_c_20" id="FARMACO_12_c_20"
				<%=frm.getFARMACO_12_c_20().contains("SI")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_c_20().contains("SI")?"none":""%>"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_12_c_20().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_12_c_20().contains("NO")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_12_c_20"
				id="FARMACO_12_c_20" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> * Nel caso di vaccini specificare anche
			il numero di dosi e/o di richiamo, lora e il sito della
			somministrazione
		</div>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">21. INDICAZIONI O ALTRO MOTIVO PER CUI IL FARMACO È STATO
				USATO</span> (le lettere fanno riferimento ai farmaci indicati
			precedentemente):<br> <br> <span style="font-weight: bold">A:</span> &nbsp&nbsp<input type="text"
			 value="<%=frm.getINDICAZIONI_21_a()%>"
				name="<portlet:namespace/>INDICAZIONI_21_a" id="INDICAZIONI_21_a"><br>
			<br> <span style="font-weight: bold">B:</span> &nbsp&nbsp<input type="text"
			 value="<%=frm.getINDICAZIONI_21_b()%>"
				name="<portlet:namespace/>INDICAZIONI_21_b" id="INDICAZIONI_21_b"><br>
			<br> <span style="font-weight: bold">C:</span> &nbsp&nbsp<input type="text"
			 value="<%=frm.getINDICAZIONI_21_c()%>"
				name="<portlet:namespace/>INDICAZIONI_21_c" id="INDICAZIONI_21_c"><br>
		</div>
		<div style="clear: both"></div>
	</div>


	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">22. FARMACO/I SOSPETTO/I</span> (indicare il nome della specialità
			medicinale o del generico*). Riportare il numero di lotto per vaccini
			e medicinali biologici<br> <br> A)&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_a()%>"
				name="<portlet:namespace/>FARMACO_22_a" id="FARMACO_22_a">
			&nbsp&nbsp&nbsp&nbsp 23. LOTTO &nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_a_23()%>"
				name="<portlet:namespace/>FARMACO_22_a_23" id="FARMACO_22_a_23">
			&nbsp&nbsp&nbsp&nbsp 24. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
			 value="<%=frm.getFARMACO_22_a_24()%>"
				type="text" name="<portlet:namespace/>FARMACO_22_a_24"
				id="FARMACO_22_a_24"><br> <br> 25. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_a_25()%>"
				name="<portlet:namespace/>FARMACO_22_a_25" id="FARMACO_22_a_25">&nbsp&nbsp&nbsp
			26. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_a_26_1()%>
				name="<portlet:namespace/>FARMACO_22_a_26_1" id="FARMACO_22_a_26_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_22_a_26_2"
			 value="<%=frm.getFARMACO_22_a_26_2()%>"
				id="FARMACO_22_a_26_2"><br> <br> 27. IL FARMACO E
			STATO SOSPESO? &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_22_a_27" id="FARMACO_22_a_27"
				style="outline:<%=frm.getFARMACO_22_a_27().contains("SI")?"none":""%>" <%=frm.getFARMACO_22_a_27().contains("SI")?"checked":""%>
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_a_27().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_22_a_27().contains("NO")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_a_27" value="NO"
				style="padding-left: 10px;">NO &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 28. LA REAZIONE E
			MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
			  style="outline:<%=frm.getFARMACO_22_a_28().contains("SI")?"none":""%>" <%=frm.getFARMACO_22_a_28().contains("SI")?"checked":""%>
				name="<portlet:namespace/>FARMACO_22_a_28" value="SI"
				id="FARMACO_22_a_28" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_22_a_28"
				<%=frm.getFARMACO_22_a_28().contains("NO")?"checked":""%>     style="outline:<%=frm.getFARMACO_22_a_28().contains("NO")?"none":""%>"
				id="FARMACO_22_a_28" value="NO" style="padding-left: 10px;">NO
			<br> <br> 29. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
			  style="outline:<%=frm.getFARMACO_22_a_29().contains("SI")?"none":""%>" <%=frm.getFARMACO_22_a_29().contains("SI")?"checked":""%>
				type="radio" name="<portlet:namespace/>FARMACO_22_a_29"
				id="FARMACO_22_a_29" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_22_a_29"
			<%=frm.getFARMACO_22_a_29().contains("NO")?"checked":""%>     style="outline:<%=frm.getFARMACO_22_a_29().contains("NO")?"none":""%>"
				id="FARMACO_22_a_29" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 30. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
			  style="outline:<%=frm.getFARMACO_22_a_30().contains("SI")?"none":""%>" <%=frm.getFARMACO_22_a_30().contains("SI")?"checked":""%>
				name="<portlet:namespace/>FARMACO_22_a_30" value="SI"
				id="FARMACO_22_a_30" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_a_30().contains("NO")?"checked":""%>     style="outline:<%=frm.getFARMACO_22_a_30().contains("NO")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_a_30"
				id="FARMACO_22_a_30" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> B)&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_b()%>"
				name="<portlet:namespace/>FARMACO_22_b" id="FARMACO_22_b">
			&nbsp&nbsp&nbsp&nbsp 23. LOTTO &nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_b_23()%>"
				name="<portlet:namespace/>FARMACO_22_b_23" id="FARMACO_22_b_23">
			&nbsp&nbsp&nbsp&nbsp 24. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
			 value="<%=frm.getFARMACO_22_b_24()%>"
				type="text" name="<portlet:namespace/>FARMACO_22_b_24"
				id="FARMACO_22_b_24"><br> <br> 25. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_b_25()%>"
				name="<portlet:namespace/>FARMACO_22_b_25" id="FARMACO_22_b_25">&nbsp&nbsp&nbsp
			26. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			 value="<%=frm.getFARMACO_22_b_26_1()%>"
				name="<portlet:namespace/>FARMACO_22_b_26_1" id="FARMACO_22_b_26_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_22_b_26_2"
			 value="<%=frm.getFARMACO_22_b_26_2()%>"
				id="FARMACO_22_b_26_2"><br> 27. IL FARMACO E STATO
			SOSPESO? &nbsp&nbsp<input type="radio"
			  style="outline:<%=frm.getFARMACO_22_b_27().contains("SI")?"none":""%>" <%=frm.getFARMACO_22_b_27().contains("SI")?"checked":""%>
				name="<portlet:namespace/>FARMACO_22_b_27" id="FARMACO_22_b_27"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_b_27().contains("NO")?"checked":""%>      style="outline:<%=frm.getFARMACO_22_b_27().contains("NO")?"none":""%>" 
				type="radio" name="<portlet:namespace/>FARMACO_22_b_27"
				id="FARMACO_22_b_27" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 28. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
			<%=frm.getFARMACO_22_b_28().contains("SI")?"checked":""%>      style="outline:<%=frm.getFARMACO_22_b_28().contains("SI")?"none":""%>" 
				name="<portlet:namespace/>FARMACO_22_b_28" id="FARMACO_22_b_28"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_b_28().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_22_b_28().contains("NO")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_b_28"
				id="FARMACO_22_b_28" value="NO" style="padding-left: 10px;">NO
			<br> <br> 29. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
			<%=frm.getFARMACO_22_b_29().contains("SI")?"checked":""%>      style="outline:<%=frm.getFARMACO_22_b_29().contains("SI")?"none":""%>" 
				type="radio" name="<portlet:namespace/>FARMACO_22_b_29"
				id="FARMACO_22_b_29" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_22_b_29"
			<%=frm.getFARMACO_22_b_29().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_22_b_29().contains("NO")?"none":""%>"
				id="FARMACO_22_b_29" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 30. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
			<%=frm.getFARMACO_22_b_30().contains("SI")?"checked":""%>      style="outline:<%=frm.getFARMACO_22_b_30().contains("SI")?"none":""%>" 
				name="<portlet:namespace/>FARMACO_22_b_30" id="FARMACO_22_b_30"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_b_30().contains("NO")?"checked":""%>    style="outline:<%=frm.getFARMACO_22_b_30().contains("NO")?"none":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_b_30"
				id="FARMACO_22_b_30" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> * Nel caso di vaccini specificare anche
			il numero di dosi e/o di richiamo, lora e il sito della
			somministrazione<br> <br> <span style="font-weight: bold">31. INDICAZIONI O ALTRO
				MOTIVO PER CUI IL FARMACO È STATO USATO</span> (le lettere fanno
			riferimento ai farmaci indicati qui sopra):<br> <br> <span style="font-weight: bold">A:</span>&nbsp&nbsp<input
				type="text" name="<portlet:namespace/>INDICAZIONI_31_a"
				 value="<%=frm.getINDICAZIONI_31_a()%>"
				id="INDICAZIONI_31_a">&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <span style="font-weight: bold">B:</span>&nbsp&nbsp<input type="text"
			 value="<%=frm.getINDICAZIONI_31_b()%>"
				name="<portlet:namespace/>INDICAZIONI_31_b" id="INDICAZIONI_31_b">

		</div>
		<div style="clear: both"></div>
	</div>


	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">32. USO CONCOMITANTE DI ALTRI PRODOTTI A BASE DI PIANTE
				OFFICINALI, INTEGRATORI ALIMENTARI,</span> ecc. (specificare):<br> <br>
			<textarea rows="5"  style="width: 100%" name="<portlet:namespace/>USO_32"
				id="USO_32"><%=frm.getUSO_32() %>
</textarea>
		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">33. CONDIZIONI PREDISPONENTI e/o CONCOMITANTI</span> (se il farmaco
			sospetto è un vaccino riportare l'anamnesi ed eventuali vaccini
			somministrati nelle 4 settimane precedenti alla somministrazione)<br>
			<br>
			<textarea rows="5" style="width: 66%"
				name="<portlet:namespace/>CONDIZIONI_33" id="CONDIZIONI_33"><%=frm.getCONDIZIONI_33() %>
</textarea>
		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">34. ALTRE INFORMAZIONI </span><br> <br>
			<textarea style="width: 440%" rows="5"  name="<portlet:namespace/>ALTRE_34"
				id="ALTRE_34"><%=frm.getALTRE_34() %>
</textarea>
		</div>
		<div style="clear: both"></div>
	</div>

	<img src="<%=request.getContextPath() %>/images/endimg.jpg" width="100%" height="30px"></img>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">35. INDICARE SE LA REAZIONE E' STATA OSSERVATA NELL'AMBITO DI:</span>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>INDICARE_35_1"
			<%=frm.getINDICARE_35_1().equalsIgnoreCase("")?"":"checked"%>   style="outline:<%=frm.getINDICARE_35_1().equalsIgnoreCase("")?"":"none"%>" 
				id="INDICARE_35_1" value="Progetto di Farmacovigilanza Attiva"
				style="padding-left: 2%;">Progetto di Farmacovigilanza
			Attiva &nbsp&nbsp<input type="radio" name="<portlet:namespace/>INDICARE_35_2"
			<%=frm.getINDICARE_35_2().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getINDICARE_35_2().equalsIgnoreCase("")?"":"none"%>"
				value="Registro Farmaci" style="padding-left: 2%;">Registro
			Farmaci <br> <br> <input type="radio"
				name="<portlet:namespace/>INDICARE_35_3" id="INDICARE_35_3"
				<%=frm.getINDICARE_35_3().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getINDICARE_35_3().equalsIgnoreCase("")?"":"none"%>"
				value="Studio Osservazionale" style="padding-left: 0%;"> <span style="font-weight: bold">Studio
				Osservazionale,</span> specificare: <span style="font-weight: bold">titolo studio</span>&nbsp&nbsp<input type="text" style="max-width: 100px"
				 value="<%=frm.getINDICARE_35_4()%>"
				name="<portlet:namespace/>INDICARE_35_4" id="INDICARE_35_4">&nbsp&nbsp&nbsp&nbsp
			<span style="font-weight: bold">tipologia</span>&nbsp&nbsp<input type="text" style="max-width: 100px"
			 value="<%=frm.getINDICARE_35_5()%>"
				name="<portlet:namespace/>INDICARE_35_5" id="INDICARE_35_5">
			&nbsp&nbsp&nbsp&nbsp <span style="font-weight: bold">numero</span>&nbsp&nbsp<input type="text" style="max-width: 100px"
			 value="<%=frm.getINDICARE_35_6()%>"
				name="<portlet:namespace/>INDICARE_35_6" id="INDICARE_35_6">
		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<table>
		<tr>
		<td>
		<div id="first" style="padding-top: 0%;padding-right:1px;">
			<span style="font-weight: bold;">36. QUALIFICA DEL SEGNALATORE</span> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>QUALIFICA_36_1" id="QUALIFICA_36_1"
				<%=frm.getQUALIFICA_36_1().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_1().equalsIgnoreCase("")?"":"none"%>"
				value="MEDICO	OSPEDALIERO" style="padding-left: 10px;">MEDICO
			OSPEDALIERO<br> <br> &nbsp&nbsp<input type="radio"
			<%=frm.getQUALIFICA_36_2().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_2().equalsIgnoreCase("")?"":"none"%>"
				name="<portlet:namespace/>QUALIFICA_36_2"
				value="MEDICO MEDICINA GENERALE" id="QUALIFICA_36_2"
				style="padding-left: 10px;"> MEDICO MEDICINA GENERALE &nbsp&nbsp<input
				<%=frm.getQUALIFICA_36_3().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_3().equalsIgnoreCase("")?"":"none"%>"
				type="radio" name="<portlet:namespace/>QUALIFICA_36_3"
				id="QUALIFICA_36_3" value="PEDIATRA LIBERA SCELTA"
				style="padding-left: 10px;"> PEDIATRA LIBERA SCELTA<br>
			<br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_4"
			<%=frm.getQUALIFICA_36_4().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_4().equalsIgnoreCase("")?"":"none"%>"
				id="QUALIFICA_36_4" value="SPECIALISTA" style="padding-left: 10px;">SPECIALISTA
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_5"
			<%=frm.getQUALIFICA_36_5().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_5().equalsIgnoreCase("")?"":"none"%>"
				id="QUALIFICA_36_5" value="MEDICO DISTRETTO"
				style="padding-left: 115px;"> MEDICO DISTRETTO<br> <br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_6"
			<%=frm.getQUALIFICA_36_6().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_6().equalsIgnoreCase("")?"":"none"%>"
				id="QUALIFICA_36_6" value="FARMACISTA" style="padding-left: 10px;">FARMACISTA
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_7"
			<%=frm.getQUALIFICA_36_7().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_7().equalsIgnoreCase("")?"":"none"%>"
				id="QUALIFICA_36_7" value="INFERMIERE" style="padding-left: 115px;">INFERMIERE<br>
			<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>QUALIFICA_36_8" id="QUALIFICA_36_8"
				<%=frm.getQUALIFICA_36_8().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_8().equalsIgnoreCase("")?"":"none"%>"
				value="CAV" style="padding-left: 10px;"> CAV &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>QUALIFICA_36_9"
				<%=frm.getQUALIFICA_36_9().equalsIgnoreCase("")?"":"checked"%>    style="outline:<%=frm.getQUALIFICA_36_9().equalsIgnoreCase("")?"":"none"%>"
				id="QUALIFICA_36_9" value="female" style="padding-left: 30px;">
			ALTRO (specificare):&nbsp&nbsp<input type="text"
			 value="<%=frm.getQUALIFICA_36_10()%>"
				name="<portlet:namespace/>QUALIFICA_36_10" id="QUALIFICA_36_10">
		</div>
		
		
		</td>
		
		<td>
		<div id="second" style="padding-left: 2%;border-left: 1px solid lightgray;">
			<span style="font-weight: bold;">37. DATI DEL SEGNALATORE</span> (i dati del segnalatore sono trattati
			in modo confidenziale)<br> <br> NOME E COGNOME: &nbsp&nbsp<input
			 value="<%=frm.getDATI_37_1()%>"
				type="text" name="<portlet:namespace/>DATI_37_1" id="DATI_37_1"><br>
			<br> <br> INDIRIZZO:&nbsp&nbsp<input type="text"
			 value="<%=frm.getDATI_37_2()%>"
				name="<portlet:namespace/>DATI_37_2" id="DATI_37_2"><br>
			<br> <br> TEL E FAX:&nbsp&nbsp<input type="text"
			 value="<%=frm.getDATI_37_3()%>"
				name="<portlet:namespace/>DATI_37_3"  style="max-width: 150px" id="DATI_37_3">
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp &nbsp E-MAIL: &nbsp&nbsp<input
			 value="<%=frm.getDATI_37_4()%>"
				type="text" name="<portlet:namespace/>DATI_37_4"  style="max-width: 150px" id="DATI_37_4">
		</div>
		
		</td>
		</tr>
		</table>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">38. ASL DI APPARTENENZA:</span> &nbsp&nbsp<input type="text"
			 value="<%=frm.getASL_38()%>"
				name="<portlet:namespace/>ASL_38" id="ASL_38">

		</div>
		<div id="second" style="padding-left: 13%;">
			<span style="font-weight: bold">39. REGIONE:</span>&nbsp&nbsp<input type="text"
			 value="<%=frm.getREGIONE_39()%>"
				name="<portlet:namespace/>REGIONE_39" id="REGIONE_39">
		</div>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">40. DATA DI COMPILAZIONE:</span> &nbsp&nbsp<input type="text"
			placeholder="dd/mm/yyyy"  value="<%=frm.getDATA_40()%>"
				name="<portlet:namespace/>DATA_40" id="DATA_40">

		</div>
		<div id="second" style="padding-left: 13%;">
			<span style="font-weight: bold">41. FIRMA DEL SEGNALATORE</span>&nbsp&nbsp<input type="text"
			 value="<%=frm.getFIRMA_41()%>"
				name="<portlet:namespace/>FIRMA_41" id="FIRMA_41">
		</div>
		<div style="clear: both"></div>
	</div>
	
	
<div class='container_di' style="height: auto; padding: 15px;">
<div style="text-align: right;width: 100%">

<aui:button value="Update" style="width:200px;background-color:#f08000;color:white; height:40px" onClick="javascript:showAddNoteDialog();"/> 

</div>
<div style="clear:both"></div>
</div>
	</aui:form>
	<!-- For alert Box -->
 <div class="yui3-skin-sam">
  <div id="modal"></div>
</div> 

<script>

$("#fm").submit(function(e) {
    e.preventDefault();
});

function showAddNoteDialog(){

  
   YUI().use('aui-modal', function(Y) {
       var modal = new Y.Modal(
         {
           bodyContent: '<label for="feedback/suggestions" ><liferay-ui:message key="Areyouwanttosubmitform"/></label>',
           centered: true,
           headerContent: '<h3><label for="formsofinteraction"><liferay-ui:message key="ConfirmationBox"/></label></h3>',
           modal: true,
           render: '#modal',
           width: 500
         }
       ).render();
        modal.addToolbar(
              [
                {
                  label: '<liferay-ui:message key="Cancel"/>',
                  on: {
                    click: function() {
                     modal.hide();
                    }
                  }
                },
                {
                   label: '<liferay-ui:message key="Submit"/>',
                   on: {
                     click: function() {
                      modal.hide();
                      var inputs = document.getElementsByTagName('input');
                      var flag=true;
                      for(var i = 0; i < inputs.length; i++) {
                          if(inputs[i].type.toLowerCase() == 'text') {
                        	  if(inputs[i].value==''){
                              if(inputs[i].name=="<portlet:namespace/>INIZIALI_1")
                        	  {
                            	  inputs[i].style.backgroundColor = "red";
                            	  inputs[i].focus();
                            	  flag=false;
                            	//  alert(inputs[i].value);
                              }
                              if(inputs[i].name=="<portlet:namespace/>CODICE")
                        	  {
                            	  inputs[i].style.backgroundColor = "red";
                            	  inputs[i].focus();
                            	  flag=false;
                            	//  alert(inputs[i].value);
                              }
                        	}
                          }
                      }
						
                      if(flag==true){
                    	document.getElementById("<portlet:namespace/>fm").submit();
						}
                     }
                   }
                 },
                ]
       );
     }
   );
    }
    
function <portlet:namespace />savePolicySettings() {
	submitForm(document.<portlet:namespace />fm);
}
</script>


 

	