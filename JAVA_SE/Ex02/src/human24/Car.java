package human24;

public class Car {
	private int currentSpeed;
	private int maxSpeed;
	
	public Car(int currentSpeed, int maxSpeed) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
	}
	
	//source - generate getter and setter 클릭시 아래 생성

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setSurrentSpeed(int surrentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp(int speed) {
		//속도를 올리는데 차가 가지고 있는 최고 제한속도보다 클 경우는
		//최고 제한 속도까지만 속도를 올린다.
		if(this.currentSpeed + speed <= this.maxSpeed) {
			this.currentSpeed = this.currentSpeed + speed;
			//this.currentSpeed += speed; 위와 동일 코드
		}
		else {
			this.currentSpeed = this.maxSpeed;
		}
	}
}
