package human03;

public class HumanEx03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		char grade = 'Z';
		//char 한문자 초기값넣어야한다
		
		System.out.printf("score = %d \n", score);
		
		if (score >=90) {
			grade = 'A';
			
		}
		else if (score >= 80) {
			grade = 'B';
			
		}
		else if (score >= 70) {
			grade = 'C';
			
		}
		else if (score >= 60) {
			grade = 'D';
			
		}
		else {
			grade = 'F';
		}
		System.out.printf("당신은 grade는 %c 입니다.", grade);
	}

}
