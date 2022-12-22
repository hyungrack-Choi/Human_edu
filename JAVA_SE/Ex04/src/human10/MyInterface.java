package human10;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("MyInterface가 method2를 호출");
	}
	//default메서드는 구현클래스에 공통적으로 적용할 기능.
	//default메서드는 특정 구현 클래스에서 다르게사용하고싶다면.
	//그 클레스에서 오버라이딩 하면 됨.
}
