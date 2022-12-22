package human05;

public class Human07_04 {

	public static void main(String[] args) {

		/*
		 * *****  //i = 1; j = 없음 			k=1,2,3,4,5 
		 *  ****  //i = 2; j = 1 			k=1,2,3,4 
		 *   ***  //i = 3; j = 1, 2 		k=1,2,3 
		 *    **  //i = 4; j = 1, 2, 3 		k=1,2 
		 *     *  //i = 5; j = 1, 2, 3, 4 	k=1
		 * 
		 */

		// system.out.printf("*")
		// system.out.println()
		// system.out.printf("*")

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.printf(" ");
			}
			for (int k = i; k <= 5; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}