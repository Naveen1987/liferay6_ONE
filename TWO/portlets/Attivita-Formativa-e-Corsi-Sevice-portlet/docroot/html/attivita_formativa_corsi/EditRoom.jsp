
<%@page import="com.liferay.sample.service.suiluppo_roomLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.suiluppo_room"%>

<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<%

suiluppo_room sr=suiluppo_roomLocalServiceUtil.getsuiluppo_room(new Long(request.getParameter("roomId")).longValue());

%>
<liferay-ui:success key="success" message="successkey" />

<portlet:actionURL name="editRoom" var="formSubmit">
<%-- <portlet:param name="mvcPath" value="/html/attivita_formativa_corsi/EditRoom.jsp"/>  --%>
</portlet:actionURL>
<aui:form action="${formSubmit}" method="post" id="fm" name="fm">

<input type="hidden"  name="<portlet:namespace/>roomId" value="<%=request.getParameter("roomId") %>"/>
<table style="width:100%">
<tbody>
<tr>
<td><liferay-ui:message key="rmName"/><span style="color:red">*</span></b></td><td>
<input  name="<portlet:namespace/>txt-room" id="txt-room" value="<%=sr.getRoom_name() %>" />
<span id="_txt-room" style="color:red; display:none"><liferay-ui:message key="pev"/></span>
</td>
</tr>
<tr>
<td><b><liferay-ui:message key="rmDescription"/><!-- <span style="color:red">*</span> --></b></td><td>
<textarea name="<portlet:namespace/>txt-des" id="txt-des" >
<%=sr.getRoom_description() %>
</textarea>
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
	Liferay.Util.getOpener().<portlet:namespace />closePopup('<portlet:namespace/>Edit_Room');
	Liferay.Util.getOpener().<portlet:namespace />refreshPortlet();
	/* $("#_txt-room").hide();
	$("#_txt-des").hide();
	$("#txt-room").val('');
	$("#txt-des").val(''); */
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
                      modal.hide();
                      var flag=true;
                      var inputs = document.getElementsByTagName('input');
                      for(var i = 0; i < inputs.length; i++) {
                    	  if(inputs[i].type.toLowerCase() == 'text') {
                    		  if(inputs[i].value==''){
                    			  if(inputs[i].name=="<portlet:namespace/>txt-room")
                            	  {
                    				  flag=false;
                    				  $("#_txt-room").show();
                    				
                            	  }
                   
                    		  }
                    		  if(inputs[i].value){
                    			  if(inputs[i].name=="<portlet:namespace/>txt-room")
                            	  {
                    				  $("#_txt-room").hide();
                    				 
                            	  }
                   
                    		  }
                    	  }

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