package exam_30;

public class Circle extends Point{
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("radius = %.2f, area = %.2f%n", radius, area());
	}

	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}
}
