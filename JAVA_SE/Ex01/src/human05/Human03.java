package human05;

public class Human03 {

	public static void main(String[] args) {

		// 홀수 단만 출력 할수 있도록 프로그램을 변경할 예정.
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {			//홀수
				for(int j = 1; j < 10; j++) {
					sum = i * j;
					if(j % 2 == 0) { // 짝수
					System.out.printf("%d X %d = %d \n", i, j, sum);
					/*
					 * while(j==9) { System.out.println("--------"); break;
					 * 
					 * }
					 */
					}
				}
				System.out.println("--------");
			}
		}
	}
}
