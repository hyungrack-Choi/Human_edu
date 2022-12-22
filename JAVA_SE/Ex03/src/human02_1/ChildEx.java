package human02_1;

public class ChildEx {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println("------------");
		Parent p2 = new Parent(10);
		System.out.println("------------");
		Child c1 = new Child();
		System.out.println("------------");
		Child c2 = new Child(10);
	}
}