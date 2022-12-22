package human18.testB;

import human18.testA.Student;

//import human18.testA.*;//*모든패키지불러오기
//ctrl + shift + o //import하기 

public class StudentEx {

	public static void main(String[] args) {
		//다른 패키지의 클래스를 사용하는 방법
		//case1. 패키지명을 붙임.
//		
//		human18.testA.Student s1 = 
//		new human18.testA.Student("강혁준", 88);
//		
//		s1.showInfo();
//---------------------------------------------
		//case2. import 사용.
		Student s1 = new Student("강혁준", 88);
		
		s1.showInfo();
	}
}