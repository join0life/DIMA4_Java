package enrollprogram;

public class Reader extends Man implements Speakable{
	public Reader(String name) {
		super(name);
	}
	
	public String speak() {
		return super.getName() + " 독자는 자바를 잘하고 싶다.";
	}
	
}
