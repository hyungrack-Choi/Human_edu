package human23;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car();
//		car1.maxSpeed = 350;
		car1.setMaxSpeed(300);
		
		int maxSpeed = car1.getMaxSpeed();
		car1.setMaxSpeed(350);
		
		int maxSpeed1 = car1.getMaxSpeed();
		System.out.println(car1.getMaxSpeed());
	}
}