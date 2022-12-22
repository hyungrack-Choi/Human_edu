package human04;

public class HumanEx05_01 {

	public static void main(String[] args) {
		
		//홀수만 더하는 프로그램.
		// X % 2 == 1; 2로 나누었을때 나머지가 1 수 ==> 홀수
		
		int index = 0;
		int total = 0;
		while (index <= 10) {
			
			index = index + 1;
			total = total + index;
			if (index % 2 == 1) { // 짝수
				continue;
			}
			System.out.printf("%d번째 까지의 홀수합산 %d \n", index, total);
		}

		System.out.printf("total = %d \n", total);
	}

}
