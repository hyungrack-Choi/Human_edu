<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>로그인아이디 : </td>
			<td><input type=text id=loginid>&nbsp;			
			<input type=button id=btnDuplicate value='중복확인'>
			<input type=hidden id=bDuplicate>
			</td>
		</tr>
		<tr>
			<td>비밀번호 : </td>
			<td><input type=password id="passcode1"></td>
		</tr>
		<tr>
			<td>비밀번호 확인 : </td>
			<td><input type=password placeholder="비밀번호를 다시 입력하세요" id="passcode2"></td>
		</tr>
		<tr>
			<td>실명 : </td>
			<td><input type=text id=name></td>
		</tr>
		<tr>
			<td>모바일번호 : </td>
			<td><input type=text id=mobile></td>
		</tr>
		<tr>
			<td colspan=2 style="text-align: center">
			<input type=button id=btnsubmit value=회원가입>
			<button type=reset>취소</button>
			</td>
		</tr>
		<tr>
			<td style="text-align: left"><a href="/">홈으로</a></td>
			<td style="text-align: right"><a href="/login">로그인하기</a></td>	
		</tr>
	</table>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click', '#btnDuplicate', function(){
	if($('#loginid').val()=='') return false;
	$('#bDuplicate').val('');
	$.post('/checkDup', {loginid:$('#loginid').val()}, function(data){
		if(data=='1'){
			alert('이미 사용중인 아이디입니다.');
		} else {
			alert('사용가능한 아이디입니다.');
			$('#bDuplicate').val('ok');
		}
	}, 'text');
	return false;
})
.on('click', '#btnsubmit', function(){
	
	if($('#loginid').val() =='' || $('#name').val()==''|| $('#moblie').val()==''){
		alert('빈값은 허용되지 않습니다.');
		return false;
	}
	if($('#bDuplicate').val() !="ok"){
		alert('중복확인하십시오');
		return false;
	}
	if($('#passcode1').val() != $('#passcode2').val()){
		alert('비밀번호와 확인이 일치하지 않습니다.');
		return false;
	}
	$.post("/viewuser",{loginid:$('#loginid').val(), passcode1:$('#passcode1').val(),
		name:$('#name').val(),mobile:$('#mobile').val()},function(data){
		if(data=='ok'){
			document.location='/login';
		} else {
			alert("회원가입실패");
			$('#loginid,#passcode1,#passcode2,#name,#mobile,#bDuplicate').val('');
		}
	},'text');
})
</script>
<style>
table {
    margin:auto; 
}
table .td{
	margin:auto;
}
</style>
</html>