package human05;

public class Human04 {

	public static void main(String[] args) {
		//1~100 까지의 정수중 3의 배수의 총합을 구하는 코드를 작성하시오
		
//case -1(나머지를 이용함)
//
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum = sum + i;
//				System.out.printf("%d의 배수의 합: %d \n", i, sum);
//			}
//		}
//		System.out.printf("3의 배수의 합: %d \n", sum);
		
//case -2(증감을 3씩 증감)
		int total = 0;
		for (int a = 0; a <= 100; a+=3) {
			total = total + a;
			System.out.printf("%d까지의 누적합 ==> %d \n", a, total);
		}
	}
}
