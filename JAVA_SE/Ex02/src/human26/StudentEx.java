package human26;

public class StudentEx {

	public static void main(String[] args) {

		String[] coures1 = {"경제","물류","수학","컴퓨터","영어"};
		Student s1 = new Student("K01", "최형락", "산업공", coures1);
		int[] scores = {80,81,82,83,84};
		//문제는 모든 과목의 점수가 확정되어야만 성적 처리가 가능함.
		//경제과목과 80점이란 연관관계를 찾기가 어려움.		
		s1.setCouresScore(scores);
		s1.showInfo();
		System.out.println("--------------------");
		String[] coures2 = {"컴퓨터","수학","영어","네트웍","그래픽"};
		Student s2 = new Student("K01", "김석훈", "컴공", coures2);
		int[] scores2 = {90,91,92,93,94};
		//문제는 모든 과목의 점수가 확정되어야만 성적 처리가 가능함.
		//경제과목과 80점이란 연관관계를 찾기가 어려움.		
		s2.setCouresScore(scores2);
		s2.showInfo();
		
	}
}