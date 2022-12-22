package human20.packageB;

import human20.packageA.A;

//ctrl+shift+o import 명령 단축키

public class C {

	A a1 = new A(true);
	//a1은 public 은 import 조건하 접근 가능
	A a2 = new A(10);
	//a2은 default이므로 다른 PKG이므로 접근 불가
	A a3 = new A(9.1);
	//a3는 private이므로 다른 클래스에서는 접근 불가
}