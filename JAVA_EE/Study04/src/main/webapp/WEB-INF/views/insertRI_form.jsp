<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body><br>
<input type=button value='처음으로' id='goHome'><br><br>
<form id=frmInsertRI action="/insertRI">
<table>
<tr><td>객실명</td><td><input type=text name=name id=name></td></tr>
<tr><td>객실타입</td><td><input type=text name=type id=type></td></tr>
<tr><td>숙박가능인원</td><td><input type=number name=howmany id=howmany></td></tr>
<tr><td>1박요금</td><td><input type=number name=howmuch id=howmuch></td></tr>
<tr><td colspan=2 style="margin: auto; text-align: center;"><input type=submit value='등록'><input type=button value='목록' id='listview'></td></tr>
</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('submit', '#frmInsertRI', function(){
	if($('#typename').val()==''){
		alert('객실명을 입력하시오');
		return false;
	}
	if($('#type').val()==''){
		alert('객실타입을 입력하시오');
		return false;
	}
	if($('#howmany').val()==''){
		alert('숙박가능인원을 입력하시오');
		return false;
	}
	if($('#howmuch').val()==''){
		alert('1박요금을 입력하시오');
		return false;
	}
	return true;
}) 
.on('click', '#listview', function(){
	document.location='/roominfo';
}) 
.on('click', '#goHome', function(){
	document.location='/';
})
</script>
</html>