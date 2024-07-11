package inherit02;

public class InheritTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.setMoney(150000);
		
		parent.output();
		
		Child child = new Child(17500);
		child.output();
	
		// -----
		Child son = new Child(20000); // 아들이 번 돈
		son.setMoney(15000); // 부모가 남겨준 돈
		son.output();
	}

}
