<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="init.jsp" %>
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

<%--<%=request.getParameter("formID") %> --%>
<%
form_di_segnalazione frm=form_di_segnalazioneLocalServiceUtil.getform_di_segnalazione(new Long(request.getParameter("formID")).longValue());
System.out.println(frm);
%>
<style> 
tr{ //text-align:center; font-family: Arial Unicode MS, Lucida Sans Unicode, sans-serif; font-weight:bold; font-size:13px; } .row{ margin-bottom: 4px; } .border_cols{ border: 1px solid; } 

</style> 
<div id="header">
		<img src="<%=request.getContextPath() %>/images/formImg_2_1500x.jpg" width="100%" height="100px"></img>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-right: 3%;">
			<span style="font-weight: bold">1. INIZIALI PAZIENTE</span> <br>&nbsp&nbsp
			Nome-Connome<br> &nbsp&nbsp<input id="INIZIALI_1" readonly="readonly" value="<%=frm.getINIZIALI_1()%>" type="text" style="max-width: 115px"
				name="<portlet:namespace/>INIZIALI_1">
		</div>
		<div id="second" style="padding-right: 3%;">
			<span style="font-weight: bold">2. DATA di NASCITA o ETÀ </span><br> <br> &nbsp&nbsp<input style="max-width: 100px"
				id="DATA_2" placeholder="dd/mm/yyyy" readonly="readonly" value="<%=frm.getDATA_2()%>" type="text" name="<portlet:namespace/>DATA_2">
		</div>
		<div id="third" style="padding-right: 3%;">
			<span style="font-weight: bold">3. SESSO</span> <br> <br> M&nbsp&nbsp<input type="radio" id="SESSO_3"
				name="<portlet:namespace/>SESSO_3" style="outline:<%=frm.getSESSO_3().contains("M")?"2px solid red;":""%>" <%=frm.getSESSO_3().contains("M")?"checked":""%> disabled  value="M"> F&nbsp&nbsp<input
				id="SESSO_3" style="outline:<%=frm.getSESSO_3().contains("F")?"2px solid red;":""%>" <%=frm.getSESSO_3().contains("F")?"checked":""%> disabled  type="radio" name="<portlet:namespace/>SESSO_3"
				value="F">
		</div>
		<div id="forth" style="padding-right: 3%;">
			<span style="font-weight: bold">4. DATA INSORGENZA <br>&nbsp&nbsp&nbsp&nbspREAZIONE</span> <br> &nbsp&nbsp<input
				id="DATA_4" placeholder="dd/mm/yyyy" readonly="readonly" value="<%=frm.getDATA_4()%>" style="max-width: 100px" type="text" name="<portlet:namespace/>DATA_4">
		</div>
		<div id="fifth" style="padding-right: 3%;">
			<span style="font-weight: bold">5. ORIGINE ETNICA</span> <br> <br> &nbsp&nbsp<input type="text" readonly="readonly" value="<%=frm.getORIGINE_5()%>" style="max-width: 115px"
				id="ORIGINE_5" name="<portlet:namespace/>ORIGINE_5">
		</div>
		<div id="sixth">
			<span style="font-weight: bold">CODICE SEGNALAZIONE </span><br> <br> &nbsp&nbsp<input type="text" style="max-width: 115px"
				id="CODICE" readonly="readonly" value="<%=frm.getCODICE()%>" required name="<portlet:namespace/>CODICE">
		</div>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-right: 3%;">
			<span style="font-weight: bold">1.a. PESO (kg) </span><br> <br> &nbsp&nbsp<input type="text" style="max-width: 100px"
				id="INIZIALI_1_a" readonly="readonly" value="<%=frm.getINIZIALI_1_a()%>"  name="<portlet:namespace/>INIZIALI_1_a">
		</div>
		<div id="second" style="padding-right: 3%;">
			<span style="font-weight: bold">1.b. ALTEZZA (cm) </span><br> <br> &nbsp&nbsp<input type="text" style="max-width: 100px"
				id="INIZIALI_1_b" readonly="readonly" value="<%=frm.getINIZIALI_1_b()%>" name="<portlet:namespace/>INIZIALI_1_b">
		</div>
		<div id="third" style="padding-right: 3%;">
			<span style="font-weight: bold">1.c. DATA ULTIMA<br>&nbsp&nbsp MESTRUAZIONE</span>  <br> &nbsp&nbsp<input style="max-width: 100px"
				id="INIZIALI_1_c" type="text" readonly="readonly" value="<%=frm.getINIZIALI_1_c()%>"
				name="<portlet:namespace/>INIZIALI_1_c">
		</div>
		<div id="forth">
			<span style="font-weight: bold">1.d. GRAVIDANZA </span><br> <br> 
			&nbsp&nbsp<input type="radio"
				id="INIZIALI_1_d" name="<portlet:namespace/>INIZIALI_1_d"
				style="outline:<%=frm.getINIZIALI_1_d().contains("1° trimestre")?"2px solid red;":""%>" <%=frm.getINIZIALI_1_d().contains("1° trimestre")?"checked":""%>  disabled="disabled" 
				value="1° trimester" >1° trimester&nbsp&nbsp<input
				id="INIZIALI_1_d" type="radio"
				style="outline:<%=frm.getINIZIALI_1_d().contains("2° trimestre")?"2px solid red;":""%>"  <%=frm.getINIZIALI_1_d().contains("2° trimestre")?"checked":"" %>  disabled="disabled"
				name="<portlet:namespace/>INIZIALI_1_d" value="2° trimester">2°
			trimester
		</div>
		<div id="fifth" style="padding-right: 3%;">
			<br> &nbsp&nbsp<input id="INIZIALI_1_d" type="radio"
						name="<portlet:namespace/>INIZIALI_1_d"  style="outline:<%=frm.getINIZIALI_1_d().contains("sconosciuta")?"2px solid red;":""%>" <%=frm.getINIZIALI_1_d().contains("sconosciuta")?"checked":""%> disabled="disabled" value="sconosciuta">sconosciuta
			<br> &nbsp&nbsp<input id="INIZIALI_1_d" type="radio"
			style="outline:<%=frm.getINIZIALI_1_d().contains("3° trimester")?"2px solid red;":""%>" <%=frm.getINIZIALI_1_d().contains("3° trimester")?"checked":"" %>  disabled="disabled"
				name="<portlet:namespace/>INIZIALI_1_d" value="3° trimester">3°
			trimester
		</div>
		
		<div id="sixth">
			<span style="font-weight: bold">1.e. ALLATTAMENTO </span><br> <br> &nbsp&nbsp<input type="radio"
				style="outline:<%=frm.getINIZIALI_1_e().contains("SI")?"2px solid red;":""%>" <%=frm.getINIZIALI_1_e().contains("SI")?"checked":""%>  disabled="disabled"
				name="<portlet:namespace/>INIZIALI_1_e" value="SI">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>INIZIALI_1_e"
			style="outline:<%=frm.getINIZIALI_1_e().contains("NO")?"2px solid red;":""%>" <%=frm.getINIZIALI_1_e().contains("NO")?"checked":""%>  disabled="disabled"
				value="NO">NO
		</div>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">6. DESCRIZIONE DELLA REAZIONE ED EVENTUALE DIAGNOSI</span> (*se il
			segnalatore è un medico) <br>
			<textarea id="DESCRIZIONE_6" rows="5" style="width: 100%" name="<portlet:namespace/>DESCRIZIONE_6" readonly="readonly"><%=frm.getDESCRIZIONE_6()%>
				</textarea>
		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">7. INDICARE SE LA REAZIONE OSSERVATA DERIVA DA:</span> <br> &nbsp&nbsp<input
				type="radio" id="INDICARE_7_1"
				style="outline:<%=frm.getINDICARE_7_1().equalsIgnoreCase("")?"":"2px solid red;"%>"  <%=frm.getINDICARE_7_1().contains("INTERAZIONE")?"checked":""%> disabled
				name="<portlet:namespace/>INDICARE_7_1" value="INTERAZIONE">INTERAZIONE
			&nbsp&nbsp<input type="radio" id="INDICARE_7_2"
			style="outline:<%=frm.getINDICARE_7_2().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getINDICARE_7_2().equalsIgnoreCase("")?"":"checked"%> disabled
				name="<portlet:namespace/>INDICARE_7_2" value="ERRORE"
				style="padding-left: 85px">ERRORE TERAPEUTICO<br> &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>INDICARE_7_3"
				style="outline:<%=frm.getINDICARE_7_3().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getINDICARE_7_3().contains("ABUSO")?"checked":""%> disabled
				id="INDICARE_7_3" value="ABUSO">ABUSO &nbsp&nbsp<input type="radio"
				style="outline:<%=frm.getINDICARE_7_4().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getINDICARE_7_4().equalsIgnoreCase("")?"":"checked"%> disabled
				name="<portlet:namespace/>INDICARE_7_4" id="INDICARE_7_4"
				value="MISUSO" style="padding-left: 122px">MISUSO<br> &nbsp&nbsp<input
				style="outline:<%=frm.getINDICARE_7_5().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getINDICARE_7_5().contains("OFF LABEL")?"checked":""%> disabled
				type="radio" name="<portlet:namespace/>INDICARE_7_5"
				id="INDICARE_7_5" value="OFF LABEL">OFF LABEL &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>INDICARE_7_6"
				style="outline:<%=frm.getINDICARE_7_6().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getINDICARE_7_6().equalsIgnoreCase("")?"":"checked"%> disabled
				id="INDICARE_7_6" value="OVERDOSE" style="padding-left: 100px">OVERDOSE<br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>INDICARE_7_7"
			style="outline:<%=frm.getINDICARE_7_7().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getINDICARE_7_7().contains("ESPOSIZIONE PROFESSIONALE")?"checked":""%> disabled
				id="INDICARE_7_7" value="ESPOSIZIONE PROFESSIONALE">ESPOSIZIONE
			PROFESSIONALE
		</div>

		<div id="second" style="padding-left: 2%;">
			<span style="font-weight: bold">8. GRAVITA' DELLA REAZIONE: </span><br> <span style="font-weight: bold">GRAVE</span><br> &nbsp&nbsp<input
			style="outline:<%=frm.getGRAVITA_8_1().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getGRAVITA_8_1().equalsIgnoreCase("")?"":"checked"%> disabled
				type="radio" name="<portlet:namespace/>GRAVITA_8_1" id="GRAVITA_8_1"
				value="DECESSO">DECESSO &nbsp&nbsp<input type="radio"
				style="outline:<%=frm.getGRAVITA_8_2().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getGRAVITA_8_2().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				name="<portlet:namespace/>GRAVITA_8_2" id="GRAVITA_8_2"
				value="OSPEDALIZZAZIONE O PROLUNGAMENTO" style="padding-left: 240px">OSPEDALIZZAZIONE
			O PROLUNGAMENTO<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>GRAVITA_8_3" id="GRAVITA_8_3"
				style="outline:<%=frm.getGRAVITA_8_3().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getGRAVITA_8_3().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="INVALIDITA' GRAVE O PERMANENTE">INVALIDITA' GRAVE O
			PERMANENTE &nbsp&nbsp<input type="radio" name="<portlet:namespace/>GRAVITA_8_4"
			style="outline:<%=frm.getGRAVITA_8_4().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getGRAVITA_8_4().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				id="GRAVITA_8_4 value=" HA MESSO IN PERICOLO DI
				VITA"
				style="padding-left: 86px">HA MESSO IN PERICOLO
			DI VITA<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>GRAVITA_8_5" id="GRAVITA_8_5"
				style="outline:<%=frm.getGRAVITA_8_5().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getGRAVITA_8_5().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="ANOMALIE	CONGENITE/DEFICIT NEL NEONATO ">ANOMALIE
			CONGENITE/DEFICIT NEL NEONATO &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>GRAVITA_8_6"
				style="outline:<%=frm.getGRAVITA_8_6().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getGRAVITA_8_6().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="ALTRA CONDIZIONE CLINICAMENTE RILEVANTE"
				style="padding-left: 23px"> ALTRA CONDIZIONE CLINICAMENTE
			RILEVANTE<br> &nbsp&nbsp<input type="radio" id="GRAVITA_8_7"
			style="outline:<%=frm.getGRAVITA_8_7().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getGRAVITA_8_7().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
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
readonly="readonly"><%=frm.getEVENTUALI_9()%></textarea>
			<br> <br>  <span style="font-weight: bold">11. AZIONI
				INTRAPRESE</span> (specificare): <br>
			<textarea rows="5" style="width: 100%" name="AZIONI_11" id="AZIONI_11"
				form="usrform" readonly="readonly"><%=frm.getAZIONI_11()%>
</textarea>


		</div>


		<div id="second" style="padding-left: 15%;">
			<span style="font-weight: bold">10. ESITO DATA:</span> &nbsp&nbsp<input type="text" id="ESITO_10"
			readonly="readonly" value="<%=frm.getESITO_10()%>"
				name="<portlet:namespace/>ESITO_10"> <br> &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>ESITO_10_1" id=ESITO_10_1
				style="outline:<%=frm.getESITO_10_1().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_1().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="RISOLUZIONE COMPLETA ADR">RISOLUZIONE COMPLETA ADR <br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>ESITO_10_2"
			style="outline:<%=frm.getESITO_10_2().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_2().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				id="ESITO_10_2" value="RISOLUZIONE CON POSTUMI">RISOLUZIONE
			CON POSTUMI<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_3" id="ESITO_10_3"
				style="outline:<%=frm.getESITO_10_3().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_3().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="MIGLIORAMENTO">MIGLIORAMENTO <br> &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>ESITO_10_4" id="ESITO_10_4"
				style="outline:<%=frm.getESITO_10_4().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_4().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="REAZIONE INVARIATA O PEGGIORATA">REAZIONE INVARIATA O
			PEGGIORATA<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_5" id="ESITO_10_5"
				style="outline:<%=frm.getESITO_10_5().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_5().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="DECESSO">DECESSO<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_6" id="ESITO_10_6"
				style="outline:<%=frm.getESITO_10_6().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_6().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="dovuto alla reazione avversa" style="padding-left: 100px;">
			dovuto alla reazione avversa<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_7" id="ESITO_10_7"
				style="outline:<%=frm.getESITO_10_7().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_7().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="il farmaco può avere contribuito"
				style="padding-left: 100px;"> il farmaco può avere
			contribuito<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_8" id="ESITO_10_8"
				style="outline:<%=frm.getESITO_10_8().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_8().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="non dovuto al farmaco" style="padding-left: 100px;">
			non dovuto al farmaco<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_9" id="ESITO_10_9"
				style="outline:<%=frm.getESITO_10_9().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_9().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
				value="causa sconosciuta" style="padding-left: 100px;">
			causa sconosciuta<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>ESITO_10_10" id="ESITO_10_10"
				<%=frm.getESITO_10_10().equalsIgnoreCase("")?"":"checked"%> disabled="disabled" style="outline:<%=frm.getESITO_10_10().equalsIgnoreCase("")?"":"2px solid red;"%>" <%=frm.getESITO_10_9().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"
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
			id="FARMACO_12_a"  readonly="readonly" value="<%=frm.getFARMACO_12_a()%>" name="<portlet:namespace/>FARMACO_12_a">
			&nbsp&nbsp&nbsp&nbsp 13. LOTTO &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_a_13()%>"
				name="<portlet:namespace/>FARMACO_12_a_13" id="FARMACO_12_a_13">
			&nbsp&nbsp&nbsp&nbsp 14. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
				type="text" name="<portlet:namespace/>FARMACO_12_a_14"
				readonly="readonly" value="<%=frm.getFARMACO_12_a_14()%>"
				id="FARMACO_12_a_14"><br> <br> 15. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_a_15()%>"
				name="<portlet:namespace/>FARMACO_12_a_15" id="FARMACO_12_a_15">&nbsp&nbsp&nbsp
			16. DURATA DELL'USO: &nbsp DAL&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_a_16_1()%>"
				name="<portlet:namespace/>FARMACO_12_a_16_1" id="FARMACO_12_a_16_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_12_a_16_2"
			readonly="readonly" value="<%=frm.getFARMACO_12_a_16_2()%>"
				id="FARMACO_12_a_16_2"><br> <br> 17. IL FARMACO E
			STATO SOSPESO? &nbsp&nbsp<input type="radio"
			style="outline:<%=frm.getFARMACO_12_a_17().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_12_a_17().contains("SI")?"checked":""%> disabled="disabled"
				name="<portlet:namespace/>FARMACO_12_a_17" id="FARMACO_12_a_17"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				style="outline:<%=frm.getFARMACO_12_a_17().contains("NO")?"2px solid red;":""%>" <%=frm.getFARMACO_12_a_17().contains("NO")?"checked":""%> disabled="disabled"
				type="radio" name="<portlet:namespace/>FARMACO_12_a_17"
				id="FARMACO_12_a_17" value="NO" style="padding-left: 10px;" disabled="disabled">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 18. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
			 style="outline:<%=frm.getFARMACO_12_a_18().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_12_a_18().contains("SI")?"checked":""%> disabled="disabled"
				name="<portlet:namespace/>FARMACO_12_a_18" id="FARMACO_12_a_18"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_a_18"
				style="outline:<%=frm.getFARMACO_12_a_18().contains("NO")?"2px solid red;":""%>" <%=frm.getFARMACO_12_a_18().contains("NO")?"checked":""%> disabled="disabled"
				id="FARMACO_12_a_18" value="No" style="padding-left: 10px;">NO
			<br> <br> 19. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_a_19"
				 <%=frm.getFARMACO_12_a_19().contains("SI")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_a_19().contains("SI")?"2px solid red;":""%>"
				id="FARMACO_12_a_19" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_12_a_19"
			style="outline:<%=frm.getFARMACO_12_a_19().contains("NO")?"2px solid red;":""%>" <%=frm.getFARMACO_12_a_19().contains("NO")?"checked":""%> disabled="disabled"
				id="FARMACO_12_a_19" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 20. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_a_20" id="FARMACO_12_a_20"
				style="outline:<%=frm.getFARMACO_12_a_20().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_12_a_20().contains("SI")?"checked":""%> disabled="disabled"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				style="outline:<%=frm.getFARMACO_12_a_20().contains("NO")?"2px solid red;":""%>" <%=frm.getFARMACO_12_a_20().contains("NO")?"checked":""%> disabled="disabled"
				type="radio" name="<portlet:namespace/>FARMACO_12_a_20"
				id="FARMACO_12_a_20" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> B)&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_b()%>"
				name="<portlet:namespace/>FARMACO_12_b" id="FARMACO_12_b">
			&nbsp&nbsp&nbsp&nbsp 13. LOTTO &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_b_13()%>"
				name="<portlet:namespace/>FARMACO_12_b_13" id="FARMACO_12_b_13">
			&nbsp&nbsp&nbsp&nbsp 14. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
				type="text" name="<portlet:namespace/>FARMACO_12_b_14"
				readonly="readonly" value="<%=frm.getFARMACO_12_b_14()%>"
				id="FARMACO_12_b_14"><br> <br> 15. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_b_15()%>"
				name="<portlet:namespace/>FARMACO_12_b_15" id="FARMACO_12_b_15">&nbsp&nbsp&nbsp
			16. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_b_16_1()%>"
				name="<portlet:namespace/>FARMACO_12_b_16_1" id="FARMACO_12_b_16_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_12_b_16_2"
			readonly="readonly" value="<%=frm.getFARMACO_12_b_16_2()%>"
				id="FARMACO_12_b_16_2"><br> 17. IL FARMACO E STATO
			SOSPESO? &nbsp&nbsp<input type="radio"
			style="outline:<%=frm.getFARMACO_12_b_17().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_12_b_17().contains("SI")?"checked":""%> disabled="disabled"
				name="<portlet:namespace/>FARMACO_12_b_17" id="FARMACO_12_b_17"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_17"
				style="outline:<%=frm.getFARMACO_12_b_17().contains("NO")?"2px solid red;":""%>"  <%=frm.getFARMACO_12_b_17().contains("NO")?"checked":""%> disabled="disabled"
				id="FARMACO_12_b_17" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 18. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_b_18" id="FARMACO_12_b_18"
				style="outline:<%=frm.getFARMACO_12_b_18().contains("SI")?"2px solid red;":""%>"  <%=frm.getFARMACO_12_b_18().contains("SI")?"checked":""%> disabled="disabled"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_18" value="NO"
				<%=frm.getFARMACO_12_b_18().contains("NO")?"checked":""%>  style="outline:<%=frm.getFARMACO_12_b_18().contains("NO")?"2px solid red;":""%>" disabled="disabled"
				id="FARMACO_12_b_18" style="padding-left: 10px;">NO <br>
			<br> 19. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_b_19" id="FARMACO_12_b_19"
				style="outline:<%=frm.getFARMACO_12_b_19().contains("SI")?"2px solid red;":""%>"  <%=frm.getFARMACO_12_b_19().contains("SI")?"checked":""%> disabled="disabled"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_19" value="NO"
				<%=frm.getFARMACO_12_b_19().contains("NO")?"checked":""%> disabled="disabled"  style="outline:<%=frm.getFARMACO_12_b_19().contains("NO")?"2px solid red;":""%>"
				id="FARMACO_12_b_19" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 20. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_b_20" id="FARMACO_12_b_20"
				style="outline:<%=frm.getFARMACO_12_b_20().contains("SI")?"2px solid red;":""%>"  <%=frm.getFARMACO_12_b_20().contains("SI")?"checked":""%> disabled="disabled"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_12_b_20"
				<%=frm.getFARMACO_12_b_20().contains("NO")?"checked":""%> disabled="disabled"  style="outline:<%=frm.getFARMACO_12_b_20().contains("NO")?"2px solid red;":""%>"
				id="FARMACO_12_b_20" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> C)&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_c()%>"
				name="<portlet:namespace/>FARMACO_12_c">
			&nbsp&nbsp&nbsp&nbsp 13. LOTTO &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_c_13()%>"
				name="<portlet:namespace/>FARMACO_12_c_13" id="FARMACO_12_c_13">
			&nbsp&nbsp&nbsp&nbsp 14. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
			readonly="readonly" value="<%=frm.getFARMACO_12_b_14()%>"
				type="text" name="<portlet:namespace/>FARMACO_12_c_14"
				id="FARMACO_12_c_14"><br> <br> 15. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_c_15()%>"
				name="<portlet:namespace/>FARMACO_12_c_15" id="FARMACO_12_c_15">&nbsp&nbsp&nbsp
			16. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_12_c_16_1()%>"
				name="<portlet:namespace/>FARMACO_12_c_16_1" id="FARMACO_12_c_16_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_12_c_16_2"
				readonly="readonly" value="<%=frm.getFARMACO_12_c_16_2()%>"
				id="FARMACO_12_c_16_2"><br> <br> 17. IL FARMACO E
			STATO SOSPESO? &nbsp&nbsp<input type="radio"
			<%=frm.getFARMACO_12_c_17().contains("SI")?"checked":""%> disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_17().contains("SI")?"2px solid red;":""%>"
				name="<portlet:namespace/>FARMACO_12_c_17" id="FARMACO_12_c_17"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_12_c_17().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_17().contains("NO")?"2px solid red;":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_12_c_17" value="NO"
				id="FARMACO_12_c_17" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 18. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_c_18" value="SI"
				<%=frm.getFARMACO_12_c_18().contains("SI")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_18().contains("SI")?"2px solid red;":""%>"
				id="FARMACO_12_c_18" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_12_c_18().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_18().contains("NO")?"2px solid red;":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_12_c_18"
				id="FARMACO_12_c_18" value="NO" style="padding-left: 10px;">NO
			<br> <br> 19. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
			<%=frm.getFARMACO_12_c_19().contains("SI")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_19().contains("SI")?"2px solid red;":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_12_c_19"
				id="FARMACO_12_c_19" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_12_c_19"
			<%=frm.getFARMACO_12_c_19().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_19().contains("NO")?"2px solid red;":""%>"
				id="FARMACO_12_c_19" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 20. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_12_c_20" id="FARMACO_12_c_20"
				<%=frm.getFARMACO_12_c_20().contains("SI")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_20().contains("SI")?"2px solid red;":""%>"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_12_c_20().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_12_c_20().contains("NO")?"2px solid red;":""%>"
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
			readonly="readonly" value="<%=frm.getINDICAZIONI_21_a()%>"
				name="<portlet:namespace/>INDICAZIONI_21_a" id="INDICAZIONI_21_a"><br>
			<br> <span style="font-weight: bold">B:</span> &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getINDICAZIONI_21_b()%>"
				name="<portlet:namespace/>INDICAZIONI_21_b" id="INDICAZIONI_21_b"><br>
			<br> <span style="font-weight: bold">C:</span> &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getINDICAZIONI_21_c()%>"
				name="<portlet:namespace/>INDICAZIONI_21_c" id="INDICAZIONI_21_c"><br>
		</div>
		<div style="clear: both"></div>
	</div>


	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">22. FARMACO/I SOSPETTO/I</span> (indicare il nome della specialità
			medicinale o del generico*). Riportare il numero di lotto per vaccini
			e medicinali biologici<br> <br> A)&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_a()%>"
				name="<portlet:namespace/>FARMACO_22_a" id="FARMACO_22_a">
			&nbsp&nbsp&nbsp&nbsp 23. LOTTO &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_a_23()%>"
				name="<portlet:namespace/>FARMACO_22_a_23" id="FARMACO_22_a_23">
			&nbsp&nbsp&nbsp&nbsp 24. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
			readonly="readonly" value="<%=frm.getFARMACO_22_a_24()%>"
				type="text" name="<portlet:namespace/>FARMACO_22_a_24"
				id="FARMACO_22_a_24"><br> <br> 25. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_a_25()%>"
				name="<portlet:namespace/>FARMACO_22_a_25" id="FARMACO_22_a_25">&nbsp&nbsp&nbsp
			26. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_a_26_1()%>
				name="<portlet:namespace/>FARMACO_22_a_26_1" id="FARMACO_22_a_26_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_22_a_26_2"
			readonly="readonly" value="<%=frm.getFARMACO_22_a_26_2()%>"
				id="FARMACO_22_a_26_2"><br> <br> 27. IL FARMACO E
			STATO SOSPESO? &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>FARMACO_22_a_27" id="FARMACO_22_a_27"
				style="outline:<%=frm.getFARMACO_22_a_27().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_22_a_27().contains("SI")?"checked":""%>
				value="SI" style="padding-left: 10px;"  disabled="disabled">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_a_27().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_22_a_27().contains("NO")?"2px solid red;":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_a_27" value="NO"
				style="padding-left: 10px;">NO &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 28. LA REAZIONE E
			MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
			disabled="disabled"  style="outline:<%=frm.getFARMACO_22_a_28().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_22_a_28().contains("SI")?"checked":""%>
				name="<portlet:namespace/>FARMACO_22_a_28" value="SI"
				id="FARMACO_22_a_28" style="padding-left: 10px;">SI &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>FARMACO_22_a_28"
				<%=frm.getFARMACO_22_a_28().contains("NO")?"checked":""%>   disabled="disabled"  style="outline:<%=frm.getFARMACO_22_a_28().contains("NO")?"2px solid red;":""%>"
				id="FARMACO_22_a_28" value="NO" style="padding-left: 10px;">NO
			<br> <br> 29. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
			disabled="disabled"  style="outline:<%=frm.getFARMACO_22_a_29().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_22_a_29().contains("SI")?"checked":""%>
				type="radio" name="<portlet:namespace/>FARMACO_22_a_29"
				id="FARMACO_22_a_29" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_22_a_29"
			<%=frm.getFARMACO_22_a_29().contains("NO")?"checked":""%>   disabled="disabled"  style="outline:<%=frm.getFARMACO_22_a_29().contains("NO")?"2px solid red;":""%>"
				id="FARMACO_22_a_29" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 30. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
			disabled="disabled"  style="outline:<%=frm.getFARMACO_22_a_30().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_22_a_30().contains("SI")?"checked":""%>
				name="<portlet:namespace/>FARMACO_22_a_30" value="SI"
				id="FARMACO_22_a_30" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_a_30().contains("NO")?"checked":""%>   disabled="disabled"  style="outline:<%=frm.getFARMACO_22_a_30().contains("NO")?"2px solid red;":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_a_30"
				id="FARMACO_22_a_30" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> B)&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_b()%>"
				name="<portlet:namespace/>FARMACO_22_b" id="FARMACO_22_b">
			&nbsp&nbsp&nbsp&nbsp 23. LOTTO &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_b_23()%>"
				name="<portlet:namespace/>FARMACO_22_b_23" id="FARMACO_22_b_23">
			&nbsp&nbsp&nbsp&nbsp 24. DOSAGGIO/FREQUENZA (specificare)&nbsp&nbsp<input
			readonly="readonly" value="<%=frm.getFARMACO_22_b_24()%>"
				type="text" name="<portlet:namespace/>FARMACO_22_b_24"
				id="FARMACO_22_b_24"><br> <br> 25. VIA DI
			SOMMINISTRAZIONE&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_b_25()%>"
				name="<portlet:namespace/>FARMACO_22_b_25" id="FARMACO_22_b_25">&nbsp&nbsp&nbsp
			26. DURATA DELL'USO: &nbspDAL&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFARMACO_22_b_26_1()%>"
				name="<portlet:namespace/>FARMACO_22_b_26_1" id="FARMACO_22_b_26_1">
			AL &nbsp&nbsp<input type="text" name="<portlet:namespace/>FARMACO_22_b_26_2"
			readonly="readonly" value="<%=frm.getFARMACO_22_b_26_2()%>"
				id="FARMACO_22_b_26_2"><br> 27. IL FARMACO E STATO
			SOSPESO? &nbsp&nbsp<input type="radio"
			disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_27().contains("SI")?"2px solid red;":""%>" <%=frm.getFARMACO_22_b_27().contains("SI")?"checked":""%>
				name="<portlet:namespace/>FARMACO_22_b_27" id="FARMACO_22_b_27"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_b_27().contains("NO")?"checked":""%>    disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_27().contains("NO")?"2px solid red;":""%>" 
				type="radio" name="<portlet:namespace/>FARMACO_22_b_27"
				id="FARMACO_22_b_27" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp 28. LA
			REAZIONE E MIGLIORATA DOPO LA SOSPENSIONE?&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp<input type="radio"
			<%=frm.getFARMACO_22_b_28().contains("SI")?"checked":""%>    disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_28().contains("SI")?"2px solid red;":""%>" 
				name="<portlet:namespace/>FARMACO_22_b_28" id="FARMACO_22_b_28"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_b_28().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_28().contains("NO")?"2px solid red;":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_b_28"
				id="FARMACO_22_b_28" value="NO" style="padding-left: 10px;">NO
			<br> <br> 29. IL FARMACO E STATO RIPRESO?&nbsp&nbsp<input
			<%=frm.getFARMACO_22_b_29().contains("SI")?"checked":""%>    disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_29().contains("SI")?"2px solid red;":""%>" 
				type="radio" name="<portlet:namespace/>FARMACO_22_b_29"
				id="FARMACO_22_b_29" value="SI" style="padding-left: 10px;">SI
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>FARMACO_22_b_29"
			<%=frm.getFARMACO_22_b_29().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_29().contains("NO")?"2px solid red;":""%>"
				id="FARMACO_22_b_29" value="NO" style="padding-left: 10px;">NO
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 30. SONO RICOMPARSI I SINTOMI DOPO LA
			RISOMMINISTRAZIONE?&nbsp&nbsp<input type="radio"
			<%=frm.getFARMACO_22_b_30().contains("SI")?"checked":""%>    disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_30().contains("SI")?"2px solid red;":""%>" 
				name="<portlet:namespace/>FARMACO_22_b_30" id="FARMACO_22_b_30"
				value="SI" style="padding-left: 10px;">SI &nbsp&nbsp<input
				<%=frm.getFARMACO_22_b_30().contains("NO")?"checked":""%>  disabled="disabled"  style="outline:<%=frm.getFARMACO_22_b_30().contains("NO")?"2px solid red;":""%>"
				type="radio" name="<portlet:namespace/>FARMACO_22_b_30"
				id="FARMACO_22_b_30" value="NO" style="padding-left: 10px;">NO
			<br> <br> <br> * Nel caso di vaccini specificare anche
			il numero di dosi e/o di richiamo, lora e il sito della
			somministrazione<br> <br> <span style="font-weight: bold">31. INDICAZIONI O ALTRO
				MOTIVO PER CUI IL FARMACO È STATO USATO</span> (le lettere fanno
			riferimento ai farmaci indicati qui sopra):<br> <br> <span style="font-weight: bold">A:</span>&nbsp&nbsp<input
				type="text" name="<portlet:namespace/>INDICAZIONI_31_a"
				readonly="readonly" value="<%=frm.getINDICAZIONI_31_a()%>"
				id="INDICAZIONI_31_a">&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <span style="font-weight: bold">B:</span>&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getINDICAZIONI_31_b()%>"
				name="<portlet:namespace/>INDICAZIONI_31_b" id="INDICAZIONI_31_b">

		</div>
		<div style="clear: both"></div>
	</div>


	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">32. USO CONCOMITANTE DI ALTRI PRODOTTI A BASE DI PIANTE
				OFFICINALI, INTEGRATORI ALIMENTARI,</span> ecc. (specificare):<br> <br>
			<textarea rows="5"  style="width: 100%" name="<portlet:namespace/>USO_32"
				id="USO_32"readonly="readonly"><%=frm.getUSO_32() %>
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
				name="<portlet:namespace/>CONDIZIONI_33" id="CONDIZIONI_33"readonly="readonly"><%=frm.getCONDIZIONI_33() %>
</textarea>
		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">34. ALTRE INFORMAZIONI </span><br> <br>
			<textarea style="width: 440%" rows="5"  name="<portlet:namespace/>ALTRE_34"
				id="ALTRE_34"readonly="readonly"><%=frm.getALTRE_34() %>
</textarea>
		</div>
		<div style="clear: both"></div>
	</div>

	<img src="<%=request.getContextPath() %>/images/endimg.jpg" width="100%" height="30px"></img>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">35. INDICARE SE LA REAZIONE E' STATA OSSERVATA NELL'AMBITO DI:</span>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>INDICARE_35_1"
			<%=frm.getINDICARE_35_1().equalsIgnoreCase("")?"":"checked"%> disabled="disabled"  style="outline:<%=frm.getINDICARE_35_1().equalsIgnoreCase("")?"":"2px solid red;"%>" 
				id="INDICARE_35_1" value="Progetto di Farmacovigilanza Attiva"
				style="padding-left: 2%;">Progetto di Farmacovigilanza
			Attiva &nbsp&nbsp<input type="radio" name="<portlet:namespace/>INDICARE_35_2"
			<%=frm.getINDICARE_35_2().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getINDICARE_35_2().equalsIgnoreCase("")?"":"2px solid red;"%>"
				value="Registro Farmaci" style="padding-left: 2%;">Registro
			Farmaci <br> <br> <input type="radio"
				name="<portlet:namespace/>INDICARE_35_3" id="INDICARE_35_3"
				<%=frm.getINDICARE_35_3().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getINDICARE_35_3().equalsIgnoreCase("")?"":"2px solid red;"%>"
				value="Studio Osservazionale" style="padding-left: 0%;"> <span style="font-weight: bold">Studio
				Osservazionale,</span> specificare: <span style="font-weight: bold">titolo studio</span>&nbsp&nbsp<input type="text" style="max-width: 100px"
				readonly="readonly" value="<%=frm.getINDICARE_35_4()%>"
				name="<portlet:namespace/>INDICARE_35_4" id="INDICARE_35_4">&nbsp&nbsp&nbsp&nbsp
			<span style="font-weight: bold">tipologia</span>&nbsp&nbsp<input type="text" style="max-width: 100px"
			readonly="readonly" value="<%=frm.getINDICARE_35_5()%>"
				name="<portlet:namespace/>INDICARE_35_5" id="INDICARE_35_5">
			&nbsp&nbsp&nbsp&nbsp <span style="font-weight: bold">numero</span>&nbsp&nbsp<input type="text" style="max-width: 100px"
			readonly="readonly" value="<%=frm.getINDICARE_35_6()%>"
				name="<portlet:namespace/>INDICARE_35_6" id="INDICARE_35_6">
		</div>
		<div style="clear: both"></div>
	</div>

	<div class='container_di' style="height: auto; padding: 15px;">
		<table>
		<tr>
		<td>
		<div id="first" style="padding-top: 0%;padding-right:1px;">
			<span style="font-weight: bold">36. QUALIFICA DEL SEGNALATORE</span> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>QUALIFICA_36_1" id="QUALIFICA_36_1"
				<%=frm.getQUALIFICA_36_1().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_1().equalsIgnoreCase("")?"":"2px solid red;"%>"
				value="MEDICO	OSPEDALIERO" style="padding-left: 10px;">MEDICO
			OSPEDALIERO<br> <br> &nbsp&nbsp<input type="radio"
			<%=frm.getQUALIFICA_36_2().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_2().equalsIgnoreCase("")?"":"2px solid red;"%>"
				name="<portlet:namespace/>QUALIFICA_36_2"
				value="MEDICO MEDICINA GENERALE" id="QUALIFICA_36_2"
				style="padding-left: 10px;"> MEDICO MEDICINA GENERALE &nbsp&nbsp<input
				<%=frm.getQUALIFICA_36_3().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_3().equalsIgnoreCase("")?"":"2px solid red;"%>"
				type="radio" name="<portlet:namespace/>QUALIFICA_36_3"
				id="QUALIFICA_36_3" value="PEDIATRA LIBERA SCELTA"
				style="padding-left: 10px;"> PEDIATRA LIBERA SCELTA<br>
			<br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_4"
			<%=frm.getQUALIFICA_36_4().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_4().equalsIgnoreCase("")?"":"2px solid red;"%>"
				id="QUALIFICA_36_4" value="SPECIALISTA" style="padding-left: 10px;">SPECIALISTA
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_5"
			<%=frm.getQUALIFICA_36_5().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_5().equalsIgnoreCase("")?"":"2px solid red;"%>"
				id="QUALIFICA_36_5" value="MEDICO DISTRETTO"
				style="padding-left: 115px;"> MEDICO DISTRETTO<br> <br>
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_6"
			<%=frm.getQUALIFICA_36_6().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_6().equalsIgnoreCase("")?"":"2px solid red;"%>"
				id="QUALIFICA_36_6" value="FARMACISTA" style="padding-left: 10px;">FARMACISTA
			&nbsp&nbsp<input type="radio" name="<portlet:namespace/>QUALIFICA_36_7"
			<%=frm.getQUALIFICA_36_7().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_7().equalsIgnoreCase("")?"":"2px solid red;"%>"
				id="QUALIFICA_36_7" value="INFERMIERE" style="padding-left: 115px;">INFERMIERE<br>
			<br> &nbsp&nbsp<input type="radio"
				name="<portlet:namespace/>QUALIFICA_36_8" id="QUALIFICA_36_8"
				<%=frm.getQUALIFICA_36_8().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_8().equalsIgnoreCase("")?"":"2px solid red;"%>"
				value="CAV" style="padding-left: 10px;"> CAV &nbsp&nbsp<input
				type="radio" name="<portlet:namespace/>QUALIFICA_36_9"
				<%=frm.getQUALIFICA_36_9().equalsIgnoreCase("")?"":"checked"%>  disabled="disabled"  style="outline:<%=frm.getQUALIFICA_36_9().equalsIgnoreCase("")?"":"2px solid red;"%>"
				id="QUALIFICA_36_9" value="female" style="padding-left: 30px;">
			ALTRO (specificare):&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getQUALIFICA_36_10()%>"
				name="<portlet:namespace/>QUALIFICA_36_10" id="QUALIFICA_36_10">
		</div>
		
		
		</td>
		
		<td>
		<div id="second" style="padding-left: 2%;border-left: 1px solid lightgray;">
			<span style="font-weight: bold">37. DATI DEL SEGNALATORE</span> (i dati del segnalatore sono trattati
			in modo confidenziale)<br> <br> NOME E COGNOME: &nbsp&nbsp<input
			readonly="readonly" value="<%=frm.getDATI_37_1()%>"
				type="text" name="<portlet:namespace/>DATI_37_1" id="DATI_37_1"><br>
			<br> <br> INDIRIZZO:&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getDATI_37_2()%>"
				name="<portlet:namespace/>DATI_37_2" id="DATI_37_2"><br>
			<br> <br> TEL E FAX:&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getDATI_37_3()%>"
				name="<portlet:namespace/>DATI_37_3" id="DATI_37_3"  style="max-width: 150px">
			&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp &nbsp E-MAIL: &nbsp&nbsp<input
			readonly="readonly" value="<%=frm.getDATI_37_4()%>"
				type="text" name="<portlet:namespace/>DATI_37_4" id="DATI_37_4"  style="max-width: 150px">
		</div>
		
		</td>
		</tr>
		</table>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">38. ASL DI APPARTENENZA:</span> &nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getASL_38()%>"
				name="<portlet:namespace/>ASL_38" id="ASL_38">

		</div>
		<div id="second" style="padding-left: 13%;">
			<span style="font-weight: bold">39. REGIONE:</span>&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getREGIONE_39()%>"
				name="<portlet:namespace/>REGIONE_39" id="REGIONE_39">
		</div>
		<div style="clear: both"></div>
	</div>
	<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-top: 0%;">
			<span style="font-weight: bold">40. DATA DI COMPILAZIONE:</span> &nbsp&nbsp<input type="text"
			placeholder="dd/mm/yyyy" readonly="readonly" value="<%=frm.getDATA_40()%>"
				name="<portlet:namespace/>DATA_40" id="DATA_40">

		</div>
		<div id="second" style="padding-left: 13%;">
			<span style="font-weight: bold">41. FIRMA DEL SEGNALATORE</span>&nbsp&nbsp<input type="text"
			readonly="readonly" value="<%=frm.getFIRMA_41()%>"
				name="<portlet:namespace/>FIRMA_41" id="FIRMA_41">
		</div>
		<div style="clear: both"></div>
	</div>