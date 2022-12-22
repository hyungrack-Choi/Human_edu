<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room type</title>
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
<h1>Roomtype Welcome to World</h1>
<table border=1 id="tblList">
<tr><th>Type Number</th><th>Type Name</th></tr>
<c:forEach var="roomtype" items="${rt}">
	<tr><td>${roomtype.typenum}</td><td>${roomtype.typename}</td></tr>
</c:forEach>
</table>

<form id="fromControl" action="/controllRoomType">
<input type=text id=optype name=optype value='insert'>
	<table>
		<tr><td colspan=2>&nbsp;</td></tr>
		<tr><td colspan=2>
				<table>
					<tr><td>Type Number</td><td><input type=text name=typenum id=typenum readonly></td></tr>
					<tr><td>Type Name</td><td><input type=text name=typename id=typename></td></tr>
					<tr><td colspan=2 align=center>
						<input type=button value='등록' id=btnAddNew>
						<input type=button value='삭제' id=btnDelete>
						<input type=button value='비우기' id=btnReset>
					</td></tr>
				</table>
		</td></tr>
	</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click', '#btnDelete',function(){
	if($('#typenum').val() =='' || $('#typename').val()=='') return false;
	$('#optype').val('delete');
	$('#fromControl').submit();
})
.on('click', '#btnAddNew', function(){
	if($('#typename').val() =='') return false;
	$('#fromControl').submit();
})
.on('click', '#btnReset', function(){
	$('#typenum,#typename').val('');
	return false;
})
.on('click', '#tblList tr', function(){
	
	let typenum = $(this).find('td:eq(0)').text();
	let typename = $(this).find('td:eq(1)').text();
	$('#typenum').val(typenum);
	$('#typename').val(typename);
	$('#optype').val('update');
	return false;
})
.on('click', '#goHome', function(){
	document.location='/';
})
;
</script>
</html>