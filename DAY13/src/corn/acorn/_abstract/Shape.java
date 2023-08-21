package corn.acorn._abstract;

public abstract class Shape {

	private String name;
	
	public Shape() {}
	public Shape(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public abstract double area();
	
	public abstract double perimeter();
	
	public void draw() {
//		String info01 = 변수 + ("넓이=" + 변수, "둘레=" + 변수)
		String info = String.format(
				"%s(넓이=%f, 둘레=%f)", name, area(), perimeter());
		System.out.println(info);
	
//		int iInfo =1;
//		double dInfo =1.1;
//		System.out.println(info + ":" + iInfo + ":" + dInfo);
//		System.out.printf("%s : %d : %f", info, iInfo, dInfo);
	}
}
