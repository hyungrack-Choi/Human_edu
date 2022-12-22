package human01_4;

public class Member extends Object{

	public Member(int age, int score) {
		this.age = age;
		this.score = score;
	}
	public int age;
	public int score;
	
	//Object가 가지고 있는 equals를 오버라이딩 하여
	//아래와 같이 재정의함.
	public boolean equals(Object obj) {
		//Member m = m2;
		//Object obj = m2(--> new Member(47,90));
		//Object obj = new Member(47,90);
		//자동타입변환
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(this.age == m.age 
					&& this.score == m.score) {
				return true;
			}
		}
		return false;
	}
}