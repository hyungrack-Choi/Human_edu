package human29;

public class Account {

	private int balance = 0;
	private int MIN_BALANCE = 0;
	private int MAX_BALANCE = 1000000;
	
	public Account() {
		this.balance = 0;
	}
	
	public void setBalance(int balance) {
		if (balance > MIN_BALANCE &&  balance < MAX_BALANCE) {
			this.balance = balance;			
		}
		else {
			System.out.println
			("계좌 허용한도 이상 또는 이하의 값을 갖게 됩니다.");
		}
	}
	public int getBalance() {return balance;}
}