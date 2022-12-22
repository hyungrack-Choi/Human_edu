package human02_2;

public class Hybride extends Car{
	int elec;
	public Hybride() {
		super();
		System.out.println("Hybride() 생성");
	}
	public Hybride(int elec) {
		super();
		this.elec = elec;
		System.out.printf("Hybride(%d) \n", elec);
	}
	public Hybride(int elec, int oil) {
		super(oil);
		this.elec = elec;
		System.out.printf("Hybride(%d, %d) \n", elec, oil);
	}
	
}
