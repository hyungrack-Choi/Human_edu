package human07;

import java.util.Scanner;

public class Human09 {

	public static void main(String[] args) {

		//키보드로 학생 수와 각 학생들의 점수를 입력받아 최고 점수 및 평균 점수를 구하는 프로그램
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 종료");
			System.out.println("-------------------------------------");
			System.out.print("<선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.printf("학생수 >");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {	
				for (int x=0; x<studentNum; x++) {
					System.out.printf("score [%d] = ", x);
		             scores [x] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for(int x = 0; x< studentNum; x++) {
					System.out.printf("score [%d] = %d \n", x, scores[x]);
				}
			} else if (selectNo == 4) {
				int max = 0; //최대값을 구하기 위해서는 작은수부터 탐색이 필요함.
				int min = 100; //최소값을 구하기 위해서는 큰수부터 탐색이 필요함.
				int sum = 0;
				
				for(int x=0; x<studentNum; x++) {
					if (max < scores[x]) {
						max = scores[x];
					}
					if (min > scores[x]) {
						min = scores[x];
					}
					sum = sum + scores[x];
				}
				System.out.printf("MAX = %d \n", max);
				System.out.printf("MIN = %d \n", min);
				System.out.printf("SUM = %d \n", sum);
				System.out.printf("AVG = %f \n", (double)sum/studentNum);
				
			} else if(selectNo == 5) {
				run=false;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
	
	
