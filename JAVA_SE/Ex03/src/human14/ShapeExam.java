package human14;

public class ShapeExam {

	public static void main(String[] args) {

		Shape circle = new Circle(5.0);
		System.out.printf("원의 넓이는 %f 입니다. \n", circle.calcArea());

		Shape rect = new RectAngle(3,4);
		System.out.printf("사격형의 넓이는 %f 입니다. \n", rect.calcArea());
	}

}
