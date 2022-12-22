package human02;

import java.util.Scanner; // 패키지추가

public class HumanEx06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //키보드로부터 입력 받겠다.
		int age;
		System.out.print("당신의 나이를 입력하세요?");
		age = sc.nextInt();
		System.out.printf("age = %d \n", age);
		sc.nextLine();		//위 int 메소드 사용후 청소 후 다시 nextline메소드 열어서 강제로 지꺼기 소화.

		System.out.print("당신의 이름은? ==>");
		String name;
		name = sc.nextLine(); //문자형으로 받음
		
		System.out.printf("당신의 이름은 %s입니다 \n", name);
		
		System.out.print("오늘의 온도는? ==>");		
		double temperature;
		temperature = sc.nextDouble();
		System.out.printf("오늘의 온도는 %10.5f 도 입니다.\n", temperature);
		//%앞에 실수 4자리 //소수점 . 1 자리 표시 수 // 플롯표시 f
		System.out.print("----------------------");
		
		sc.close();
		
	}

}
