package human15;

public class StringCharAtExample {

	public static void main(String[] args) {

		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		//CharAt이란 메서드는 String 클래스의 메서드로써 char 타입의 값으로 되돌려주는 메서드이다.
		
		System.out.println(sex);
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자 입니다.");
				break;
		}
	}
}