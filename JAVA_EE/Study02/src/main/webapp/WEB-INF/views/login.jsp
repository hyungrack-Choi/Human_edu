<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
table {
    margin:auto; 
}
table .td{
	margin:auto;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td>아이디 : </td>
			<td><input type=text name=userid id=userid></td>
		</tr>
		<tr>
			<td>비밀번호 : </td>
			<td><input type=password name=passcode id=passcode></td>
		</tr>
		<tr>
			<td colspan=2 style="text-align: center">
			<input type=button value=로그인 id=btnGo>
			<button type=reset>취소</button>
			</td>
		</tr>
		<tr>
			<td style="text-align: left"><a href="/">홈으로</a></td>
			<td style="text-align: right"><a href="/signin">회원가입</a></td>	
		</tr>
		
	</table>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click', '#btnGo', function(){
	if($('#userid').val()=='' || $('#passcode').val()==''){
		alert('로그인/비밀번호를 입력하세요');
		return false;
	}
	$.post('/checkuser', {userid:$('#userid').val(), passcode:$('#passcode').val()}, function(data){
		if(data=='ok'){
			document.location="/";
		} else {
// 			document.location="/login";
			alert('로긴실패. 아이디와 비밀번호가 정확히 입력되어야 합니다.');
			$('#userid,#passcode').val('');
		}
	}, 'text');
	return true;
})
</script>
</html>