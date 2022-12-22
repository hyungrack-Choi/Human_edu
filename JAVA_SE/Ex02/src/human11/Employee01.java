package human11;

public class Employee01 {
	public String name;
	public int employeeId;
	public int serialNum = 1000;
	
	public Employee01(String name) {
		this.name = name;
		this.serialNum =serialNum + 1;
		employeeId = serialNum;
	}
	
	public void showinfo() {
		System.out.printf("%s 사원의 사번은 %d입니다. \n", this.name, this.employeeId);
	}
}
