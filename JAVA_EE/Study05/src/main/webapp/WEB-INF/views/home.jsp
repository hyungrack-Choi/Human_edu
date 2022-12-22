<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<br>
<div id=dvHead style='width:100%'></div>
<table id=tblList border=1>
	<tr><th>게시물번호</th><th>제목</th><th>작성자</th><th>등록일</th><th>수정일</th><th>작업선택</th></tr>
	<c:forEach var="post" items="${postlist}">
		<tr><td><label id=lblPost_id>${post.post_id}</label></td><td>${post.title}</td><td>${post.writer}</td><td>${post.created}</td><td>${post.updated}</td>
		<td><input type=button id=btnView value='보기'>
		<c:if test="${gUserid eq post.writer}">
			<input type=button id=btnupdate value='수정'>
			<input type=button id=btnDel value='삭제'>
		</c:if>
		</td></tr>
	</c:forEach>	
</table>
<br>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	$.post('/logincheck',{},function(data){
		console.log("data="+data);
		if(data == ''){
			str="<div class='login'><a href='login'>로그인</a>&emsp;&emsp;<a href='signin'>회원가입</a></div><br><br>";
		}else {
			str="<div class='login'>"+data+"&emsp;&emsp;<input type=button id=lblSignout value='로그아웃'></div><br><br>";
		}
		$('#dvHead').html(str);
		if(data!=''){
			$('body').append('<input type=button id=btnWrite value="글작성">');
		}
	},'text');
})
.on('click', '#lblSignout', function(){
	$.post('/signout', {}, function(data){
		if(data=="ok"){
			document.location="/";
		} else {
			alert('로그아웃 실패. 다시 시도하십시오.');
		}
	}, 'text');
})

.on('click', '#btnWrite', function(){
	document.location="/write";
	return false;
})
.on('click', '#btnView', function(){
	let ndx = $(this).parent().parent().index();
	console.log(ndx);
	let str = $('#tblList tr:eq('+ndx+') td:eq(0)').text(); 
	document.location="/view?post_id="+str;
	return false;
})
.on('click', '#btnDel', function(){
	if(confirm('정말로 삭제할까요?')){
		let ndx = $(this).parent().parent().index();
		console.log(ndx);
		let str = $('#tblList tr:eq('+ndx+') td:eq(0)').text(); 
		document.location="/delete?post_id="+str;
	}
	return false;
})

.on('click', '#btnupdate', function(){
	let ndx = $(this).parent().parent().index();
	console.log(ndx);
	let str = $('#tblList tr:eq('+ndx+') td:eq(0)').text(); 
	document.location="/update?post_id="+str;
	return false;
})

</script><style>
.login
{
	margin: auto;
	text-align: center;
	
}
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
.dbutton
{
	margin: auto;
	text-align: right;
	
}
.loininfo
{
	margin: auto;
	text-align: center;
	
}
label {
	display:inline-block;
	text-align:center;
	margin: auto;
	font-weight:bold;
}
.hello{

  border : 0px;
  height : 600px;
  display : flex;
  justify-content : center;
  align-items : center;
}
</style>
</html>