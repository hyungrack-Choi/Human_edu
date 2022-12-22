package human01;

public class SportCar extends Car{
	//멤버 변수	==> 작성하지 않아도 부모의 currentSpeed 사용가능
	//생성자		==> 부모의 생성자를 강제로 만들어야함.
	//메서드 		==> 부모의 메서드르 활용할 수 있되,
//					자식의 메서드를 추가적으로 더 활용할 수 있다.
	public SportCar(int currentSpeed) {
		super(currentSpeed);	 // ==> 부모(car)의 생성자르 만드는 과정.
		this.currentSpeed = currentSpeed;
	}
	
	public void turboSpeedUp() {
		this.currentSpeed = this.currentSpeed + 10;
//		this.currentSpeed += 10;
	}
}
