package human99;

public class Human01 {
	public static void main(String[] args) {
		String human1;
		human1 = "휴먼교육센터";
		String human2 = "휴먼교육센터";
		String human3 = new String("휴먼교육센터");
		System.out.println(human1 == human2);
		System.out.println(human2 == human3);
		System.out.println(human2.equals(human3));
	}

}
