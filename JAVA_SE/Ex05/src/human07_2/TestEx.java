package human07_2;

public class TestEx {

	public static void main(String[] args) {
		Test t = new Test();

		try
		{
			t.test("100", "a100");
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("시스템 종료");
	}
}