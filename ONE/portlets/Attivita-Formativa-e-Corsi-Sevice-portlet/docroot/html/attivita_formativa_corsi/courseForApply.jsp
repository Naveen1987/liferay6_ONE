<%@page import="com.daff.attivita_formativa.Suiluppo_course_applicationUtil"%>
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
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
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

<div id="listApply">
<div class="form-group pull-right">
    <input type="text" class="search form-control" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " placeholder="<liferay-ui:message key="walf"/>">
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>#</b></th>
    <th><b>Docente</b></th>
    <th><b>Evento Progetto</b></th>
    <th><b>Titolo</b></th>
    <th><b>Data Inizio</b></th>
    <th><b>Data Fine</b></th>
    <th><b>Tot Ore</b></th>
    <th><b>Visibile</b></th>
    <th><b>Bloccato</b></th>
     <th><b><liferay-ui:message key="action"/></b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="10"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
  </thead>
    <tbody>
   <% 
   
    //List<suiluppo_course> suil1=suiluppo_courseLocalServiceUtil.getCourseNotUnderDocente(user.getFullName());
    List<suiluppo_course> suil1=new Suiluppo_course_applicationUtil().getCourseNotUnderDocente(user.getFullName());
    for(suiluppo_course su:suil1)
    {
    if(su.getBloccato().equalsIgnoreCase("false")&&su.getVisibile().equalsIgnoreCase("true"))
    {
    	if(su.getAmmessi_al_corso()>new Suiluppo_course_applicationUtil().getApplicantUnderCourse(su.getCourse_id()).size())
    	{
    	%>
        <tr>
        <td><%=su.getCourse_id() %></td> 
        <td><%=su.getDocente() %></td> 
       <td><%=su.getEvento_Progetto()%></td>
       <td><%=su.getTitolo()%></td>
       <td><%=su.getData_Inizio()%></td>
       <td><%=su.getData_Fine()%></td>
      <td><%=su.getTot_Ore()%></td>
       <td><%=su.getVisibile()%></td>
       <td><%=su.getBloccato()%></td>
       <td>
       <table>
       <tbody>
       <tr>
       <td style="padding: 5px;"><span onclick="getCourseViewId('<%=su.getCourse_id() +""%>')" class="btn btn-primary btnview"><liferay-ui:message key="View"/></span></td>
       <%
       if(new Suiluppo_course_applicationUtil().checkApplicantUnderCourse(su.getCourse_id(), user.getFullName())){
       	%>
       <td style="padding: 5px;"><span id="<%="btn_"+su.getCourse_id()%>"  onclick="getCourseApplyId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnedit"><liferay-ui:message key="Applied"/></span></td>	
           <%
       }
       else{
       	%>
       <td style="padding: 5px;"><span id="<%="btn_"+su.getCourse_id()%>"  onclick="getCourseApplyId('<%=su.getCourse_id() +""%>','<%=user.getFullName()%>')" class="btn btn-warning btnedit"><liferay-ui:message key="Apply"/></span></td>	
       <%
       }
       %>      
       </tr>
       </tbody>
       </table>
       </td>
       </tr>
       <%
    }
    	
	else if(su.getAmmessi_al_corso()==new Suiluppo_course_applicationUtil().getApplicantUnderCourse(su.getCourse_id()).size())
    	{
    	if(new Suiluppo_course_applicationUtil().checkApplicantUnderCourse(su.getCourse_id(), user.getFullName())){
    	%>
       <tr>
       <td><%=su.getCourse_id() %></td> 
       <td><%=su.getDocente() %></td> 
       <td><%=su.getEvento_Progetto()%></td>
       <td><%=su.getTitolo()%></td>
       <td><%=su.getData_Inizio()%></td>
       <td><%=su.getData_Fine()%></td>
       <td><%=su.getTot_Ore()%></td>
       <td><%=su.getVisibile()%></td>
       <td><%=su.getBloccato()%></td>
       <td>
       <table>
       <tbody>
       <tr>
       <td style="padding: 5px;"><span onclick="getCourseViewId('<%=su.getCourse_id() +""%>')" class="btn btn-primary btnview"><liferay-ui:message key="View"/></span></td>
       <td style="padding: 5px;"><span id="<%="btn_"+su.getCourse_id()%>"  onclick="getCourseApplyId('<%=su.getCourse_id() +""%>')" class="btn btn-warning btnedit"><liferay-ui:message key="Applied"/></span></td>	
       </tr>
       </tbody>
       </table>
        </td>
   		</tr>  
    	<%	
      	 }
    	}   	
   }
    }%>
   
    </tbody>
    </table>

</div>


<script>
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
	                title :'Course View',
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
	                    height:800
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });
			
}
function getCourseApplyId(courseId,userName)
{
		var ID="#btn_"+courseId;
		if($(ID).text()=="<liferay-ui:message key="Applied"/>"){
			alert('Hai già applicato per esso');
			return false;
		}
		formSubmiting(courseId,userName);
	   
}

</script>

<portlet:actionURL name="addApplicant" var="addApplicant">
<portlet:param name="mvcPath" value="/listCourse.jsp"/> 
</portlet:actionURL>
<script type="text/javascript">
function formSubmiting(courseId,userName){
	var ID="#btn_"+courseId;
	AUI().use('aui-base','aui-io-request', function(A){
		//aui ajax call to get updated content
		A.io.request('<%=addApplicant%>',{
  		dataType: 'json',
  		method: 'POST',
  		data:{'<portlet:namespace/>courseId':courseId,'<portlet:namespace/>Applicant_Name':userName,'<portlet:namespace/>email':'<%=user.getEmailAddress()%>'},
  		on: {
   			 success: function() {
   			 $(ID).text('<liferay-ui:message key="Applied"/>');
   			 alert("Applicato con successo per il corso!");
   			 location.reload();
    		}
  		}
		});
		});
	    //aui ajax call to get updated content
}
</script>