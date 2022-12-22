package human01;

public class Car {
	public int currentSpeed;
	public int MaxSpeed;

	public Car(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public void speedUp() {
		this.currentSpeed = this.currentSpeed + 1;
//		this.currentSpeed++;
		
	}
}
