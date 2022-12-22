package human09;

public class Ex {

	public static void main(String[] args) {

		ClassC c3 = new ClassC();
		ClassA c1 = new ClassA();
		InterfaceC ic3 = c3;
		System.out.println(c3.getClass());
		c3.methodA();
		c3.methodB();
		c3.methodC();
		InterfaceA ic1 = ic3;
		ic1.methodA();
		c1.methodA();
//		ic1.methodB();
		//InterfaceA를 구현한 ic1은 methodB()가
		//없기 때문에 실행불가.
		//methodB()는 interfaceB에 정의한 것이므로
	}
}