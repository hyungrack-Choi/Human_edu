package human05;

import java.util.Scanner;

public class Human08 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");			
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");			
			System.out.println("---------------------");			
			System.out.printf("<선택>");
			
			int choice = sc.nextInt();

			switch(choice) {
			case 1: // char 단일 문자는 ' ' String 문자는 "" 안에 표시 숫자는 그냥표시 
				System.out.print("예금액 > ");
				int x = sc.nextInt();
				balance = balance + x;
				break;
			case 2:
				System.out.print("출금액 > ");				
				balance = balance - sc.nextInt();
				break;
			case 3:
				System.out.printf("잔고 > %d \n", balance);
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
			}
		}	
		sc.close();
	}
}
