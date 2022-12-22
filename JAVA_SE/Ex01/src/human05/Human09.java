package human05;

public class Human09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 출력을 하면서 5봐 작으면 "5이하입니다" 라는 것을 출력할 예정.
		
		int cnt = 0;
		boolean z = true;
		
		while (z) {			
			cnt++;
			System.out.printf("cen = %d \n", cnt);
			
			if(cnt > 10) {
				
				break;
			}
			/*
			 * if(cnt <= 5) { System.out.println("현재의 수치가 5이하입니다."); }
			 */
			if( cnt > 5) {
				continue; //반복문의 시작점으로 되돌아가는 역활.
			}
			System.out.println("현재의 수치가 5이하입니다.");	
			
		}
	}
}
