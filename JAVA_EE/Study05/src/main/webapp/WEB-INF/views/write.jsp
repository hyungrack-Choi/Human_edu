<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글 작성</title>
</head>
<body>
<form id=frmInsert method=post action="/insert">
<br>
<h1 align=center>글을 적으세요</h1>
<table>
	<tr><td>제목&emsp;</td><td><input type=text name=title id=title required></td></tr>
	<tr><td>내용&emsp;</td><td><textarea id=content name=content rows=10 cols=80 required></textarea></td></tr>
	<tr><td colspan=2 align=center><input type=submit value='등록'>&emsp;<input type=reset value='비우기'>&emsp;<input type=button id=golist value='리스트보기'></td></tr>
</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>

$(document)
.on('submit', '#frmInsert', function(){
	if($('#title').val() == '' || $('#content').val() == '' || $('#wname').val() == ''){
		alert("널값을 넣을수 없습니다.");
		return false;
	}
})
.on('click', '#golist', function(){
	document.location="/";
	return false;
})
</script>
<style>
body{
	margin: auto;
}
table{
    border-collapse: collapse;
	margin:auto;
}
</style>
</html>