package human16;

public abstract class Notebook extends Computer{

	@Override
	public void display() {
		System.out.println("전시장 노트북의 화면이 디스플레이 됩니다.");
	}

	public abstract void typing();


}
