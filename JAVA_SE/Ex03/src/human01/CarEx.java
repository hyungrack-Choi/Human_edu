package human01;

public class CarEx {

	public static void main(String[] args) {

		Car car1 = new Car(100);
		
		System.out.printf("Car1의 현재속도 : %d \n"
				, car1.currentSpeed);
		car1.speedUp();
		System.out.printf("Car1의 현재속도 : %d \n"
				, car1.currentSpeed);
		
		SportCar sCar1 = new SportCar(150);

		System.out.printf("Car1의 현재속도 : %d \n"
				, sCar1.currentSpeed);
		
		sCar1.speedUp();
		System.out.printf("Car1의 현재속도 : %d \n"
				, sCar1.currentSpeed);
		
		sCar1.turboSpeedUp();
		System.out.printf("Car1의 현재속도 : %d \n"
				, sCar1.currentSpeed);
		
	}
}