package human06;

public class Human01 {

	public static void main(String[] args) {
		// 반복해서 같은 일을하는 것은 함수로 만들어서 호출하여 사용한다.
		printTest();
		System.out.println("---------------");		
		printTest();
		System.out.println("---------------");		
		printTest();
		System.out.println("---------------");		
		printTest();
		System.out.println("---------------");
		printTest("강현준");
		printTest("강우혁");
		printTest("강주혁");

		printTest("최형락", 38);
		printtest(10, 20);
		
		//return이 있는 사례
		//return의 값이 타입과 함수에서 되돌림에대한 값의 타입은 일치해야 함.
		int x1, x2, x3;
		double x4;
		x1 = add(10,20);
		System.out.printf("x1 = %d \n", x1);
		x2 = add(20,20);
		System.out.printf("x2 = %d \n", x2);
		x3 = add(20,20,30);
		System.out.printf("x3 = %d \n", x3);
		x4 = add(20,20,30.5);
		System.out.printf("x4 = %f \n", x4);
	}

	private static double add(int i, int j, double d) { 
		//objeck->double 바꿔줌(메소드 생성시 오브젝트를 더블로변경)
		double z = i + j + d; //더블은 더블로 받아야된다.
		return z;
	}

	private static int add(int i, int j, int k) {
		int z = i + j + k;
		return z;
	}

	private static int add(int i, int j) {
		int z = i + j ;
		return z;
	}

	private static void printTest() {
		System.out.println("print 함수 test1");
		System.out.println("print 함수 test2");
		System.out.println("print 함수 test3");
		System.out.println("print 함수 test4");
//		return; // void는 생락이 가능함
	}

	private static void printTest(String name) { //String name = "강현준"
		System.out.printf("제이름은 %s입니다. \n", name);
	}
	private static void printTest(String name, int age) {
		System.out.printf("제이름은 %s 입니다. 나이는 %d입니다. \n", name, age);
	}
	private static void printtest(int x1, int x2) {
		System.out.printf("(%d,%d) ==> %d \n", x1, x2, x1+x2);
	}
}