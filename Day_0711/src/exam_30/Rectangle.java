package exam_30;

public class Rectangle extends Point{
	private int width;
	private int height;
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("width = %d, height = %d, area = %.2f%n", width, height, area());
	}
	@Override
	public double area() {
		return width*height;
	}
	
}
