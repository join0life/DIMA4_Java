package exam_30;

public abstract class Point {
	private int x;
	private int y;
	
	public Point() { }
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print() {
		System.out.printf("x = %d, y = %d, ", x, y);
	}
	// 추상메소드
	public abstract double area();
}
