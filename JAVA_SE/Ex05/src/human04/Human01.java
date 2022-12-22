package human04;

public class Human01 {
	public static void main(String[] args) {
		// try / catch / finally

		try {
			Human h01 = new Human("Kang");
			h01 = null;
			h01.run(); //예외발생 포인트

			Human h02 = new Human("KIm");
			h02.run();
		} 
		catch (NullPointerException ne) {
//		catch (Exception ne) {//모든예외를 처리할 경우 Exception으로 한다.
			System.out.println("예외가 발생했습니다.");
			System.out.println("ne : " + ne);
			System.out.println(ne.getStackTrace());
			System.out.println("");
			System.out.println(ne.getMessage());
		} finally {
			System.out.println("Finally을 실행합니다.");
		}
		System.out.println("시스템을 종료합니다.");
	}
}

//catch 는 try안에서 예외가 발생했을때 처리하는 로직을 담아둘 수 있음.
//최상위인 Exception 을 catch문으로 처리하면 어떠한 예외도 처리될 수 있으나
//예외벼로 다르게 로직을 적용하고 싶을때는 개별적인 예외의 종류를 선정해서
//catch문에 담아야 한다.