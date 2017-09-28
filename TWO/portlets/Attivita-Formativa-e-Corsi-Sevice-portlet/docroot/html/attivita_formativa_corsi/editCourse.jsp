<%@page import="com.liferay.sample.service.suiluppo_courseLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.suiluppo_course"%>
<%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.regex.Pattern"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<link href="<%= request.getContextPath()%>/css/DateTimePicker.min.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/js/DateTimePicker.min.js"></script>
<link href="<%= request.getContextPath()%>/css/on-off-switch.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/js/on-off-switch.js"></script>
<script src="<%= request.getContextPath()%>/js/on-off-switch-onload.js"></script>
<!-- For Date and Time -->
<div id="dtBox"></div>
<script>
$(document).ready(function()
		{
	//Date Time Picker
			$("#dtBox").DateTimePicker({
				language: "it",
		    	dateTimeFormat: "dd-MM-yyyy HH:mm:ss AA",
				dateFormat: "dd-MM-yyyy",
				timeFormat: "HH:mm:ss",
				shortDayNames: ["Dom", "Lun", "Mar", "Mer", "Gio", "Ven", "Sab"],
				fullDayNames: ["Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"],
				shortMonthNames: ["Gen", "Feb", "Mar", "Apr", "Mag", "Giu", "Lug", "Ago", "Set", "Ott", "Nov", "Dic"],
				fullMonthNames: ["Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"],
				titleContentDate: "Imposta Data",
				titleContentTime: "Imposta Ora",
				titleContentDateTime: "Imposta Data & Ora",	
				setButtonContent: "Imposta",
				clearButtonContent: "Pulisci",
				animationDuration: 100
			});
	//For Numeric value
	
  		$(".num-digit").keypress(function (e) {  		
     	//if the letter is not digit then display error and don't type anything
    	 if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        //$("#errmsg").html("Solo cifre").show().fadeOut("slow");
               return false;
    	}});

		});
</script>
<%
final Log logger=LogFactoryUtil.getLog(this.getClass());
suiluppo_course ls=null;
try{
ls=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(request.getParameter("courseId")).longValue());
}catch(Exception e){
logger.info("Object getting for attribute");
ls=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(request.getAttribute("courseId").toString()).longValue());
}
%> 

<liferay-ui:success key="success" message="successkey" />
<portlet:actionURL name="updateSubmit" var="formSubmit">
<%-- <portlet:param name="jspPage" value="/html/attivita_formativa_corsi/editCourse.jsp"/> --%>  
</portlet:actionURL>
<aui:form action="${formSubmit}" enctype="multipart/form-data" method="post" id="fm" name="fm">
<input type="hidden" name="<portlet:namespace/>courseId" value="<%=ls.getCourse_id()%>">
<div style="margin-left:75px">
<table width="80%">
<tbody>
<tr>
<td>Docente<span style="font-size:20px;color:red"><b>*</b></span></td><td><input type="text" id="Docente" name="<portlet:namespace/>Docente"  value="<%=ls.getDocente()%>" class="form-control"  readonly="readonly" style="-webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px;"/>
<br/><span id="_Docente" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Docente</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Evento Progetto<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" style="-webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px;" name="<portlet:namespace/>Evento_Progetto" class="form-control"  value="<%=ls.getEvento_Progetto()%>" id="Evento_Progetto"/>
<br/><span id="_Evento_Progetto" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Evento Progetto</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Titolo<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " name="<portlet:namespace/>Titolo"  class="form-control"   value="<%=ls.getTitolo()%>"  id="Titolo">
<br/><span id="_Titolo" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Titolo</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Descrizione<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " name="<portlet:namespace/>Descrizione"  class="form-control"  value="<%=ls.getDescrizione()%>" id="Descrizione">
<br/><span id="_Descrizione" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Descrizione</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Figure Professionali Coinvolte<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " name="<portlet:namespace/>Figure_Professionali_Coinvolte"  class="form-control"  value="<%=ls.getFigure_Professionali_Coinvolte()%>" id="Figure_Professionali_Coinvolte" style="-webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px;">
<br/><span id="_Figure_Professionali_Coinvolte" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Figure Professionali Coinvolte</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>

<tr>
<td>Nr Edizione<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " name="<portlet:namespace/>Nr_Edizione"  class="form-control"  value="<%=ls.getNr_Edizione()%>" id="Nr_Edizione">
<br/><span id="_Nr_Edizione" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Nr Edizione</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Sede<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " name="<portlet:namespace/>Sede"  class="form-control" value="<%=ls.getSede()%>" id="Sede">
<br/><span id="_Sede" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Sede</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Abstract<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " name="<portlet:namespace/>Abstract"  class="form-control"  value="<%=ls.getAbstract()%>" id="Abstract">
<br/><span id="_Abstract" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Abstract</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Data Inizio<span style="font-size:20px;color:red"><b>*</b></span></td>
<td>
<input type="datetime" data-field="datetime" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " placeholder="<liferay-ui:message key="ClickforCalendar"/>" name="<portlet:namespace/>Data_Inizio-date" value="<%=ls.getData_Inizio()%>" id="Data_Inizio-date" readonly="readonly">
<br/><span id="_Data_Inizio-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Inizio Date</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Data Fine<span style="font-size:20px;color:red"><b>*</b></span></td>
<td>
<input type="datetime" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " data-field="datetime" placeholder="<liferay-ui:message key="ClickforCalendar"/>" id="Data_Fine-date" name="<portlet:namespace/>Data_Fine-date" value="<%=ls.getData_Fine()%>"  readonly="readonly">
<br/><span id="_Data_Fine-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Fine Date</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>

<tr>
<td>Scadenza Iscrizioni<span style="font-size:20px;color:red"><b>*</b></span></td>
<td>
<input type="datetime" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " data-field="datetime" placeholder="<liferay-ui:message key="ClickforCalendar"/>" id="Scadenza_Iscrizioni-date" name="<portlet:namespace/>Scadenza_Iscrizioni-date" value="<%=ls.getScadenza_Iscrizioni()%>" readonly="readonly">
<br/><span id="_Scadenza_Iscrizioni-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Scadenza Iscrizioni Date</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Tot Ore<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input  type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " name="<portlet:namespace/>Tot_Ore"  class="form-control num-digit"  value="<%=ls.getTot_Ore()%>" id="Tot_Ore"><br/>
<br/><span id="_Tot_Ore" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Tot Ore</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Ammessi al corso<span style="font-size:20px;color:red"><b>*</b></span></td><td>
 <input type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     height:25px;     width: 300px; " id="Ammessi_al_corso" class="form-control num-digit" value="<%=ls.getAmmessi_al_corso()%>"  name="<portlet:namespace/>Ammessi_al_corso">
 <br/><span id="_Ammessi_al_corso" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Ammessi al corso</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>

<tr>
<td>Visibile<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input type="hidden" name="<portlet:namespace/>Visibile_data" id="Visibile_data">
<div class="checkbox-container">
    <input type="checkbox"  id="Visibile" name="<portlet:namespace/>Visibile" <%=ls.getVisibile().equalsIgnoreCase("true")?"checked":""%>>
</div>
<script type="text/javascript">
    new DG.OnOffSwitch({
        el: '#Visibile',
        textOn: 'SI',
        textOff: 'NO',
        width: 200,
        height: 40,
        listener:function(name, checked){
           
        }
  });
</script>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Bloccato<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input type="hidden" name="<portlet:namespace/>Bloccato_data" id="Bloccato_data">
<div class="checkbox-container">
    <input type="checkbox"  id="Bloccato" name="<portlet:namespace/>Bloccato" <%=ls.getBloccato().equalsIgnoreCase("true")?"checked":""%>>
</div>
<script type="text/javascript">
    new DG.OnOffSwitch({
        el: '#Bloccato',
        textOn: 'SI',
        textOff: 'NO',
        width: 200,
        height: 40,
       
    });
</script>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Dispensa corso<span style="font-size:20px;color:red"><b>*</b></span></td><td> 
<%
String sfile[]=ls.getDispensa_corso().split("/");
%>
<table>
<tr>
<td><input class="form-control" id="txt-file" value="<%=sfile[sfile.length-1]%>"></td><td><span id="btn-change" class="btn btn-primary">Modificare</span></td>
<td colspan="2"><input type="file" style="display:none" name="<portlet:namespace/>Dispensa_corso"  class="form-control" placeholder="Dispensa corso" value="" id="Dispensa_corso"></td>
</tr>
</table>
<span  id="_Dispensa_corso" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Dispensa corso</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td></td><td style="text-align:right"><span id="submit" class="btn btn-success" onClick="showAddNoteDialog()" style="width:100px">   <liferay-ui:message key="Update"/>   </span>     
</td>
</tr>
</tbody>
</table>
</div>

</aui:form>
<script type="text/javascript">
$("#btn-change").click(function(){
	$("#Dispensa_corso").show();
	$("#txt-file").hide();
	$(this).hide();
});
</script>

<div class="yui3-skin-sam">
  <div id="modal"></div>
</div> 

<script type="text/javascript">
//Now Validation
function showAddNoteDialog(){
   YUI().use('aui-modal', function(Y) {
       var modal = new Y.Modal(
         {
           bodyContent: '<label for="feedback/suggestions" ><liferay-ui:message key="Areyouwanttosubmitform"/></label>',
           centered: true,
           headerContent: '<h3><label for="formsofinteraction"><liferay-ui:message key="ConfirmationBox"/></label></h3>',
           modal: true,
           resizable:false,
           render: '#modal',
           zIndex: 1100,
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
                    	 //Start Of On Method
                    	//Start Of On Method
                         modal.hide();
                         var inputs = document.getElementsByTagName('input');
                         var flag=true;
                         for(var i = 0; i < inputs.length; i++) {
                       	 /*  if(inputs[i].type.toLowerCase() == 'file') {
                       		  if(inputs[i].value==''){
                       			  if(inputs[i].name=="<portlet:namespace/>Dispensa_corso")
                               	  {
                       				  flag=false;
                       				  $("#_Dispensa_corso").show();
                       				  //alert(inputs[i].name);
                               	  }
                      
                       		  }
                       		  if(inputs[i].value){
                       			  if(inputs[i].name=="<portlet:namespace/>Dispensa_corso")
                               	  {
                       				  $("#_Dispensa_corso").hide();
                       				  //alert(inputs[i].name);
                               	  }
                      
                       		  }
                       	  } */
                       	 //For all Date and Time Textbox
                       	if(inputs[i].type.toLowerCase() == 'text') {
                       		
                       		 if(inputs[i].value=="<liferay-ui:message key="ClickforCalendar"/>"){
                       			if(inputs[i].name=="<portlet:namespace/>Data_Inizio-date")
                             	  {
                                 	  $("#_Data_Inizio-date").show();
                                 	//alert(inputs[i].name);
                                   }
                                   
                                
                                   
                                   if(inputs[i].name=="<portlet:namespace/>Data_Fine-date")
                             	  {
                                 	  $("#_Data_Fine-date").show();
                                 	//alert(inputs[i].name);
                                   }
                                   
                                 if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-date")
                           	  	{
                               	  $("#_Scadenza_Iscrizioni-date").show();
                               	//alert(inputs[i].name);
                                 }
                     
                      		  }
                       		if(inputs[i].value!="<liferay-ui:message key="ClickforCalendar"/>"){
                       			if(inputs[i].name=="<portlet:namespace/>Data_Inizio-date")
                             	  {
                                 	  $("#_Data_Inizio-date").hide();
                                 	//alert(inputs[i].name);
                                   }
                                   
                                
                                   
                                   if(inputs[i].name=="<portlet:namespace/>Data_Fine-date")
                             	  {
                                 	  $("#_Data_Fine-date").hide();
                                 	//alert(inputs[i].name);
                                   }
                                   
                                 if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-date")
                           	  {
                               	  $("#_Scadenza_Iscrizioni-date").hide();
                               	//alert(inputs[i].name);
                                 }
                                 
                     		  }
                       		
                        
                           
                     	  }
                       	  
                             if(inputs[i].type.toLowerCase() == 'text') {
                           	  if(inputs[i].value){
                           		  
                           		  if(inputs[i].name=="<portlet:namespace/>Docente")
                               	  {
                           			  $("#_Docente").hide();
                                   	  //alert(inputs[i].name);
                                     }
                                     
                          
                                     if(inputs[i].name=="<portlet:namespace/>Evento_Progetto")
                               	  {
                                   	  $("#_Evento_Progetto").hide();
                                   	//alert(inputs[i].name);
                                     } 
                                     
                                     if(inputs[i].name=="<portlet:namespace/>Titolo")
                               	  {
                                   	  $("#_Titolo").hide();
                                   	//alert(inputs[i].name);
                                     }
                                     
                                     
                                     if(inputs[i].name=="<portlet:namespace/>Descrizione")
                               	  {
                                   	  $("#_Descrizione").hide();
                                   	//alert(inputs[i].name);
                                     }
                                     
                                     if(inputs[i].name=="<portlet:namespace/>Figure_Professionali_Coinvolte")
                               	  {
                                   	  $("#_Figure_Professionali_Coinvolte").hide();
                                   	//alert(inputs[i].name);
                                     }
                                     
                                     
                                     if(inputs[i].name=="<portlet:namespace/>Nr_Edizione")
                               	  {
                                   	  $("#_Nr_Edizione").hide();
                                   	//alert(inputs[i].name);
                                     }
                                     
                                     if(inputs[i].name=="<portlet:namespace/>Sede")
                               	  {
                                   	  $("#_Sede").hide();
                                   	//alert(inputs[i].name);
                                     }
                                     
                                     if(inputs[i].name=="<portlet:namespace/>Abstract")
                               	  {
                                   	  $("#_Abstract").hide();
                                   	//alert(inputs[i].name);
                                     }
                                     
                                     
                                  
                                   
                                     if(inputs[i].name=="<portlet:namespace/>Tot_Ore")
                               	  	 {
                                   	  $("#_Tot_Ore").hide();
                                   	  }
                                   	
                                   
                                   
                                     if(inputs[i].name=="<portlet:namespace/>Ammessi_al_corso")
                               	  {
                                   	  $("#_Ammessi_al_corso").hide();
                                   	
                                     }
                                    
                           	  }
                           	  
                           	  if(inputs[i].value==''){
                                 if(inputs[i].name=="<portlet:namespace/>Docente")
                           	  {
                               	  $("#_Docente").show();
                               	  flag=false;
                               	  //alert(inputs[i].name);
                                 }
                                                            
                                 if(inputs[i].name=="<portlet:namespace/>Evento_Progetto")
                           	  {
                               	  $("#_Evento_Progetto").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 if(inputs[i].name=="<portlet:namespace/>Titolo")
                           	  {
                               	  $("#_Titolo").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 
                                 
                                 if(inputs[i].name=="<portlet:namespace/>Descrizione")
                           	  {
                               	  $("#_Descrizione").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 
                                 
                                 if(inputs[i].name=="<portlet:namespace/>Figure_Professionali_Coinvolte")
                           	  {
                               	  $("#_Figure_Professionali_Coinvolte").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 
                                 
                                 if(inputs[i].name=="<portlet:namespace/>Nr_Edizione")
                           	  {
                               	  $("#_Nr_Edizione").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 
                                 if(inputs[i].name=="<portlet:namespace/>Sede")
                           	  {
                               	  $("#_Sede").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 
                                 if(inputs[i].name=="<portlet:namespace/>Abstract")
                           	  {
                               	  $("#_Abstract").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 
                                 
                               
                                 if(inputs[i].name=="<portlet:namespace/>Tot_Ore")
                           		  {
                               	  $("#_Tot_Ore").show();
                               	  flag=false;
                               	//alert(inputs[i].name);
                                 }
                                 
                                 if(inputs[i].name=="<portlet:namespace/>Ammessi_al_corso")
                             	  {
                                 	  $("#_Ammessi_al_corso").show();
                                 	  flag=false;
                                 	//alert(inputs[i].name);
                                   }
                                 
                           	}
                           	  //Inner If
                             }
                             //outer IF
                         }
   						
                        if(flag==true){
                       	     $("#_Docente").hide();
                       		 $("#_Evento_Progetto").hide();
                       		 $("#_Titolo").hide();
                       		 $("#_Descrizione").hide();
                       		 $("#_Figure_Professionali_Coinvolte").hide();
                       		 $("#_Nr_Edizione").hide();
                       		 $("#_Sede").hide();
                       		 $("#_Abstract").hide();
                       		 $("#_Data_Inizio-date").hide();
                       		 $("#_Data_Fine-date").hide();
                       		 $("#_Tot_Ore").hide();
                     		 $("#_Scadenza_Iscrizioni-date").hide();
                       		 $("#_Ammessi_al_corso").hide();
                       		 $("#_Dispensa_corso").hide();
                       		 var bal=$("#Bloccato").prop('checked');
          					 var vis=$("#Visibile").prop('checked');
          						 if(bal){
          							$("#Bloccato_data").val(bal);
          						 }
          						 else {
          							$("#Bloccato_data").val(bal);
          						 }
          						 if(vis){
          							$("#Visibile_data").val(vis);
          						 }
          						 else{
          							$("#Visibile_data").val(vis);
          						 }
                          	document.getElementById("<portlet:namespace/>fm").submit();
   						} 
                       //document.getElementById("<portlet:namespace/>fm").submit();
                      //End OF On method
                     }
                   }
                 },
                ]
       );
     }
   );
    }

</script>


