package human05;

public class Human07_02 {

	public static void main(String[] args) {



		/*
		 *  *****	//i = 5; j = 1, 2, 3, 4, 5
		 * 	****	//i = 4; j = 1, 2, 3, 4
		 * 	***		//i = 3; j = 1, 2, 3
		 * 	**		//i = 2; j = 1, 2
		 * 	*		//i = 1; j = 1

		 */
			//2중 for문으 사용할 것이고.
			//system.out.print("*"); 활용
			//system.out.println(); 활용
			
			for(int i =1; i <= 5; i++) {
				for(int j =1; j<=5+1-i; j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		}
	}

