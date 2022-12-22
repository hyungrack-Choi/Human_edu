<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 보기</title>
</head>
<body>
<table>
<tr><td>게시물번호</td><td><label id=lblPost_id>${post_id}</label></td></tr>
<tr><td>제목</td><td><input type=text id=lblTitle value='${title}'></td></tr>
<tr><td>내용</td>
	<td valign=top><textarea id=content name=content rows=10 cols=80>${content}</textarea></td></tr>
<tr><td>작성자</td>
	<td><label id=lblWriter>${writer}</label></td></tr>
<tr><td>작성시각</td><td>${created}</td></tr>
<tr><td>수정시각</td><td>${upated}</td></tr>		
<tr><td colspan=2 align=right><input type=button value='확인' id=btnmodify><a href='/'>목록보기</a></td></tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click', '#btnmodify', function(){
	let post_id = $('#lblPost_id').text();
	let title = $('#lblTitle').val();
	let content = $('#content').val();
	console.log(post_id);
	console.log(title);
	console.log(content);
	document.location="/updateok?post_id="+post_id+"&title="+title+"&content="+content;
	return false;
})

</script>
</html>
