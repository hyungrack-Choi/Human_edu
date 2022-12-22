package human09;

public class MypointEx {

	public static void main(String[] args) {
		
		Mypoint p = new Mypoint(1,1);
		
		double distance = p.getdistance(7, 3);
		
		//p와 (2,2)의 거리를 구한다.
		System.out.printf("2점사이의 거리는 = %f \n", distance);
		System.out.println("Math.sqrt(4)의 제곱근"+Math.sqrt(4)); // 2.0 * 2.0 == 4
		System.out.println("Math.sqrt(9)의 제곱근"+Math.sqrt(9)); // 3.0 * 3.0 == 9
	}
}