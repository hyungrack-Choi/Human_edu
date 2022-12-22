package human05;

public class CarEx {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("-----------");
		Car car2 = new Bus();
		//car2는 현재까지 bus입니다.
		car2.run();
		Car car3 = new Taxi();
//		car3는 현재까지 Taxi
		
		//다형성이란 것은 BUS였따가 TAXI로 바꿀수 있는
		//부모의 형태가 다양하게 변경되는 성질.
		
		car3.run();
		//car3.run()이란 소스는 변경없이도 다형성의 성질에 의해
		//다양하게 변하나.
	}
}