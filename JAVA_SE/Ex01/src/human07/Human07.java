package human07;

public class Human07 {

	public static void main(String[] args) {

		// args 방법 메뉴-run-debug configurations
		// argments 에 인자값 "10 30" 넣음
		
		System.out.printf("args[0] = %s \n", args[0]);
		System.out.printf("args[1] = %s \n", args[1]);
		
		int z = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		
		System.out.println(z);
	}
}