package human04;

public class Car {
	public int speed;
	public String color;
	
	//Car()생성자는 오버로딩된 생성자가 있을 경우 생략 불가함.
	public Car() {
	}
	
	public Car(int speed) {
		this.speed = speed;
	}
	
	public Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
}