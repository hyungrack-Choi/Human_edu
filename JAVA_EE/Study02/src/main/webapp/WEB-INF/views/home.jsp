<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.login
{
	margin: auto;
	text-align: center;
	
}
.loininfo
{
	margin: auto;
	text-align: center;
	
}
.hello{

  border : 0px;
  height : 600px;
  display : flex;
  justify-content : center;
  align-items : center;
}
</style>
</head>
<body>
<%-- <c:if test="${empty userid}">
<div class="login"><a href="login">로그인</a>&emsp;&emsp;<a href="signin">회원가입</a></div>
</c:if>
<c:if test="${not empty userid}">
<div class="loininfo">${userid}&emsp;&emsp;<input type=submit value=로그아웃 id="btnlogOut"></div>

</c:if> --%>
<%
	if(session.getAttribute("gUserid")==null){
		out.print("<div class='login'><a href='login'>로그인</a>&emsp;&emsp;<a href='signin'>회원가입</a></div>");
	} else {
// 		out.print("<div class='loininfo'>"+session.getAttribute("gUserid")+"&emsp;&emsp;<input type=submit value=로그아웃 id='btnlogOut'></div>");
		out.print("<div class='loininfo'>"+session.getAttribute("gUserid")+"&emsp;&emsp;<a href='/logout'>로그아웃</a></div>");
		
	}
%>
<div class="hello">Welcome to my home</div>

</body>

<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click', '#btnlogOut', function(){
	document.location="/logout";
})
</script>
</html>