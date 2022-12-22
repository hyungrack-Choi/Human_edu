package human04;

public class HumanEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do~while 반복문 실습
		//do 구문을 조건과 관계없이 한번은 수행함
		//페이지 로딩시 do while 사용
		int index = 0;
		int total = 0;
		
		do {
			index = index + 1;
			total = total + index;
			System.out.printf("%d번재까지의 누적합은 %d \n", index, total);
		} while (index < 10);
		{
			System.out.printf("index = %d , total = %d \n", index, total);
		}
	}

}
