package human27;

public class StudentEx {

	public static void main(String[] args) {

		String[] couresName1 = {"경제","물류","수학","컴퓨터","영어"};
		Student s1 = new Student("K01", "강현준", "산업공", couresName1);
		int i = 5;
		s1.setCouresScore("경제",80);
		s1.setCouresScore("물류",81);
		s1.setCouresScore("수학",82);
		s1.setCouresScore("컴퓨터",83);
		s1.setCouresScore("영어",84);
		s1.showInfo(i);
	}
}