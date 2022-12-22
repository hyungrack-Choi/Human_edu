package human05;

public class Human07_01 {

	public static void main(String[] args) {

	/*
	 * 	*		//i = 1; j = 1
	 * 	**		//i = 2; j = 1, 2
	 * 	***		//i = 3; j = 1, 2, 3
	 * 	****	//i = 4; j = 1, 2, 3, 4
	 *  *****	//i = 5; j = 1, 2, 3, 4, 5
	 * 	******

	 */
		//2중 for문으 사용할 것이고.
		//system.out.print("*"); 활용
		//system.out.println(); 활용
		
		for(int i =0; i<=5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
