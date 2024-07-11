package inherit01;

public class Sedan extends Vehicle{
	private boolean isTrunk;

	public Sedan() {
		super();
	}

	public Sedan(boolean isTrunk) {
		super();
		this.isTrunk = isTrunk;
	}

	public Sedan(boolean isTrunk, int numberOfWheel, int numberOfSeat, double weight) {
		super(numberOfWheel, numberOfSeat, weight);
		this.isTrunk = isTrunk;
	}

	public boolean isTrunk() {
		return isTrunk;
	}

	public void setTrunk(boolean isTrunk) {
		this.isTrunk = isTrunk;
	}
	
	public void outputSedan() {
		this.output();
		if (isTrunk) {
			System.out.println("자동 트렁크 있음");
		} else {
			System.out.println("자동 트렁크 없음");
		}
		
	}
}
