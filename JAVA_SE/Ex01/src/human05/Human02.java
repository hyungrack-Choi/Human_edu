package human05;

public class Human02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a, b 라는 것은 for 문안의 변수로 활용할 것이고 . 이중 loop(2중 for문)을 활용하여 출력문
		
		/*
		 1 x 1 = 1
		 1 x 2 = 2
		 ---------
		 2 x 1 = 2
		 2 x 2 = 4
		 ---------
		 3 x 1 = 3
		 3 x 2 = 6
		 ---------
		 3단,
		 4단,
		 ..9단.

		 */

		/*int sum = 0;
		for(int i =1; i < 10; i++) {
			for(int j =1; j < 10; j++) {
				sum = i * j;
				System.out.printf("%d X %d = %d \n", i, j, sum);
				while(j==9) {
					System.out.println("--------");
					break;
					
					}
			}
		}
		*/
		
		int i = 1;
		int j;
		//int sum = 0;
		while(i < 10) {
			System.out.printf("%d단 입니다. \n", i);
			j = 1;
			while(j < 10) {
				/*
				sum = i * j;
				System.out.printf("%d X %d = %d \n", i, j, sum);
				*/
				System.out.printf("%d X %d = %d \n", i, j, i*j);
				j++;
			}
			System.out.println("-----");
			//j = 1;
			i++;
		}
	}

}
