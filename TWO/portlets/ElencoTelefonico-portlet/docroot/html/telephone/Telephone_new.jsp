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
<aui:form name="fm" id="fm" action="${formSubmit}">  
<div class='container_di' style="height: auto; padding: 15px;">
		<div id="first" style="padding-right: 20%; text-align: left">
			<table style="width: 100%">
			<tr><td>Tipo</td><td>
			<select name="<portlet:namespace/>Tipo" id="Tipo">
			<option value="-1">- Seleziona Scelta -</option>
			<option value="Analogico">Analogico</option>
			<option value="VOIP">VOIP</option> 
			<option value="Fax">Fax</option>
			<option value="Misto">Misto</option>
			<option value="POS">POS</option>
			</select>
			</td>
			<td>
			<span style="color:red;display:none" id="_Tipo"><liferay-ui:message key="PleaseSelectValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Tipo Sede</td><td>
			<input type="text" name="<portlet:namespace/>TipoSede" id="TipoSede" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_TipoSede"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Comune Sede</td><td>
			<input type="text" name="<portlet:namespace/>ComuneSede" id="ComuneSede" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_ComuneSede"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Descrizione Sede </td><td>
			<input type="text" name="<portlet:namespace/>DescrizioneSede" id="DescrizioneSede" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_DescrizioneSede"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Interno</td><td>
			<input type="text" name="<portlet:namespace/>Interno" id="Interno" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Interno"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Piano</td><td>
			<input type="text" name="<portlet:namespace/>Piano" id="Piano" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Piano"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Area</td><td>
			<input type="text" name="<portlet:namespace/>Area" id="Area" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Area"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Blocco</td><td>
			<input type="text" name="<portlet:namespace/>Blocco" id="Blocco" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Blocco"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Stanza</td><td>
			<input type="text" name="<portlet:namespace/>Stanza" id="Stanza" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Stanza"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Marca</td><td>
			<input type="text" name="<portlet:namespace/>Marca" id="Marca" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Marca"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Modello</td><td>
			<input type="text" name="<portlet:namespace/>Modello" id="Modello" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Modello" ><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			
			</tr>
			<tr>
			<td>Inventario SN</td><td>
			<input type="text" name="<portlet:namespace/>InventarioSN" id="InventarioSN" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_InventarioSN"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			
			</tr>
			<tr>
			<td>Unità Operativa</td><td>
			<input type="text" name="<portlet:namespace/>UnitaOperativa" id="UnitaOperativa" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_UnitaOperativa"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			
			</tr>
			<tr>
			<td>Descrizione</td><td>
			<input type="text" name="<portlet:namespace/>Descrizione" id="Descrizione" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Descrizione"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Nome</td><td>
			<input type="text" name="<portlet:namespace/>Nome" id="Nome" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Nome"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Note</td><td>
			<input type="text" name="<portlet:namespace/>Note" id="Note" style="width: 200px">
			</td>
			<td>
			<span style="color:red;display:none" id="_Note"><liferay-ui:message key="pleaseInputValue"/></span>
			</td>
			</tr>
			<tr>
			<td>Visibile</td><td>
			<div class="checkbox-container">
   			<input type="checkbox"  id='Visibile' name="<portlet:namespace/>Visibile" checked="checked">
   			<input type="hidden" name="<portlet:namespace/>Visibile_data" id="Visibile_data">
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
			<tr>
			<td colspan="2" style="text-align: right">
			<br/>
			 <aui:button  style="width:150px;background-color:#009AD6;color:white; height:40px" value="Reset" onclick="this.form.reset()" />
 &nbsp;&nbsp;<aui:button value="Save"   style="width:150px;background-color:#f08000;color:white; height:40px" onClick="javascript:showAddNoteDialog();"/>
			
			</td>
			</tr>
			
			</table>
		</div>
		<div style="clear: both"></div>
	</div>
</aui:form>
	<script>
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
		                      var flag=true;
		                      var all_select = document.getElementsByTagName("select");
		                      for (i = 0; i < all_select.length; i++) {
		                    	  if(all_select[i].value=='-1')
		                    		  {
		                    		 
		                    		  if(all_select[i].name=="<portlet:namespace/>Tipo")
		                        	  {
		                            	 $("#_Tipo").show();
		                            	  flag=false;
		                            	
		                              }
		                    		  
		                    	 }
		                    	  if(all_select[i].value!='-1')
		                		  {
		                		
		                		  if(all_select[i].name=="<portlet:namespace/>Tipo")
		                    	  {
		                        	 $("#_Tipo").hide();

		                          }
		                		  
		                		}
		                      }
		                      var inputs = document.getElementsByTagName('input');
		                      for(var i = 0; i < inputs.length; i++) {
		                      //Start
	                    	 if(inputs[i].type.toLowerCase() == 'text') {
                          	     if(inputs[i].value==''){
		                                if(inputs[i].name=="<portlet:namespace/>TipoSede")
		                          	  {
		                              	  $("#_TipoSede").show();
		                              	  flag=false;
		                              	  //alert(inputs[i].name);
		                                }
		                                                           
		                                if(inputs[i].name=="<portlet:namespace/>ComuneSede")
		                          	  {
		                              	  $("#_ComuneSede").show();
		                              	  flag=false;
		                              	//alert(inputs[i].name);
		                                }
		                                if(inputs[i].name=="<portlet:namespace/>DescrizioneSede")
		                          	  {
		                              	  $("#_DescrizioneSede").show();
		                              	  flag=false;
		                              	//alert(inputs[i].name);
		                                }
		                                
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Interno")
		                          	  {
		                              	  $("#_Interno").show();
		                              	  flag=false;
		                              	//alert(inputs[i].name);
		                                }
		                                
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Piano")
		                          	  {
		                              	  $("#_Piano").show();
		                              	  flag=false;
		                              	//alert(inputs[i].name);
		                                }
		                                
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Area")
		                          	  {
		                              	  $("#_Area").show();
		                              	  flag=false;
		                              	//alert(inputs[i].name);
		                                }
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Blocco")
		                          	  {
		                              	  $("#_Blocco").show();
		                              	  flag=false;
		                              	//alert(inputs[i].name);
		                                }
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Stanza")
		                          	  {
		                              	  $("#_Stanza").show();
		                              	  flag=false;
		                              	//alert(inputs[i].name);
		                                }
		              	                            		                                
		                                if(inputs[i].name=="<portlet:namespace/>Marca")
		                            	  {
		                                	  $("#_Marca").show();
		                                	  flag=false;
		                                	//alert(inputs[i].name);
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Modello")
		                            	  {
		                                	  $("#_Modello").show();
		                                	  flag=false;
		                                	//alert(inputs[i].name);
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>InventarioSN")
		                            	  {
		                                	  $("#_InventarioSN").show();
		                                	  flag=false;
		                                	//alert(inputs[i].name);
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>UnitaOperativa")
		                            	  {
		                                	  $("#_UnitaOperativa").show();
		                                	  flag=false;
		                                	//alert(inputs[i].name);
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Descrizione")
		                            	  {
		                                	  $("#_Descrizione").show();
		                                	  flag=false;
		                                	//alert(inputs[i].name);
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Nome")
		                            	  {
		                                	  $("#_Nome").show();
		                                	  flag=false;
		                                	//alert(inputs[i].name);
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Note")
		                            	  {
		                                	  $("#_Note").show();
		                                	  flag=false;
		                                	//alert(inputs[i].name);
		                                  }
		                                
		                          	}
	                    	 }
             //End
              //Start
	                    	 if(inputs[i].type.toLowerCase() == 'text') {
                          	     if(inputs[i].value){
		                                if(inputs[i].name=="<portlet:namespace/>TipoSede")
		                          	  {
		                              	  $("#_TipoSede").hide();
		                              	  
		                                }
		                                                           
		                                if(inputs[i].name=="<portlet:namespace/>ComuneSede")
		                          	  {
		                              	  $("#_ComuneSede").hide();
		                              	 
		                                }
		                                if(inputs[i].name=="<portlet:namespace/>DescrizioneSede")
		                          	  {
		                              	  $("#_DescrizioneSede").hide();
		                              
		                                }
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Interno")
		                          	  {
		                              	  $("#_Interno").hide();
		                              
		                                }
		                                
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Piano")
		                          	  {
		                              	  $("#_Piano").hide();
		                              	 
		                                }
		                                
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Area")
		                          	  {
		                              	  $("#_Area").hide();
		                             
		                                }
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Blocco")
		                          	  {
		                              	  $("#_Blocco").hide();
		                             
		                                }
		                                
		                                if(inputs[i].name=="<portlet:namespace/>Stanza")
		                          	  {
		                              	  $("#_Stanza").hide();
		                         
		                                }
		              	                            		                                
		                                if(inputs[i].name=="<portlet:namespace/>Marca")
		                            	  {
		                                	  $("#_Marca").hide();
		                                
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Modello")
		                            	  {
		                                	  $("#_Modello").hide();
		                                
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>InventarioSN")
		                            	  {
		                                	  $("#_InventarioSN").hide();
		                                	
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>UnitaOperativa")
		                            	  {
		                                	  $("#_UnitaOperativa").hide();
		                                	
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Descrizione")
		                            	  {
		                                	  $("#_Descrizione").hide();
		                                	
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Nome")
		                            	  {
		                                	  $("#_Nome").hide();
		                                	
		                                  }
		                                if(inputs[i].name=="<portlet:namespace/>Note")
		                            	  {
		                                	  $("#_Note").hide();
		                                	
		                                  }
		                                
		                          	}
	                    	 }
		                          //End
		                      }
								
		                      if(flag==true){
		                    	  var vis=$("#Visibile").prop('checked');
	         						 if(vis){
	         							$("#Visibile_data").val(vis);
	         						 }
	         						 else{
	         							$("#Visibile_data").val(vis);
	         						 }
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
	</script>