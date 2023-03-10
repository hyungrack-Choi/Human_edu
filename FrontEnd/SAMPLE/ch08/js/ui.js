$(document).ready(function(){
	$("#container").addClass("start");
	$("nav li").click(function(){
		$("#container").css("max-width", "100%")
		var id=$(this).attr("data-rol");    
		$("nav li").removeClass("on");    
		$(this).addClass("on");    
		$(".content").removeClass("prev this next");     
		//클릭 시 가지고 있던 클래스를 모두 지운다    
		$("#" + id).addClass("this").prevAll().addClass("prev");    
		//클릭한 메뉴와 매칭 되는 id에 this 클래스를 지정하고 그 앞의 모든 <section> 태그는 .prev클래스를 지정한다    
		$("#" + id).nextAll().addClass("next");    
		//클릭한 메뉴와 매칭 되는 id의 뒤에 오는 <section> 태그는 .next 클래스를 지정한다     
	});
	//로고 클릭 시
	$(".logo_box").click(function(){
		$("nav li").removeClass("on");
		$(".content").removeClass("prev this next");
		$("#container").css("max-width", "1200px");
	});
	//롤링배너 왼쪽
	$(".roll_left").click(function(){
		$(".book_roll li").eq(0).insertAfter(".book_roll li:last-child");
	});
	//롤링배너 오른쪽
	$(".roll_right").click(function(){
		$(".book_roll li").eq(-1).insertBefore(".book_roll li:first-child");
	});
	//ajax 사용하기
	$(".book_roll li").click(function(){
		var _this =$(this); //this는 클릭된 li tag를 지칭함.
		var liurl =_this.data("url");//data("url")는 data-rul을 의미함. 어튜리뷰트
		$(".notebook").html();

		// $.ajax({
		// 	//ajax는 비동기
		// 	type : 'post', //HTTP 요청 방식
		// 	url : liurl, //해당 url
		// 	dataType : 'html', //data 타입 //html문서로 받겠다. (json으로 받을수도 있다.)
		// 	success : function(data) { //HTTP 요청 성공 후 데이터 전송
		// 		//data는 비동기 통신을 통해서 회신된 데이터를 의미함.(넣는게아니라 받아온값임)
		// 		$(".notebook").html(data);//data를 넣는다.
		// 	}
		// });
		
	});
	//faq 게시판
	$(".accordio_box ol li").click(function(){
		// 목록 선택시 on으로 된 class는 모두 제거함.
		$(".accordio_box ol li").removeClass("on");
		// 선택된 것만 on으로 class 화 함.
		// TEST : 아래 내용 주석처리하여 선택이 되지 않음을 확인.
		$(this).addClass("on");
	});
});

