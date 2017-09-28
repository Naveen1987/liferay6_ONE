<%@page import="com.liferay.daffo.service.prontuario_drugLocalServiceUtil"%>
<%@page import="com.liferay.daffo.model.prontuario_drug"%>
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

<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
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
    </tr>
    <%
    }
    %>
    </tbody>
</table>

