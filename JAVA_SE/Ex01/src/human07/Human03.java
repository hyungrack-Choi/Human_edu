package human07;

public class Human03 {

	public static void main(String[] args) {
		int [][] score = {
							{10,20,30,40},
							{50,60,70,80},
							{90,100,110,120}
						 };
		int total = 0;		
		System.out.printf("socre = %s \n", score);
		System.out.printf("socre[0] = %s \n", score[0]);
		System.out.printf("socre[0][0] = %s \n", score[0][0]);
		System.out.printf("socre[0][1] = %s \n", score[0][1]);
		System.out.printf("socre[0][2] = %s \n", score[0][2]);
		System.out.printf("socre[1][2] = %s \n", score[1][2]);
		System.out.printf("socre[2][3] = %s \n", score[2][3]);
		System.out.printf("score = %d \n", score.length);
		System.out.printf("score[0] = %d \n", score[0].length);

		 for(int a=0; a<score.length; a++) { 
			 for(int b=0; b<score[a].length; b++) {
				 total = total + score[a][b];		
			 }
		 } 
		 System.out.printf("total = %d \n", total);
	}
}