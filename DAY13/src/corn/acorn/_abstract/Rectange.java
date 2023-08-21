	package corn.acorn._abstract;
	
	public class Rectange extends Shape {
	    private double width;
	    private double height;
	
	    public Rectange(String name, double width, double height) {
	        super(name);
	        this.width = width;
	        this.height = height;
	    }
	
	    @Override
	    
	    public double area() {
	        return width * height;
	    }
	
	    @Override
	    public double perimeter() {
	        return 2 * (width + height);
	    }
	}