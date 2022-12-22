package human05;

import human06.Htire;
import human06.Ktire;

public class CarEx {

	public static void main(String[] args) {
			Car car = new Car(new Ktire()
					,new Ktire()
					,new Ktire()
					,new Ktire());
			car.run();
			System.out.println("-----------");
			car.frontLeftTire = new Htire();
			car.frontRightTire = new Htire();
			car.run();
	}

}
