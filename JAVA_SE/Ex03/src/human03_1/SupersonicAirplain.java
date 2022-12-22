package human03_1;

public class SupersonicAirplain extends Airplanin{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;
	//아래는 생성자는 생략가능
	public SupersonicAirplain() {
		super();
	}
	@Override
	//어노테이션을 주어서 메소드 이름 변경시 에러뜬다.
	public void fly() {
		if (flyMode == SUPERSONIC) {
				System.out.println("초음속비행합니다.");
		}
		else {
			//부모가 가지고 있는 일반 비행을 처리하고 싶음.
			super.fly();
		}
	}
}