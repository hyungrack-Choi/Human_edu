package human12;

public class Turtle extends Animal implements Swimable{

	public Turtle(int x, int y, int age) {
		super(x, y, age);
	}
	@Override
	public void printInfo() {
		System.out.printf("Turtle -> x(%d),y(%d),age(%d) \n"
				, this.getX(), this.getY(), this.getAge());
	}
	@Override
	public void swimDown(int y) {
		this.setY(this.getY() - y);
	}
}
