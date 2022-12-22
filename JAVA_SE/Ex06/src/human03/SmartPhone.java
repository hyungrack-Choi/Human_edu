package human03;

public class SmartPhone {
	private String Company;
	private String os;
	
	public SmartPhone(String Company, String os) {
		this.Company = Company;
		this.os = os;
	}
	
	public String toString() {
		return (this.Company + "-" + this.os);
	}
}
