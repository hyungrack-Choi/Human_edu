<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Room Type</title>
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
<form action=/insertRT id=frmInsert>
<table border=1 align=center>
<tr><td>객실타입명</td><td><input type=text id=typename name=typename></td></tr>
<tr><td align=center colspan=2><input type=submit value='등록'></td></tr>
</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('submit', '#frmInsert', function(){
	if($('#typename').val()==''){
		alert('객실타입명을 입력하시오');
		return false;
	}
	return true;
}) 
.on('click', '#goHome', function(){
	document.location='/';
})
</script>
</html>