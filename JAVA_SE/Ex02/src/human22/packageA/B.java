package human22.packageA;

public class B {
	public static void main() {
		A a = new A();
		//동일PKG, 다른클래스
		a.method1();
		//public 이므로 접근가능
		a.method2();
		//default이나 동일PKG이기 때문에 다른클래스에서 접근가능
		a.method3();
		//private이기 때문에 다른 클래스에서는 어떠한 경우라도 접근 불가
		
	}

}
