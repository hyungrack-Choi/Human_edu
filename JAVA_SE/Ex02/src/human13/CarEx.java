package human13;

public class CarEx {

	public static void main(String[] args) {
		// 
		Car car1 = new Car();
		car1.speedUp();
		
		Car.driving();
		car1.driving();
		//static메서드인 diriving은 객체기반에서도 접근 가능.
		//권장하지 않는다.
		int sp;
		sp = Car.maxSpeed;
		sp = car1.maxSpeed;
		//경고메세지
		//static 변수인 maxSpeed는 클래스를 통해서 접근하는것을
		//권장하나. 객체를 통해서 접근하는 것도 가능하다.
	}
}