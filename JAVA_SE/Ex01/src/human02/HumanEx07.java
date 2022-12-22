package human02;

import java.util.Scanner;

public class HumanEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	
		
		int score = sc.nextInt();
		char grade = (score>90) ? 'a' : 'b';
		
		System.out.printf("score = %d , grade = %c \n", score, grade);
		sc.close();
	}

}
