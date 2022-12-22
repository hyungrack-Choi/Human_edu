package human05;


public class Human05 {

	public static void main(String[] args) {

			//	while문과 math.random() 메소드를 이용해 두개의 주사위를 만들어서 합이 5가 안되면 계속 던지고
			// 	두개의 주사위 합이 5면 실행을 멈추는 코드를 작성해보세요.
			// (1,4) (4,1) (2,3) (3,2)
			boolean z = true;
			while(z) {
				double a, b;
				a = Math.random()* 6 + 1;
				b = Math.random()* 6 + 1;
				
				int i, j;
				i = (int)a;
				j = (int)b;
				System.out.printf("(%d,%d) == > %d \n",i, j,i+j);
				
				if(i + j == 5 || i+j ==10) {
					z = false;
				}
			}
	}
}