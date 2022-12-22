<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>room info</title>
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
    border-collapse: collapse;
 	margin:auto; 

}
</style>
<body><br>
<input type=button value='처음으로' id='goHome'>
<h1>room Info Welcome to World</h1>
<table border=1 id="tblList">
<tr><th>번호</th><th>이름</th><th>타입</th><th>인원수</th><th>가격</th></tr>
</table>
<input type=text id=optype name=optype value='insert'>
	<table>
		<tr><td colspan=2>&nbsp;</td></tr>
		<tr><td colspan=2>
				<table>
					<tr><td>번호</td><td><input type=text name=num id=num readonly></td></tr>
					<tr><td>이름</td><td><input type=text name=name id=name></td></tr>
					<tr><td>타입</td><td>
					<select id=type name=type>
					</select>
					</td></tr>
					<tr><td>인원수</td><td><input type=text name=howmany id=howmany></td></tr>
					<tr><td>가격</td><td><input type=text name=howmuch id=howmuch></td></tr>
					<tr><td colspan=2 align=center>
						<input type=button value='등록' id=btnAddNew>
						<input type=button value='삭제' id=btnDelete>
						<input type=button value='비우기' id=btnReset>
					</td></tr>
				</table>
		</td></tr>
	</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	loadRoomInfo();
	loadRoomInfotype();
})
.on('click', '#btnDelete',function(){
	if($('#num').val() =='' || $('#name').val() =='') return false;
	$.get('/cudRoomInfo',
			{optype:'delete',num:$('#num').val()},
		function(data){
				loadRoomInfo();
				loadRoomInfotype();
			$('#btnReset').trigger('click');
	},'text');
	return false;
})
.on('click', '#btnAddNew', function(){
		
	if($('#name').val() =='' 
	|| $('#type').val() =='' 
	|| $('#howmany').val() =='' 
	|| $('#howmuch').val() =='' )
		return false;
	$.get('/cudRoomInfo',
			{optype:$('#optype').val()
		,num:$('#num').val()
		,name:$('#name').val()
		,type:$('#type').val()
		,howmany:$('#howmany').val()
		, howmuch:$('#howmuch').val()},
		function(data){
			loadRoomInfo();
			loadRoomInfotype();
			$('#btnReset').trigger('click');
	},'text');
	return false;
	
})
.on('click', '#btnReset', function(){
	$('#num,#name,#typen,#howmany,#howmuch').val('');
	$('#optype').val('insert');	
	return false;
})
.on('click', '#tblList tr', function(){
	let num = $(this).find('td:eq(0)').text();
	let name = $(this).find('td:eq(1)').text();
	let type = $(this).find('td:eq(2)').text();
	let howmany = $(this).find('td:eq(3)').text();
	let howmuch = $(this).find('td:eq(4)').text();
	$('#num').val(num);
	$('#name').val(name);
	$('#typen').val(type);
	$('#howmany').val(howmany);
	$('#howmuch').val(howmuch);
	$('#optype').val('update');
	return false;
})
.on('click', '#goHome', function(){
	document.location='/';
})

function loadRoomInfo(){
	$('#tblList tr:gt(0)').remove();
	$.get('/getRoomInfo',{},function(data){
		console.log(data);
		for(i=0; i<data.length; i++){
			let rtype=data[i];
			let str='<tr><td>'+rtype['num']+'</td><td>'
			+rtype['name']+'</td><td>'
			+rtype['type']+'</td><td>'
			+rtype['howmany']+'</td><td>
			'+rtype['howmuch']+'</td></tr>';
			$('#tblList').append(str);
		}
	}, 'json');
}
function loadRoomInfotype(){
	$.get('/getRoomInfoType',{},function(data){
		console.log(data);
		for(i=0; i<data.length; i++){
			let rtype=data[i];
			let str='<option value='+rtype['typenum']+'>'+rtype['typename']+'</option>';
			$('#type').append(str);
		}
	}, 'json');
}
</script>
</html>