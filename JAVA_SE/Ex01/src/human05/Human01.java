package human05;

import java.util.Scanner;

public class Human01 {

	public static void main(String[] args) {
		// a= 5
		
		int a;
		
		System.out.print("몇단을 출력할까요?");
		Scanner sr = new Scanner(System.in);
		a = sr.nextInt();
		
		/*
		 * for(int i= 1; i < 10; i++) {
		 * 
		 * System.out.printf("%d 곱하기 %d는 %d이다. \n", a, i, a*i);
		 * 
		 * }
		 */

		System.out.printf("%d 단 입니다. \n", a);
		int b =1;
		while (b<=9) {
			System.out.printf("%d X %d = %d \n", a, b, a*b);
			b++;
		}
		sr.close();
		
	}

}
