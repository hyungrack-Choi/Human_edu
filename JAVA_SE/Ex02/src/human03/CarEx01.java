package human03;

public class CarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("Car1 = "+ car1);
		System.out.println("Car1.company =\t"+ car1.company);
		System.out.println("Car1.model =\t"+ car1.model);
		System.out.println("Car1.maxSpeed =\t"+ car1.maxSpeed);
		System.out.println("Car1.currentSpeed =\t"+ car1.currentSpeed);
		System.out.println("");
		
		Car car2 = new Car();
		System.out.println("Car2 = "+ car2);
		System.out.println("Car2.company =\t"+ car2.company);
		System.out.println("Car2.model =\t"+ car2.model);
		System.out.println("Car2.maxSpeed =\t"+ car2.maxSpeed);
		System.out.println("Car2.currentSpeed =\t"+ car2.currentSpeed);
		System.out.println("");
		
		Car car3 = new Car("현대자동차", "그랜져", 250, 10);
		System.out.println("car3 = "+ car3);
		System.out.println("car3.company =\t"+ car3.company);
		System.out.println("car3.model =\t"+ car3.model);
		System.out.println("car3.maxSpeed =\t"+ car3.maxSpeed);
		System.out.println("car3.currentSpeed =\t"+ car3.currentSpeed);	
	}
}