<%@page import="com.daff.attivita_formativa.Suiluppo_course_applicationUtil"%>
<%@page import="com.liferay.sample.service.suiluppo_applicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.sample.service.suiluppo_courseLocalServiceUtil"%>
<%@page import="com.liferay.sample.model.suiluppo_course"%>
<%@page import="com.liferay.portal.kernel.bean.PortletBeanLocatorUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Projection"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="init.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" />
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<script src='<%=request.getContextPath()+"/js/jquery-ui.min.js"%>'></script>
<script src='<%=request.getContextPath()+"/js/jquery.scrolltable.js"%>'></script>

<script type="text/javascript">
		$(function(){
		$('.scrollTable').scrolltable({
			maxHeight: 500,
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

<table>
    <tbody>
    <tr>
    <td style="padding: 10px;"><span id="btnNew" class="btn btn-warning"><liferay-ui:message key="NewCourse"/></span></td>
    <td style="padding: 10px;"><span id="btnOther" class="btn btn-warning"><liferay-ui:message key="CourseforApply"/></span></td>
<%

for(Role r:user.getRoles()){
if(r.getName().equalsIgnoreCase("Administrator")||r.getName().equalsIgnoreCase("Power User"))
{
%>
<td style="padding: 10px;"><span id="btnNewRoom" class="btn btn-warning"><liferay-ui:message key="ManageRoom"/></span></td>
<td style="padding: 10px;"><span id="btnNewEquip" class="btn btn-warning"><liferay-ui:message key="ManageEquipment"/></span></td>
<%
break;
}
}
%>
     </tr>
    </tbody>
    </table>

<div class="form-group pull-right">
   <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder='<liferay-ui:message key="walf"/>'>
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="scrollTable results" cellpadding="0" cellspacing="0" border="0">
<thead>
<tr> 
	<th width="10%"><b>Evento Progetto</b></th>
    <th width="10%"><b>Titolo</b></th>
    <th width="10%"><b>Data Inizio</b></th>
    <th width="10%"><b>Data Fine</b></th>
    <th width="10%"><b>Tot Ore</b></th>
    <th width="10%"><b>Visibile</b></th>
    <th width="10%"><b>Bloccato</b></th>
    <th width="10%"><b><liferay-ui:message key="action"/></b></th>
    <th width="10%"><b><liferay-ui:message key="Application"/></b></th>
</tr>
<tr class="warning no-result">
      <td colspan="10" style="color:black;background-color:#ffe6e6;"><div style="display:block;padding: 10px 5px 5px 5px; font-weight: bold"><liferay-ui:message key="noresult"/></div></td>
</tr>
</thead>
<tbody>
<%    
    List<suiluppo_course> suil=new Suiluppo_course_applicationUtil().getCourseUnderDocente(user.getFullName());
    for(suiluppo_course su:suil)
    {%>
     <tr>
    <td><%=su.getEvento_Progetto().trim()%></td>
    <td><%=su.getTitolo().trim()%></td>
    <td><%=su.getData_Inizio().trim()%></td>
    <td><%=su.getData_Fine().trim()%></td>
    <td><%=su.getTot_Ore().trim()%></td>
    <td><%=su.getVisibile().trim()%></td>
    <td><%=su.getBloccato().trim()%></td>
    <td>
    <span onclick="getCourseViewId('<%=su.getCourse_id() +""%>')" class="btn btn-primary btnview"><liferay-ui:message key="View"/></span>
    <span onclick="getCourseEditId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnedit"><liferay-ui:message key="cEdit"/></span>
    <span onclick="getRoomAllowId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnroow"><liferay-ui:message key="roomAll"/></span>
    <td><span onclick="getCourseApplicants('<%=su.getCourse_id() +""%>')" class="btn btn-success btnlistOfApp"><%=
    		new Suiluppo_course_applicationUtil().getApplicantUnderCourse(su.getCourse_id()).size()+""
    %></span></td>
	</tr>
    <%}%>
</tbody>
</table>




<script type="text/javascript">
$("#btnNewEquip").click(function(){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/ListEquip.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="EquipmentManagement"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Equipment_management',
	                dialog: {
	                	/* centered: true,
	                	constrain2view: true, */
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width:1600,
	                   
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });

	
});

$("#btnNewRoom").click(function(){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/ListRoom.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="RoomManagement"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Room_manage',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width:1600,
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });

	
});


$("#btnOther").click(function(){
	
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/courseForApply.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="CourseforApply"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Course_for_Apply',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 1200,
	                    height:900
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
});
function getCourseViewId(courseId)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('courseId', courseId);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/ViewCourse.jsp');
	
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="CourseView"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Course_View',
	                dialog: {
	                	centered: true,
	                	constrain2view: true, 
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 950,
	                    height:700
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
			
}
function getCourseEditId(courseId)
{
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('courseId', courseId);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/editCourse.jsp');
	
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="CourseEdit"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Course_Edit',
	                dialog: {
	                	centered: true,
	                	constrain2view: true, 
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 950
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
}
</script>

<script type="text/javascript">
$("#btnNew").click(function(){
	//alert('Hello New');
	    var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/AddCourse.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="AddNewCourse"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>AddCourse',
	                dialog: {
	                     centered: true,
	                	constrain2view: true, 
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 800
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
});
</script>
<script>
function getCourseApplicants(courseId){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
	    portletURL.setParameter('courseId', courseId);    
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/listOfApplicants.jsp');
	 
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="ListOfApplicants"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>ListOfApplicants',
	                dialog: {
	                	 centered: true,
	                	constrain2view: true, 
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 950
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
	}
</script>

<portlet:resourceURL var="updaContentURL" id="checkCourseRoomBookInfo">
</portlet:resourceURL>
<script>
function getRoomAllowId(courseId){
	
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=updaContentURL%>',{
  		dataType: 'json',
  		method: 'POST',
  		data:{'<portlet:namespace/>courseId':courseId},
  		on: {
   			 success: function() {
   			 var data=this.get('responseData');
   			 if(data!=null){
   				 if(data.flag=='ar'){
   					 alert('<liferay-ui:message key="Alreadyroombookedforthiscourse"/>');
   				 }
   				 else if(data.flag=='cv'){
   					 alert('<liferay-ui:message key="ThiscourseisinvalidPleaseCheckCourse"/> { Bloccato/Visibile/Data Fine }');
   					//location.reload();
   					 return;
   				 }
   			 }  			
   			 	var portletURL = Liferay.PortletURL.createRenderURL();
   			 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
   			    portletURL.setParameter('courseId', courseId);    
   			    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
   			    portletURL.setParameter('mvcPath', '/html/attivita_formativa_corsi/RoomAllocation.jsp');
   			    YUI().ready(function(A) {
   			        YUI().use('aui-base','liferay-util-window', function(A) {
   			            Liferay.Util.Window.getWindow({
   			                title :'<liferay-ui:message key="RoomAllocation"/>',
   			                uri: portletURL,
   			                id:'<portlet:namespace/>RoomAllowcation',
   			                dialog: {
   			                	centered: true,
   			                	constrain2view: true,
   			                    destroyOnHide: true,
   			                    resizable: false,
   			                    cache: false,
   			                    modal: true,
   			                    width: 950
   			                }
   			            }).after('destroy', function(event) {
   			            	//It will refresh
   			            	location.reload();
   			            });
   			        });
   			    });
   			 }
   		
    		
  		}
		});
		});

	}
</script>



