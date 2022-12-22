package human05;

public class Human06 {
	public static void main(String[] args) {
		//x, y 는 1~10의 정수
		// 4x+5y == 60인 x,y의 값을 출력
			
		int x,y;

		for (x=1; x <=10; x++) {
			for(y=1; y <=10; y++) {
				if(4*x + 5*y ==60) {
					System.out.printf("(%d,%d)", x,y);
					
				}
			}			
		}
	}
}