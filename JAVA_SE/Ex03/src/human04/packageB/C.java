package human04.packageB;

import human04.packageA.A;

public class C {
	public static void main(String[] args) {
		A a = new A(); // 다른패키지 이므로 import해도 안됨
		// 클래스는 public 이므로 접근 가능
		// 생성자는 다른 PKG이므로 접근 불가.
		a.field = 1;
		a.method();
		// field, method 모두 다른 PKG이므로 접근 불가.
	}
}