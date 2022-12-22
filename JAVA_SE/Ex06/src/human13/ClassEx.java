package human13;

import human04_2.Car;

public class ClassEx {

	public static void main(String[] args) {

		Car car = new Car("소나타", 100);
		
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println();
	}
}