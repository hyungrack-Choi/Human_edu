<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method=post action=/viewuser id=frmconfirm>
	<table>
		<tr>
			<td>로그인아이디 : </td>
			<td><input type=text name=userid id=userid></td>
		</tr>
		<tr>
			<td>비밀번호 : </td>
			<td><input type=password id="passcode1" name=passcode1></td>
		</tr>
		<tr>
			<td>비밀번호 확인 : </td>
			<td><input type=password placeholder="비밀번호를 다시 입력하세요" id="passcode2" name=passcode2></td>
		</tr>
		
		<tr>
			<td>실명 : </td>
			<td><input type=text name=name id=name></td>
		</tr>		
		<tr>
			<td>당신의 생일은 :</td>
	   		<td><input type=date name=userBirthday></td>
    	</tr>
		<tr>
			<td>모바일번호 : </td>
			<td><input type=text name=moblie id=moblie></td>
		</tr>
		<tr>
			<td colspan=2 style="text-align: center">
			<input type=submit id=btnsubmit value=회원가입>
			<button type=reset>취소</button>
			</td>
		</tr>
		<tr>
			<td style="text-align: left"><a href="/">홈으로</a></td>
			<td style="text-align: right"><a href="/login">로그인하기</a></td>	
		</tr>
		
	</table>
</form>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('submit', '#frmconfirm', function(){
// 	if(#('#userid').val() == '' || $('#name').val=='' || $('#moblie').val==''){
// 		alert('널값을 넣을수 업습니다.');
// 		return false;
// 	}
	if($('#userid').val() == '' || $('#name').val() == '' || $('#passcode2').val() == '' || $('#moblie').val()== ''){
		alert("널값을 넣을수 없습니다.");
		return false;
	} else if($('#passcode1').val() == $('#passcode2').val()){
        alert("비밀번호가 정상적으로 입력되었습니다.");
        return true;
	} else{
        alert("비밀번호가 일치 하지 않습니다.");
        return false;
	} 
})
.on('blur', '#passcode2', function(){
// 	if($('#passcode1').val() == $('#passcode2').val()){
//         alert("비밀번호가 정상적으로 입력되었습니다.");
//         return true;
// 	} else{
//         alert("비밀번호가 일치 하지 않습니다.");
//         return false;e
// 	}
	
	let id = $("#userid").val();
	let pw1 = $("#passcode1").val();
	let pw2 = $("#passcode2").val();	
	let number1 = pw1.search(/[0-9]/g);
	let number2 = pw2.search(/[0-9]/g);
	let english1 = pw1.search(/[a-z]/ig);
	let english2 = pw2.search(/[a-z]/ig);
	let spece1 = pw1.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi);
	let spece2 = pw2.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi);
	let reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
	if (pw1.length < 8 || pw1.length > 20 && pw2.length < 8 || pw2.length > 20 ) {
	    alert("8자리 ~ 20자리 이내로 입력해주세요.");
	    return false;
	} 
	else if (pw1.search(/\s/) != -1 && pw2.search(/\s/) != -1) {
	    alert("비밀번호는 공백 없이 입력해주세요.");
	    return false;
	}
	else if (number1 < 0 || english1 < 0 || spece1 < 0 && number2 < 0 || english2 < 0 || spece2 < 0) {
	    alert("영문,숫자,특수문자를 혼합하여 입력해주세요.");
	    return false;
	}
	else if ((number1 < 0 && english1 < 0) || (english1 < 0 && spece1 < 0) || (spece1 < 0 && number1 < 0) && (number2 < 0 && english2 < 0) || (english2 < 0 && spece2 < 0) || (spece2 < 0 && number2 < 0)) {
	    alert("영문,숫자, 특수문자 중 2가지 이상을 혼합하여 입력해주세요.");
	    return false;
	}
	else if (/(\w)\1\1\1/.test(pw1) && /(\w)\1\1\1/.test(pw2)) {
	    alert('같은 문자를 4번 이상 사용하실 수 없습니다.');
	    return false;
	} 
// 	else if (pw1.search(id) > -1 && pw2.search(id) > -1) {
// 	    alert("비밀번호에 아이디가 포함되었습니다.");
// 	    return false;
// 	} 
	else if (false === reg.test(pw1) && false === reg.test(pw2)) {
	    alert('비밀번호는 8자 이상이어야 하며, 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.');
	    return false;
	} 
	else {
	    alert("비밀번호가 정상적으로 입력되었습니다.");
	    return true;
	}
});
/* .on('click','#btnsubmit', function(){
	if($('#passcode1').val() == $('#passcode2').val()){
		$('#freconfirm').submit();
	} else{
        alert("비밀번호가 일치 하지 않습니다.");
        return false;
	}
}); */

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