package human06;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.run();
		System.out.println("-------------");
		car1.tires[0] = new Htire();
		car1.run();
	}
}
