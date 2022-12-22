package human05;

public class Human07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 *      *		//i = 1; j = 1, 2, 3, 4 	k=5
		 *     **		//i = 2; j = 1, 2, 3 		k=4,5
		 * 	  ***		//i = 3; j = 1, 2	  		k=3,4,5
		 * 	 ****		//i = 4; j = 1	 			k=2,3,4,5
		 * 	*****		//i = 5; j = 없음				k=1,2,3,4,5

		 */
		
		//system.out.printf("*")
		//system.out.println()
		//system.out.printf("*")
		
			for(int i =1; i <= 5; i++) {
				for(int j =1; j<= 5-i; j++) {
					System.out.printf(" ");
				}
				for(int k=6-i ; k<=5 ; k++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		
	}

}
