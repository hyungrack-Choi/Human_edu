package human04;

public class HumanEx04 {

	public static void main(String[] args) {
		//1~10까지 반복을 하는 프로그램. break문을 활용할 것.
		
		int index = 0;
		int total = 0;
		while (true) {
			index = index +1;
			total = total + index;
			System.out.printf("%d번재까지 누적합%d \n", index, total);
			if(index ==10) {
				break;
			}
		}
		System.out.printf("index = %d \t total = %d \n", index, total);	
		
	}

}
