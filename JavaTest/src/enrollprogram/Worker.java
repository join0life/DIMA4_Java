package enrollprogram;

public class Worker extends Man implements Speakable{
	public Worker(String name) {
		super(name);
	}
	
	// super 안 넣어도 됨
	public String speak() {
		return super.getName() + " 일꾼은 자기가 맡은 일을 잘하고 싶어 한다.";
	}
	
}
