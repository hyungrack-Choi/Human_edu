package human19.packageB;

import human19.packageA.B;

public class D {
	//public 클래스는 어디에서나 접근 가능.
//	A a  = new A();
	//A는 default이면서 다른 PKG이므로 접근 불가	
	B b = new B();
	//B는 다른 pkg이지만 public이므로 import  조건하 사용가능.
	C c = new C();
	//c는 default이면서 같은 PKG이므로 접근 가능.
	D d = new D();
	//D는 자기 자신이므로 사용 가능.
	
	
}
