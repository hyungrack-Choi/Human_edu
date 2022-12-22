package human22.packageB;

import human22.packageA.A;

public class C {

	public static void main(String[] args) {
		A a = new A();
		//다른 PKG, 다른클래스
		a.method1();
		//public이므로 다른pkg, 다른클래스라도 접근가능
		//단,import조건하에만.
		a.method2();
		//default이므로 다른pkg에서는 접근불가.
		//어떤조건이라도 접근 불가.
		a.method3();
		//private이므로 다른클래스에서는 절대 접근 불가.
		
	}
}
