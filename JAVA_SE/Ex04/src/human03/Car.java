package human03;

public class Car {

	public static void main(String[] args) {
		Tire t1 = new Htire();
		//위의 한줄 코든 아래의 2줄 코드와 같음.
		// Htire ht = new Htire();
		//Tire t1 = ht;
		//Tire 인터페이스에 H사 타이어를 대입시킨 형태.
		//Tire 인터페이스에 t1은 Htire로 구현됨.
		t1.roll(); //"한국타이어"
		System.out.println("---------------");
		Tire t2 = new Ktire();
		//Htire르 Ktire로 바꾸기만 하면 tire 인터페이스는
		//ktire를 가르키게 됨.
		//객체를 부품화하여 붙였다 떼었따를 자유자재로 할 수 있음.
		t2.roll();
	}

}
