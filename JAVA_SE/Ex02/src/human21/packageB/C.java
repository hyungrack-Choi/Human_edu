package human21.packageB;

import human21.packageA.A;

public class C {
	public static void main(String[] args) {
		A a = new A();
		a.field1 = 10;
		//field1은 public 이므로 다른 PKG, 다른 클래스에서 접근 가능
		//(단, import필요)
		a.field2 = 20;
		//field2는 deafault이지만 다른 PKG라서 다른클래스에서 접근 불가
		//default 접근은 import로도 해결 안됨.
		a.field3 = 30;
		//field3은 private이므로 다른 클래스에서 접근 불가.


	}

}
