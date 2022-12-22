package human14;

public class RectAngle extends Shape{
	private int width;
	private int height;
	
	public RectAngle (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	protected double calcArea() {
		double area;
		area = this.width * this.height;
		return area;
	}
}
