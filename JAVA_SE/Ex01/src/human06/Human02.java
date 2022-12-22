package human06;

import java.util.Scanner;

public class Human02 {

	public static void main(String[] args) {
		
		// 사용자로부터 2개의 정수를 입력받고, 사칙연산 수행하는 프로그램
		// 함수(메서드)를 활용하여 작성.
		
		int x1, x2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X1 = \t");
		x1 = sc.nextInt();
		System.out.print("x2 = \t");
		x2 = sc.nextInt();
		
		int result1, result2, result3;
		double result4;
		
		
		result1 = add(x1,x2);
		result2 = minus(x1,x2);
		result3 = multiple(x1,x2);
		result4 = division(x1,x2);
		System.out.printf("x1 + x2 = %d \n", result1);
		System.out.printf("x1 - x2 = %d \n", result2);
		System.out.printf("x1 X x2 = %d \n", result3);
		System.out.printf("x1 / x2 = %f \n", result4);
		
		sc.close();
	}

	private static double division(int x1, int x2) {
		
		double z;
		z = (double)x1 / (double)x2;
		//z = x1 / x2; //정수/정수는 실수이긴 하나 소수점 이하 절삭 처리됨
		return z;
	}

	private static int multiple(int x1, int x2) {
		int z;		
		z = x1 * x2;
		return z;
	}

	private static int minus(int x1, int x2) {
		int z;
		z = x1 - x2;
		return z;
	}

	private static int add(int x1, int x2) {
		int z;
		z = x1 + x2;
		return z;
	}

}
