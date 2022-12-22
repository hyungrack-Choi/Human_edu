package human04;

public class Car {
	// 1, 멤버 변수
	Tire frontLeftTire = new Ktire();
	Tire frontRightTire = new Ktire();
	Tire rearLeftTire = new Ktire();
	Tire rearRightTire = new Ktire();
	
	//2. 생성자
	public Car() {}
	//3. 메서드
	public void run() {
		System.out.print("front-Left : ");
		frontLeftTire.roll();
		
		System.out.print("front-Right : ");
		frontRightTire.roll();
		
		System.out.print("rear-Left : ");
		rearLeftTire.roll();
		
		System.out.print("rear-Right : ");
		rearRightTire.roll();
	}
	
}
