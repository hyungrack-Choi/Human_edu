package human03;

public class HumanEx03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 95;
		System.out.printf("score = %d \n", score);
		char grade ='Z';
		
		if (score >= 90 && score < 100) {
			grade = 'A';
			
		}
		if (score >= 80 && score < 90) {
			grade = 'B';
			
		}
		if (score >= 70 && score < 80) {
			grade = 'C';
		}
		if (score < 60) {
			grade = 'F';
		}
		System.out.printf("grade = %c \n", grade);
		
	}

}
