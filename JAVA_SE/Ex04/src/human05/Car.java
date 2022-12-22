package human05;

import human06.Tire;

public class Car {
	// 1, 멤버 변수
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire rearLeftTire;
	Tire rearRightTire;
	
	//2. 생성자
	public Car(Tire frontLeftTire 
			,Tire frontRightTire
			,Tire rearLeftTire 
			,Tire rearRightTire ) {
		this.frontLeftTire =frontLeftTire; 
		this.frontRightTire =frontRightTire;
		this.rearLeftTire =rearLeftTire;
		this.rearRightTire =rearRightTire; 
	}
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
