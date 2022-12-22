package human09;

public class Mypoint {
	int x;
	int y;
	
	Mypoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getdistance(int i, int j) {
		double dist;
		int a,b;
		a = this.x - i;
		b = this.y -j;
		dist = Math.sqrt(a*a + b*b);
		return dist;
	}
}
