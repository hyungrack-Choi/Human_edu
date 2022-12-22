package human06;

public class Car {
//	int[] a = {10,20,30,40};
//	Tire t1 = new KTire();	
	Tire[] tires = {new Ktire(),new Ktire(),new Ktire(),new Ktire()};
	//Tire[0] tires = new Ktire()
	//Tire[1] tires = new Ktire()
	//Tire[2] tires = new Ktire()
	//Tire[3] tires = new Ktire()
	public void run() {
		for(int i=0; i<tires.length ; i++){
			System.out.printf("%d : ", i);
			tires[i].roll();
		}
	}
	
}
