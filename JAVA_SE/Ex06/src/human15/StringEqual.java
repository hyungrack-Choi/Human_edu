package human15;

public class StringEqual {

	public static void main(String[] args) {

		String strVar1 = new String("신민철");
		String strVar2 = new String("신민철");

		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		//String 클래스는 최상위 클래스인 Object 클래스를 상속받았고.
		//equals란 메서드는 Object가 가지고 있는 메서드 인데. 이는 주소값을 비교하는 메서드이지만.
		//String 클래스에서 멤버변수(위의 "신민철")의 값을 비교하도록 오버라이딩 하였기 때문에.
		//equals 메서드를 사용하면 true가 나온다.
		
	}
	}

