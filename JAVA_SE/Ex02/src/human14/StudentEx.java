package human14;

public class StudentEx {

	public static void main(String[] args) {

		Student s1 = Student.getInstance();
		System.out.println(s1);
		Student s2 = Student.getInstance();
		System.out.println(s2);
		
		
	}
}