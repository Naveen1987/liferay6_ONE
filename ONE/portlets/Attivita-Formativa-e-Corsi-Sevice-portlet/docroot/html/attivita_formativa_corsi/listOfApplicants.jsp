
<%@page import="com.daff.attivita_formativa.Suiluppo_course_applicationUtil"%>
<%@page import="com.liferay.sample.service.suiluppo_applicationLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.suiluppo_application"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<link href="<%= request.getContextPath()%>/css/on-off-switch.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/js/on-off-switch.js"></script>
<script src="<%= request.getContextPath()%>/js/on-off-switch-onload.js"></script>

<style>
.results tr[visible='false'],
.no-result{
  display:none;
}

.results tr[visible='true']{
  display:table-row;
}

.counter{
  padding:8px; 
  color:#ccc;
}
</style>

<script>
$(document).ready(function() {
	  $(".search").keyup(function () {
	    var searchTerm = $(".search").val();
	    var listItem = $('.results tbody').children('tr');
	    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")
	    
	  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
	        return (elem.textContent || elem.innerText || '').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
	    }
	  });
	    
	  $(".results tbody tr").not(":containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','false');
	  });

	  $(".results tbody tr:containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','true');
	  });

	  var jobCount = $('.results tbody tr[visible="true"]').length;
	    $('.counter').text(jobCount + ' item');

	  if(jobCount == '0') {$('.no-result').show();}
	    else {$('.no-result').hide();}
			  });
	});
</script>


<div class="form-group pull-right">
    <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder="<liferay-ui:message key="walf"/>">
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
   
    <th><b><liferay-ui:message key="AName"/></b></th>
    <th><b><liferay-ui:message key="AEmailID"/></b></th>
    <th><b><liferay-ui:message key="AConfirmation"/></b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="4"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
  </thead>
    <tbody>
    <%
    
   //List<suiluppo_application>sa= suiluppo_applicationLocalServiceUtil.getApplicantUnderCourse(new Long(request.getParameter("courseId")).longValue());
   List<suiluppo_application>sa= new Suiluppo_course_applicationUtil().getApplicantUnderCourse(new Long(request.getParameter("courseId")).longValue());
    		for(suiluppo_application ap:sa){
    			%>
    			<tr>
    			<td><%=ap.getApplicat_name() %></td><td><%=ap.getApplicat_email() %></td>
    			<td>
    			<div class="checkbox-container">
   				 <input type="checkbox"  id='<%=ap.getApplicat_id() %>' name="<portlet:namespace/>confirm_ch"   <%=ap.getApplicat_confirm().equalsIgnoreCase("yes")?"checked":""%>>
				</div>
<script type="text/javascript">
    new DG.OnOffSwitch({
        el: '<%="#"+ap.getApplicat_id() %>',
        textOn: 'SI',
        textOff: 'NO',
        width: 100,
        height: 30,
        listener:function(name, checked){
        if(this.checked==true){
        	confirmationApplicant('<%=ap.getApplicat_id() %>','yes');
        }
        else{
        	confirmationApplicant('<%=ap.getApplicat_id() %>','no');
        }
        }
  });
</script>		
    			</td>
    			</tr>
    			<%
    		}
    %>
   
    </tbody>
    </table>
    

<portlet:actionURL name="addConfirmApplicant" var="addConfirmApplicant">
<%-- <portlet:param name="mvcPath" value="/html/attivita_formativa_corsi/listOfApplicants.jsp"/>  --%>
</portlet:actionURL>


<script>
function confirmationApplicant(appId,status){
	
	//alert(status+" "+appId);
	var courseId='<%=request.getParameter("courseId") %>';
		
		AUI().use('aui-base','aui-io-request', function(A){
			//aui ajax call to get updated content
			A.io.request('<%=addConfirmApplicant%>',{
	  		dataType: 'json',
	  		method: 'POST',
	  		data:{'<portlet:namespace/>appId':appId,'<portlet:namespace/>courseId':courseId,'<portlet:namespace/>status':status},
	  		on: {
	   			 success: function() {
	   			 if(status=='yes'){
	   				alert("<liferay-ui:message key="SuccessfullyConfirmed"/>" +" With Status :"+ "<liferay-ui:message key="yes"/>");
	   			 }
	   			 else{
	   				alert("<liferay-ui:message key="SuccessfullyConfirmed"/>" +" With Status :"+ "<liferay-ui:message key="no"/>");
	   			 }
	   		}
	  		}
			});
			});
	
	
}
</script>