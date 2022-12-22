package human12;

public class SportCar extends Car{

	public SportCar(int speed) {
		super(speed);
	}
	public void showInfo() {
		System.out.printf("SportCar의 현재속도 : %d \n"
				, this.currentSpeed);
	}
	
}
