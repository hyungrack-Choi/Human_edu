<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<h1>welcome to MyBatis World !!!</h1><br>
<input type=button value=roomtype id=roomtype>
<input type=button value=depart id=depart>
<input type=button value=insertRT_form id=insertRT_form>
<input type=button value=insertRI_form id=insertRI_form>
<input type=button value=roominfo id=roominfo>
<input type=button value=emplist id=emplist>
<input type=button value=xroomtype id=xroomtype>

<br><br>
<table>
<tr><th>사번</th><th>이름</th><th>월급여</th><th>매니저이름</th></tr>
<c:forEach var="person" items="${worker}">
	<tr><td>${person.employee_id}</td><td>${person.emp_name}</td>
	<td>${person.salary}</td><td>${person.manager_name}</td></tr>
</c:forEach>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click', '#roomtype', function(){
	document.location='/roomtype';

})

.on('click', '#depart', function(){
	document.location='/depart';
})

.on('click', '#insertRT_form', function(){
	document.location='/insertRT_form';
})


.on('click', '#insertRI_form', function(){
	document.location='/insertRI_form';
})
.on('click', '#roominfo', function(){
	document.location='/roominfo';
})
.on('click', '#emplist', function(){
	document.location='/emplist';
})
.on('click', '#xroomtype', function(){
	document.location='/xroomtype';
})
;
</script>
</html>