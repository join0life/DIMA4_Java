package inherit02;
//다중 상속을 할 수 없다.
public class Child extends Parent{
	private int property;

	public Child() {
		super();
	}

	public Child(int property) {
		super();
		this.property = property;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}
	
	// 일반 메소드 // output(), earning()
	public int gather() {
		return this.property * 3;
	}
	
	public void output() {
		super.output();
		System.out.println("자식 현재 자산: " + property
				+ ", 증식한 자산: " + gather());
	}
}
