package human16;

public class ComputerEx {

	public static void main(String[] args) {
		DeskTop dt = new DeskTop();
		dt.turnOn();
		dt.typing();
		dt.display();
		dt.turnOff();
		MyNotebook bn = new MyNotebook();
		
		bn.turnOn();
		bn.typing();
		bn.display();
		bn.turnOff();
	}

}
