package human04_1;

public class MemberEx {

	public static void main(String[] args) {
		int[] score = {10,20,30};
		Member origin = new Member
				("Blue", "강혁준", "12345",47, true, score);
		Member Cloned = origin.getMember();
		
		Cloned.password = "67890";
		Cloned.score[0] = 100;
		
		System.out.println(origin.password);
		System.out.println(Cloned.password);
		
		System.out.println(origin.score[0]);
		System.out.println(Cloned.score[0]);
		
	}
}