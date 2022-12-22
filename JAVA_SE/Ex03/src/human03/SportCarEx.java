package human03;

public class SportCarEx {

	public static void main(String[] args) {

		SportCar sCar1 = new SportCar(100);
		sCar1.speedUp();
		System.out.printf("sCar1 현재속도 : %d \n"
				, sCar1.currentSpeed);
	}
}