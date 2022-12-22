package human10;

public class SnowTireExam {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		Tire tire1 = new SnowTire(); 
		
		snowTire.run();
		tire.run();

	}

}
