<%@page import="com.liferay.daffo.service.prontuario_drugLocalServiceUtil"%>
<%@page import="com.liferay.daffo.model.prontuario_drug"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
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

<span id="add-new" class="btn btn-success"><liferay-ui:message key="NewDrug"/></span>
<div class="form-group pull-right">
    <input type="text" style=" -webkit-border-radius: 5px;  -moz-border-radius: 5px;     border-radius: 5px;    border: 1px solid #848484; outline:0;     width: 300px; " class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
    <i class="icon-search"></i>
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
<thead>
    <tr class="bg-primary">
    <%--<th><b>#</b></th> --%>
     <th><b>Codice</b></th>
    <th><b>Gruppo</b></th>
    <th><b>SottoGruppo</b></th>
    <th><b>Principio Attivo </b></th>
    <th><b>Nome Commerciale </b></th>
    <th><b><liferay-ui:message key="action"/></b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="7"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
  </thead>
    <tbody>
    <%
    List<prontuario_drug> pd=prontuario_drugLocalServiceUtil.getprontuario_drugs(0, prontuario_drugLocalServiceUtil.getprontuario_drugsCount());
    for(prontuario_drug p:pd){
    %>
    <tr>
    <td><%=p.getCodice() %></td>
    <td><%=p.getGruppo()%></td>
    <td><%=p.getSottoGruppo() %></td>
    <td><%=p.getPrincipio_Attivo() %></td>
    <td><%=p.getNome_Commerciale()%></td>
    <td>
    <span onClick="getRowId('<%=p.getDrug_id()%>')" class="btn btn-warning"><liferay-ui:message key="Edit"/></span>
    </td>
    </tr>
    <%
    }
    %>
    </tbody>
</table>


<script>

function getRowId(data){
	
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    portletURL.setParameter('data', data);    
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/html/prontuario/drug_edit.jsp');
  /*  Liferay.Util.openWindow({
		dialog: {
		centered: true,
		cssClass: 'my-liferay-popup',
		constrain2view: true,
		modal: true,
		width: 700,
		height:450
		},
		id: '<portlet:namespace/>Edit_Drug',
		title: 'Edit Drug' ,
		uri:  portletURL.toString()
		});	 */
    YUI().ready(function(A) {
        YUI().use('aui-base','liferay-util-window', function(A) {
            Liferay.Util.Window.getWindow({
                title :'<liferay-ui:message key="EditDrug"/>',
                uri: portletURL,
                id:'<portlet:namespace/>Edit_Drug',
                dialog: {
                	centered: true,
                    destroyOnHide: true,
                    cache: false,
                    modal: true,
                    width: 800,
            		height:500
                }
            }).after('destroy', function(event) {
            	//It will refresh
            	location.reload();
            });
        });
    });
} 

$("#add-new").click(function(){
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    //portletURL.setParameter('data', pagedata);    
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/html/prontuario/drug_add.jsp');
    // Now we can use the URL
  // alert(portletURL.toString());
  /*  Liferay.Util.openWindow({
		dialog: {
		centered: true,
		cssClass: 'my-liferay-popup',
		constrain2view: true,
		modal: true,
		width: 700,
		height:450
		},
		id: '<portlet:namespace/>Add_New_Drug',
		title: 'Add New Drug' ,
		uri:  portletURL.toString()
		}); */
    YUI().ready(function(A) {
        YUI().use('aui-base','liferay-util-window', function(A) {
            Liferay.Util.Window.getWindow({
                title :'<liferay-ui:message key="AddNewDrug"/>',
                uri: portletURL,
                id:'<portlet:namespace/>Add_New_Drug',
                dialog: {
                	centered: true,
                    destroyOnHide: true,
                    cache: false,
                    modal: true,
                    width: 800,
            		height:500
                }
            }).after('destroy', function(event) {
            	//It will refresh
            	location.reload();
            });
        });
    });
	
});
</script>


<!-- <aui:script> 
Liferay.provide(window,'<portlet:namespace/>windowRefresh', function() 
	{
	alert("Hello");
	location.reload();
	}, 
	['liferay-util-window'] 
	); 
</aui:script> -->