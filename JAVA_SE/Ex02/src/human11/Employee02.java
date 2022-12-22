package human11;

public class Employee02 {
	public String name;
	public int employeeId;
	public static int serialNum = 1000;
	//static은 class 차원의 변수
	//모든 객체가 공유하는 변수
	
	public Employee02(String name) {
		this.name = name;
		this.serialNum =serialNum + 1;
		employeeId = serialNum;
	}
	
	public void showinfo() {
		System.out.printf("%s 사원의 사번은 %d입니다. \n", this.name, this.employeeId);
	}
}
