package human12;

public class SystemTimeExample {

	public static void main(String[] args) {

		long time1 = System.nanoTime();
		
		System.out.println(time1);
		int sum = 0;
		for (int i = 0; i <10000000; i++) {
			sum = sum + i;
		}
		long time2 =System.nanoTime();
		System.out.println("1~1000000까지의 합:" + sum);
		System.out.println("계산에" + (time2-time1)+ "나노초가 소요되었습니다.");
		
		long time3 = System.currentTimeMillis();
		sum = 0;
		for (int i = 0; i <10000000; i++) {
			sum = sum + i;
		}
		long time4 =System.currentTimeMillis();
		System.out.println("1~1000000까지의 합:" + sum);
		System.out.println("계산에" + (time4-time3)+ "밀리언 소요되었습니다.");
	}
//	522924156053400
//	522942155718400
}
