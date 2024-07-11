package inherit03;

public abstract class Animal {
	private String type;

	public Animal() {
		super();
	}

	public Animal(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void output() {
		System.out.println("동물의 종류: "+type);
	}
	// 어차피 하위 클래스에서 오버라이드 할 예정이면
	// 몸통이 없는 메소드로 만든다. ==> 추상메소드
	public abstract void cry() ;
}
