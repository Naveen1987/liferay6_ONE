
<%@page import="com.liferay.sample.service.EquipmentLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.Equipment"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<liferay-ui:success key="success" message="successkey" />
<script>
$(document).ready(function()
		{
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
Equipment eq=EquipmentLocalServiceUtil.getEquipment(new Long(request.getParameter("equipId")).longValue());
%>
<portlet:actionURL name="EquipmentEdit" var="EquipmentEdit">
<%-- <portlet:param name="mvcPath" value="/html/attivita_formativa_corsi/EditEquip.jsp" /> --%>
</portlet:actionURL>

<aui:form action="${EquipmentEdit}" id="fm" name="fm">
<input type="hidden" name="<portlet:namespace/>equipId" value="<%=request.getParameter("equipId") %>"/>
<table style="width:100%">
<tbody>
<tr>
<td><b><liferay-ui:message key="EquipmentName"/><span style="color:red">*</span></b></td><td>
<input type="text" class="form-control" id="txt-equ" 
				value="<%=eq.getEquipment_name() %>"	name="<portlet:namespace/>equipment_name">
<span id="_txt-equ" style="color:red; display:none"><liferay-ui:message key="pev"/></span>
</td>
</tr>
<tr>
<td><b><liferay-ui:message key="EqQuantity"/><span style="color:red">*</span></b></td><td>
<input type="text" value="<%=eq.getEquip_quantity() %>"
					class="form-control" min="0" id="txt-quan"
					name="<portlet:namespace/>quantity">
<span id="_txt-quan" style="color:red; display:none"><liferay-ui:message key="pev"/></span>
</td>
</tr>
<tr>
<td><b><liferay-ui:message key="EqDescription"/><!-- <span style="color:red">*</span>--></b> </td><td>
<textarea class="form-control" id="txt-des" 
					name="<portlet:namespace/>equipDesc"><%=eq.getEquip_description() %></textarea>
<span id="_txt-des"  style="color:red; display:none"><liferay-ui:message key="pev"/></span>
</td>
</tr>
<tr>
<td colspan="2" style="text-align:right"><span id="submit" class="btn btn-success" onClick="showAddNoteDialog()" style="width:100px">   <liferay-ui:message key="UpdateBtn"/>   </span>     
   <span id="reset" class="btn btn-danger" style="width:100px">   <liferay-ui:message key="close"/>   </span>
</td>
</tr>
</tbody>
</table>
</aui:form>
	
	<script type="text/javascript">
$("#reset").click(function(){
	Liferay.Util.getOpener().<portlet:namespace />closePopup('<portlet:namespace/>Edit_Equipment');
	Liferay.Util.getOpener().<portlet:namespace />refreshPortlet();
	/* $("#_txt-equ").hide();
	$("#_txt-des").hide();
	$("#_txt-quan").hide();
	$("#txt-equ").val('');
	$("#txt-des").val('');
	$("#txt-quan").val('0'); */
});  

//Now Validation
function showAddNoteDialog(){
   YUI().use('aui-modal', function(Y) {
       var modal = new Y.Modal(
         {
           bodyContent: '<label for="feedback/suggestions" ><liferay-ui:message key="Are you want to submit form"/></label>',
           centered: true,
           headerContent: '<h3><label for="formsofinteraction"><liferay-ui:message key="Confirmation Box"/></label></h3>',
           modal: true,
           resizable:false,
           render: '#modal',
           zIndex: 1100,
           width: 300,
           height:200
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
                      modal.hide();
                      var flag=true;
                      var inputs = document.getElementsByTagName('input');
                      for(var i = 0; i < inputs.length; i++) {
                    	  if(inputs[i].type.toLowerCase() == 'text') {
                    		  if(inputs[i].value==''){
                    			  if(inputs[i].name=="<portlet:namespace/>equipment_name")
                            	  {
                    				  flag=false;
                    				  $("#_txt-equ").show();
                    				
                            	  }
                   
                    		  }
                    		  if(inputs[i].value){
                    			  if(inputs[i].name=="<portlet:namespace/>equipment_name")
                            	  {
                    				  $("#_txt-equ").hide();
                    				 
                            	  }
                   
                    		  }
                    	  }        
                    	  if(inputs[i].type.toLowerCase() == 'text') {
                    		  if(inputs[i].value==''){
                    			  if(inputs[i].name=="<portlet:namespace/>quantity")
                            	  {
                    				  flag=false;
                    				  $("#_txt-quan").show();
                    				
                            	  }
                   
                    		  }
                    		  if(inputs[i].value){
                    			  if(inputs[i].name=="<portlet:namespace/>quantity")
                            	  {
                    				  $("#_txt-quan").hide();
                    				 
                            	  }
                   
                    		  }
                    	  }        
						} 
                      if($("#txt-quan").val()<1){
                    	  $("#_txt-quan").text('<liferay-ui:message key="eqQuan"/>')
                    	  $("#_txt-quan").show();
                    	  flag=false;
                      }
                      if(flag==true){
                    	  
                		  document.getElementById("<portlet:namespace/>fm").submit();
                	  }
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
