package corn.acorn._abstract;

public class Main01 {

	public static void main(String[] args) {
		Shape shape1 = new Circle(3.0, "Circle");
		shape1.draw();
		
		Shape shape2 = new Rectange("Rectange",5, 2.0 );
		shape2.draw();
	}

}
