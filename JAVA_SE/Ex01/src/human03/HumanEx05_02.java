package human03;

public class HumanEx05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch (grade) {
		case 'A' :
			System.out.println("당신은 VIP 회원입니다.");
			break;		
		case 'B' :
			System.out.println("당신은 일반회원입니다.");
			break;
		default :
			System.out.println("당신은 비회원입니다.");
			break;
		}	
		System.out.println("프로그램을 종료합니다.");
	}

}
