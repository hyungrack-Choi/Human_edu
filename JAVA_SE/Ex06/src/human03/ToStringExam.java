package human03;

import java.util.Date;

public class ToStringExam {

	public static void main(String[] args) {

		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		//date라는 클래스안에는 toString이 오버라이딩이 되어있음.
		//그래서 날짜 형식으로 출력이 되고 있음.
		
	}

}
