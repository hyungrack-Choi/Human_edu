package human10;

public class Tax {
	public String taxno;
	public int income;
		
	public Tax(String taxNo, int income) {
		this.taxno = taxNo;
		this.income = income;
	}

	public void take(int money) {
		this.income = this.income + money;
	}
	public void showInfo() {
		System.out.printf("%s택시는 %d의 수입이 있습니다.", this.taxno, this.income);
		
	}

}
