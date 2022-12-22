package human02;

public abstract interface Internet {
	//인터페이스는 abstreact생략 가능
	
	public abstract void search();
	//인터페이스는 abstreact생략 가능
	//인터페이스는 데이터를 저장할수 없기 때문에 
	//--------------------	
	//인터페이스 상수 필드 선언시 
	//--------------------
	//데이터르 저장할 인스턴스 또는 정적 필드를 선언할 수 없다.
	//대신 상수 필드만 선언할 수 있다.
	//인스턴스에서 선언된 필드는 모두 public static final의 특성을갖는다
	//public static final을 생략하더라두 자동적으로 컴파일 과정에서 붙게된다.
}
