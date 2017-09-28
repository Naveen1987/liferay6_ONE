<%@page import="com.liferay.sample.service.suiluppo_roomLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.suiluppo_room"%>
<%@page import="com.liferay.sample.model.suiluppo_room_allocation"%>
<%@page import="com.liferay.sample.service.suiluppo_room_allocationLocalServiceUtil"%>
<%@page import="com.daff.attivita_formativa.CourseStatusChk"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<%
String courseId="";
long room_id=-1;
String room_name="";
String room_des="";
courseId=request.getParameter("courseId");
if(courseId==null){
	System.out.println("getting value from Attribute");
	courseId=request.getAttribute("courseId").toString();
}
System.out.println("RoomAllocation.jsp:"+courseId);
%>
<%! private Log log=LogFactoryUtil.getLog("RoomAllocation"); %>
<%

CourseStatusChk  chk=new CourseStatusChk();
DynamicQuery userQuery = suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
userQuery.add(RestrictionsFactoryUtil.eq("room_allocat_status", "Booked"));
List<suiluppo_room_allocation> sur=suiluppo_room_allocationLocalServiceUtil.dynamicQuery(userQuery);
if(sur.size()>0){
	for(suiluppo_room_allocation st:sur){
	log.info(st);
	if(chk.checkValid(st.getCourse_id())){
		log.info("Finding Blank Rooms......");
		if(chk.UpdateRoomAllocation(st.getRoom_allocat_id())){
			log.info("Room Updated");
		}
		
	}else{
		log.warn("room will remain booked");
	}
	}
}
else{
	log.info("No Room Booked");
}
%>
<%

List<suiluppo_room> sr=suiluppo_roomLocalServiceUtil.getsuiluppo_rooms(-1,-1);
%>
<div class="rowdiv">
<h3 class="pull-left"><liferay-ui:message key="RoomsDetails"/></h3>
<br/>
<div id="div-roombook">
<table style="width:100%">
<tbody>
<tr>
<td>
<b><liferay-ui:message key="AvailableRooms"/></b>
</td>
<td width="50%">
<select id="sel-roomId" class="form-control">
<option value="-1"><liferay-ui:message key="SelectRoom"/></option>
<%
for(suiluppo_room st:sr){
	if(chk.checkAlreadBooked(new Long(courseId).longValue(),st.getRoomID())){
		//Calling Java Script
		System.out.println(new Long(courseId).longValue()+" "+st.getRoomID());
		room_id=st.getRoomID();
		room_name=st.getRoom_name();
		room_des=st.getRoom_description();
		break;
	}
	else if(chk.checkAlreadBooked(st.getRoomID())){} 
	else{
%>
<option value="<%=st.getRoomID()%>"><%=st.getRoom_name()%></option>
<%
}
}
%>
</select>

</td>
<td class="text-center">
<span class="btn btn-primary" id="btn-submit"><liferay-ui:message key="RequestForRoom"/></span>
</td>
</tr>
</tbody>
</table>
</div>

<%
if(room_id!=-1&&!(room_name.isEmpty())){
%>
<script type="text/javascript">
		$(function(){
		  	       $('#sel-roomId').html('');
			       $("#div-roombooked").show();
			       $('#div-roombook').hide();
		});
</script>
	<%
}
%>

<div id="div-roombooked" style="display:none;width:70%;text-align:center">
<table style="width:100%">
<thead>
<tr>
<td>
<b><u><liferay-ui:message key="BookedRoomName"/></u></b>
</td>
<td>
<b><u><liferay-ui:message key="EqDescription"/></u></b>
</td>
</tr>
</thead>
<tbody>
<tr>
<td>

<div id="roomInfo">
<br/>
<input type="hidden" id="txt-bookedRoomId" value="<%=room_id+""%>">
<span class="btn btn-primary" id="btn-booked"><%=room_name%></span>
</div>
</td>
<td>
<br/>
<span id="roomDes"><%=room_des%></span>
</td>
</tr>
</tbody>
</table>


</div>
<br/>
<%--New Code --%>
<div id="div-roombookedInfo" style="display:none;width:100%;text-align: left;">
<br/>
<%

long course_Id=new Long(courseId).longValue();
DynamicQuery dq=suiluppo_room_allocationLocalServiceUtil.dynamicQuery();
dq.add(RestrictionsFactoryUtil.eq("roomID", room_id));
dq.add(RestrictionsFactoryUtil.eq("course_id", course_Id));
List<suiluppo_room_allocation>su=suiluppo_room_allocationLocalServiceUtil.dynamicQuery(dq);
if(su.size()>0){
	%>
<table style="width:80%;margin-left: 20px;">
<thead>
<tr>
<td colspan="5">
<b><u><liferay-ui:message key="room_detail"/></u></b>
<br/>
</td>
</tr>
</thead>
<tbody>
<tr>
<td><b><liferay-ui:message key="Room_Allocation_Date"/></b></td><td>
<%=su.get(0).getRoom_allocat_date() %>
</td>
</tr>
<tr>
<td><b><liferay-ui:message key="Room_Allocation_Date"/></b></td><td>
<%=su.get(0).getRoom_allocat_start() %>
</td>
</tr>
<tr>
<td><b><liferay-ui:message key="Course_End_Date"/></b></td><td>
<%=su.get(0).getRoom_allocat_end() %>
</td>
</tr>
<tr>
<td><b><liferay-ui:message key="Room_Status"/></b></td><td>
<liferay-ui:message key="<%=su.get(0).getRoom_allocat_status()%>"/>
</td>
</tr>
<tr>
<td colspan="3" style="text-align: right;">
<span class="btn btn-warning" id="btn-backbooked"><liferay-ui:message key="back"/></span>
</td>
</tr>
</tbody>
</table>
	<%
}
%>
</div>
<%--New Code --%>
</div>
<br/>
<div  class="rowdiv" >
<h3><liferay-ui:message key="EquipmentDetails"/></h3>
<jsp:include page="viewEquip.jsp">
<jsp:param value="<%=courseId%>" name="courseId"/>
</jsp:include>
<br/>
</div>

<portlet:resourceURL var="updateRoomBookInfo" id="updateRoomBookInfo">
</portlet:resourceURL>

<script>
$("#btn-submit").click(function(){
	var roomId=$("#sel-roomId").val();
	if(roomId==-1){
		alert('<liferay-ui:message key="msgRoomAll"/>');
		return; 
	}
	var courseId='<%=courseId%>';
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=updateRoomBookInfo%>',{
  		dataType: 'json',
  		method: 'POST',
  		data:{'<portlet:namespace/>roomID':roomId,'<portlet:namespace/>courseId':courseId},
  		on: {
   			 success: function() {
   			var data=this.get('responseData');
   			if(data!=null){
   				if(data.flag=='nv'){
   					alert('<liferay-ui:message key="CourseIsnotvalid"/>');
   				}else if(data.flag=='src'){
   					alert('<liferay-ui:message key="Roombookedonsamecourse"/>');
   				}else if(data.flag=='oc'){
   					alert('<liferay-ui:message key="RoombookedonOthercourse"/>');
   				}else if(data.flag=='orc'){
   					alert('<liferay-ui:message key="SomeOtherroombookforthisCourse"/>');
   				}else if(data.flag=='suc'){
   					alert('<liferay-ui:message key="SuccessfullyBooked"/>');
   					
   				}
   			}
   			location.reload();
    		}
  		}
		});
		});
});

$("#btn-backbooked").click(function(){
	$("#div-roombooked").show();
	$("#div-roombookedInfo").hide();
});


$('#btn-booked').click(function(){
	//New Code
	$("#div-roombooked").hide();
	//$("#div-roombookedInfo").load("/html/attivita_formativa_corsi/bookedRoomInfo.jsp")
	$("#div-roombookedInfo").show();
	//Old code start 
	<%-- var roomId=$('#txt-bookedRoomId').val();
	var courseId='<%=courseId%>';
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    portletURL.setParameter('roomId', roomId);  
    portletURL.setParameter('courseId', courseId);  
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/bookedRoomInfo.jsp');
    YUI().ready(function(A) {
        YUI().use('aui-base','liferay-util-window', function(A) {
            Liferay.Util.Window.getWindow({
                title :'<liferay-ui:message key="AllocatedRoomInformation"/>',
                uri: portletURL,
                id:'<portlet:namespace/>Room Information',
                dialog: {
                	centered: true,
                	constrain2view: true, 
                    destroyOnHide: true,
                    resizable: false,
                    cache: false,
                    modal: true,
                    width: 700,
                    height:300
                }
            }).after('destroy', function(event) {
            	//It will refresh
            	//location.reload();
            });
        });
    });
return; --%>
//Old code End
});
</script>