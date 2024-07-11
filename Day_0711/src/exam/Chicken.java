package exam;

public abstract class Chicken {
	private String type;

	public Chicken() {
		super();
	}

	public Chicken(String type) {
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
		System.out.println("치킨 종류 : " + type);
	}
	
	public abstract void cook() ;
}
