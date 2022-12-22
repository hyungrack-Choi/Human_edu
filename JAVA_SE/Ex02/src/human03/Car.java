package human03;

public class Car {
	//멤버 변수
	public String company;
	public String model;
	public int maxSpeed;
	public int currentSpeed;
	
	//생성자
	//내용이 있기 때문에 생략이 불가함.
	public Car() {
		this.company = "BMW"; //this는 맴버 변수를 가르킨다.
		this.model = "BMW500";
		this.maxSpeed = 300;
		this.currentSpeed = 100;
	}

	public Car(String company,String model,
			int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;		
		this.currentSpeed = currentSpeed;
	}
}