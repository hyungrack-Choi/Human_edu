package human02_1;

public class Child extends Parent{

	public Child() {
		super();
		
		//super는 생성자 생성시 절대적으로 있어야 함.
		//이코드가 생략 되어 있음.(단, 인자가 없을때만)
		//코드상에서만 생략이지 .컴파일 하면 자동으로 만들어냄.
		System.out.println("Child() 생성");
	}

	public Child(int i) {
		super(i+10);
		
		//인자가 있는 부모의 생성자르 호출시에는 생략불가.
		System.out.println("Child(i) 생성");
	}
}
