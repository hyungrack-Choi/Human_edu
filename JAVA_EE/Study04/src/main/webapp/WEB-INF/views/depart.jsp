<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>department world</title>
</head>
<style>
body{
	margin: auto;
	text-align: center;
}
table{
	border: 1px solid;
    border-collapse: collapse;
	margin:auto;
}
th,td{
	border: 1px solid;
	margin:auto;

}
</style>
<body>
<input type=button value='처음으로' id='goHome'>
<h1>welcome to depart !!!</h1><br>
<table>
<tr><th>사번</th><th>사원 부서</th><th>상급부서</th><th>상급부서장</th></tr>
<c:forEach var="depart" items="${dedto}">
	<tr><td>${depart.department_id}</td><td>${depart.department_name}</td>
	<td>${depart.parent_name}</td><td>${depart.emp_name}</td></tr>
</c:forEach>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click', '#goHome', function(){
	document.location='/';
})</script>
</html>