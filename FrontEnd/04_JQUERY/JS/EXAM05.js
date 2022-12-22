$(document).ready(function(){
        //단독 이벤트
        $(".btn1 a").click(function(){
            alert("휴먼교육센터1");
        });
        $(".btn1 a").mouseout(function(){
            alert("휴먼교육센터2");
        });
    });