package human08;

public class StudentEx01 {

	public static void main(String[] args) {

		Student s = new Student("강현준", 1,10,80,90,71);
		
		System.out.println("이름 :"+ s.name);
		System.out.println("총점 :"+ s.getTotal());
		System.out.println("평균 :"+ s.getAverage());
		System.out.println("---------------------");
		
		Student s1 = new Student("강우혁", 21,130,280,190,270);
		
		System.out.println("이름 :"+ s1.name);
		System.out.println("총점 :"+ s1.getTotal());
		System.out.println("평균 :"+ s1.getAverage());
		System.out.println("---------------------");
		
		Student s2 = new Student("강수혁", 12,13,20,13,20);
		
		System.out.println("이름 :"+ s2.name);
		System.out.println("총점 :"+ s2.getTotal());
		System.out.println("평균 :"+ s2.getAverage());
		System.out.println("---------------------");
	}
}