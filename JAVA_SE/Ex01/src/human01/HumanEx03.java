package human01;

public class HumanEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String human1 = "Human" +" " + "computer";
		//String은 문자열을 담는 클래스.
		
		System.out.println("human1= "+human1);

		int human2 = 2*6;
		System.out.println("human2= "+human2);
		
		//int human3 = 9/2.; //정수/정수 ==> 정수.
		double human3 = 9/2.; //정수/정수 ==> 정수. 이므로 둘중 하나는 실수로 변환
		System.out.println("human3= "+human3);
		
		int human4 = 7%3; //몫(2), 나머지는(2); &는 나머지를 의미
		System.out.println("human4= "+human4);
		
		int human5 =1;
		human5 += 2; //human5 = human5 + 2
		System.out.println("human5= "+human5);
		
		int human6 = 1;
		human6 ++; // human6 = human6 +1 반복
		System.out.println("human6= "+human6);
		++human6;
		System.out.println("human6= "+human6);
	}
}
