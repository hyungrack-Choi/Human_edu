package human13;

public class CarExam {

	public static void main(String[] args) {
		Bus bus1 = new Bus(200);
		bus1.speedUp();
		//객체 만드는 순서
		// 메인부터? 클래스부터?
		// 불러오기? 
		// 생성하기?
		System.out.printf("Bus의 속도 : %d \n"
				, bus1.currentSpeed);
		int busMoney = bus1.getCharge();
		System.out.printf("Return Bus Speed : %d \n", busMoney);
		System.out.println("-----------------------");
		Taxi taxi1 = new Taxi(120);
		taxi1.speedUp();
		
		System.out.printf("Taxi의 속도 : %d \n"
				, taxi1.currentSpeed);
		int taxMoney = taxi1.getCharge();
		System.out.printf("taxMoney의 속도 : %d \n"
				, taxMoney);
	}
}