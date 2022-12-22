package human04;

public class CarEx {

	public static void main(String[] args) {
			Car car = new Car();
			car.run();
			System.out.println("-----------");
			car.frontLeftTire = new Htire();
			car.run();
	}

}
