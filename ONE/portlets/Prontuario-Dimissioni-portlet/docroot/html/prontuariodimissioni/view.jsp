<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>


<div style="text-align:center">
<br/>
<div>
<a class="medownload" href=""><img src="<%=request.getContextPath() %>/img/download.png"/></a>
</div>
</div>

<script>
$('.medownload').click(function(e) {
    e.preventDefault();  //stop the browser from following
    window.location.href = '<%=request.getContextPath()%>/img/PRONTUARIO ALLA DIMISSIONE APR 2011.pdf';
});
</script>