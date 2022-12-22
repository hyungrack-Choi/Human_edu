package human03_1;

public class EXam {
	
	public static void main(String[] args) {
		SupersonicAirplain  sa = new SupersonicAirplain();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplain.SUPERSONIC;
		//supersonic 변수는 static 이므로 객체가 아닌 클래스 기반으로 
		//접근가능.
		sa.fly();
		sa.flyMode = SupersonicAirplain.NORMAL;
		sa.fly();
		sa.land();
	}
}