package human17;

public class CarEx {
	
	public static void main(String[] args) {
		Car mCar = new ManualCar();
		mCar.run();
		Car aiCar = new AICar();
		aiCar.run();
	}
}