<%@page import="com.liferay.sample.service.BookedEquipmentLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.BookedEquipment"%>
<%@page import="com.liferay.sample.service.EquipmentLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.Equipment"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" />
<script src='<%=request.getContextPath()+"/js/jquery-ui.min.js"%>'></script>
<script src='<%=request.getContextPath()+"/js/jquery.scrolltable.js"%>'></script>

<%
String courseId=request.getParameter("courseId");
List<Equipment> equipList = EquipmentLocalServiceUtil.getEquipments(-1, -1);
List<BookedEquipment> bkequipList = BookedEquipmentLocalServiceUtil.getBookedEquipments(-1, -1);
%>
<script type="text/javascript">
		$(function(){
		$('.scrollTable').scrolltable({
			maxHeight: 300,
			stripe: true,
			oddClass: 'odd'
		});
		});
	</script>
<style type="text/css">
.scrollTable {
width: 100%;
}
.scrollTable thead {
background-color: #45CBF5;
color:white;
}
.scrollTable thead th {
text-align: left;
height:35px;
padding: 0.1em 0.3em;
}
.scrollTable tbody td {
border-top: 1px solid #eee;
border-right: 1px solid #eee;
padding: 0.1em 0.3em;
}
.scrollTable tbody tr.odd td {
background-color: #f9f9f9;
}
</style>

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
	    $('.counter').text(jobCount + ' <liferay-ui:message key="item"/>');

	  if(jobCount == '0') {$('.no-result').show();}
	    else {$('.no-result').hide();}
			  });
	});
</script>

<script>
function bookRoomDiv() {
	document.getElementById('bookRoomDiv').style.display = "block";
	document.getElementById('listbookedRoomDiv').style.display = "none";
	//document.getElementById('equipDiv').style.display = "none";
}

function listbookedRoomDiv() {
	document.getElementById('listbookedRoomDiv').style.display = "block";
	document.getElementById('bookRoomDiv').style.display = "none";
	//document.getElementById('equipDiv').style.display = "none";
}

function equipDiv() {
	document.getElementById('listbookedRoomDiv').style.display = "none";
	document.getElementById('bookRoomDiv').style.display = "none";
	//document.getElementById('equipDiv').style.display = "block";
}
</script>

<portlet:actionURL name="BookedEquipmentSubmit" var="BookedEquipmentSubmit">
<%-- <portlet:param name="mvcPath" value="/html/attivita_formativa_corsi/RoomAllocation.jsp" /> --%>
</portlet:actionURL>

<div class="pull-right">
<table>
<tr>
<td><span class="btn btn-primary" id="btn-submit" onclick="bookRoomDiv()"><liferay-ui:message key="BookEquipment"/></span></td>
<td><span class="btn btn-primary" id="btn-submit"  onclick="listbookedRoomDiv()"><liferay-ui:message key="ViewAllocatedEquipment"/></span></td>
</tr>
<tr>
<td><br/></td>
</tr>
</table>
</div>
<br/><br/>
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
<br/>
<div id="bookRoomDiv"  style="display: none;overflow:auto; width:600px;height:400px;" >
	<form action="<%=BookedEquipmentSubmit%>" method="Post" name="myForm">
	<table width="100%">
	<%
	//for submit button visible
	boolean sub=false;
	for(Equipment eq : equipList){ 
			int count=0;
			for(BookedEquipment bk: bkequipList){
				if(eq.getEquip_id()==bk.getEquip_id()){
					count = count+bk.getEquip_quantity();
				}
			}
			if(eq.getEquip_quantity()>count){
				sub=true;
			%>
			
			
			<input type="hidden" id="course_Id" value="<%=courseId%>" name="<portlet:namespace/>course_Id" readonly="readonly"/>
			<tr><td><%=eq.getEquipment_name()%><br/> <span style="color:red"><liferay-ui:message key="available"/> : <%=eq.getEquip_quantity()-count%></span></td>
			<td>
			<input type="text" class="num-digit"
			id="<%=eq.getEquipment_name()%>" placeholder="Please enter <%=eq.getEquip_quantity()-count%> or less than <%=eq.getEquip_quantity()-count%> <%=eq.getEquipment_name()%>"
					name="<portlet:namespace/><%=eq.getEquipment_name()%>" onChange="validateMe('<%=eq.getEquipment_name()%>','<%= eq.getEquip_quantity()-count%>')"/> 
			
			</td>
					
				<%-- <input type="text" class="num-digit" min="0" max="<%=eq.getEquip_quantity()-count%>"
					id="<%=eq.getEquipment_name()%>" placeholder="Please enter <%=eq.getEquip_quantity()-count%> or less than <%=eq.getEquip_quantity()-count%> <%=eq.getEquipment_name()%>"
					name="<portlet:namespace/><%=eq.getEquipment_name()%>" onChange="validateMe('<%=eq.getEquipment_name()%>','<%= eq.getEquip_quantity()-count%>')"/> --%>
			
			<%} }%>
			
			
			<td>
			<%
			if(sub){
				%>
				<button type="submit" class="btn btn-warning"><liferay-ui:message key="submit"/></button>
				<%
			}
			else{
				%>
				<span style="Color:red;font-size:20px"><liferay-ui:message key="saeb"/></span>
				<%
			}
			%>
			</td>
			</tr>
			
			</table>
		</form>
<br/>
</div>

<div id="listbookedRoomDiv"   style="display: none;">
<br/>
<div class="form-group pull-right">
   <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder='<liferay-ui:message key="walf"/>'>
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="scrollTable results" cellpadding="0" cellspacing="0" border="0">
<thead>
<tr>
   <th width="10%"><b><liferay-ui:message key="CourseId"/></b></th>
   <th width="10%"><b><liferay-ui:message key="EquipmentId"/></b></th>
   <th width="10%"><b><liferay-ui:message key="EquipmentName"/></b></th>
   <th width="10%"><b><liferay-ui:message key="EqQuantity"/></b></th>
   <th width="10%"><b><liferay-ui:message key="BookedDate"/></b></th>
</tr>
<tr class="warning no-result">
      <td colspan="10" style="color:black;background-color:#ffe6e6;"><div style="display:block;padding: 10px 5px 5px 5px; font-weight: bold"><liferay-ui:message key="noresult"/></div></td>
</tr>
</thead>
<tbody>
<%	for(BookedEquipment bked : bkequipList){
	if(bked.getCourse_id()==new Long(courseId).longValue()){	
				for(Equipment eq : equipList){
					if(bked.getEquip_id() == eq.getEquip_id()){
						
	%>
	<tr>
	<td><%=bked.getCourse_id()%></td>
				
	<td><%=bked.getEquip_id() %></td>
	
	<td><%=eq.getEquipment_name() %></td>
	
	<td><%=bked.getEquip_quantity() %></td>
	
	<td><%=bked.getBooked_equip_date() %></td>
	</tr>
		<%}
				}
	
	%>
	  
<% }}%>
</tbody>
</table>
</div>

<script type="text/javascript">
function validateMe(control,ava){
	var id='#'+control;
	//alert($(id).val()+" "+ava);
	if(parseInt($(id).val())>parseInt(ava)){
		alert("Immetti Valore valido");
		$(id).val('');
		return;
	}
}
</script>

