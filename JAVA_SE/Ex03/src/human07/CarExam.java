package human07;

public class CarExam {

	public static void main(String[] args) {

		int money = 0;
		Car car1 = new Bus(); // 자동타입변환
		money = car1.getCharge(); // money = 1450;
		Car car2 = new Taxi();
		money = car2.getCharge(); // money = 1800;

		Taxi taxi1 = (Taxi) car2;
		taxi1.taxiRun();
		System.out.println(car1 instanceof Bus);
		System.out.println(car2 instanceof Bus);
		if (car1 instanceof Bus) {
			Bus bus1 = (Bus) car1;
			bus1.busRun();
		} else {
			System.out.println("변환할수 없습니다.");
		}
		if (car2 instanceof Taxi) {
			Taxi taxi = (Taxi) car2;
			taxi.taxiRun();
		} else {
			System.out.println("변환할수 없습니다.");
		}
		if (car2 instanceof Bus) {
			Bus bus2 = (Bus) car2;
			bus2.busRun();
		} else {
			System.out.println("변환할수 없습니다.");
		}
	}
}
