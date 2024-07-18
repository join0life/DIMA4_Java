package myenum;

public enum Fruit1 {
	바나나("Banana"), 딸기("Strawberry"), 사과("Apple");
	
	private String fruit;
	
	Fruit1(String fruit) {
		this.fruit = fruit;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	
}
