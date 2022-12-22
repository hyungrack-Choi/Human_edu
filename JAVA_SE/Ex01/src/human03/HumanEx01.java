package human03;

public class HumanEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 60점 이상이면 합격입니다.  출력 ==> 마지막으로는 프로그램 종료. 메세지를 주는 프로그램
		
		int kor = 50;
		System.out.printf("점수 = %d \n", kor);
		
		if (kor >= 60) {
			System.err.println("합격하셨습니다.");
			//조건식은 관계연산식이고. 이 부분이 참이면 블럭안을 수행.
		} else if (kor < 60)
		{
			System.out.println("불합격하셨습니다.");
		}
		System.err.println("프로그램을 종료합니다.");

	}

}
