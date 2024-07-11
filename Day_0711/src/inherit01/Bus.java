package inherit01;

public class Bus extends Vehicle{
	private String busNumber;

	// 기본 생성자
	public Bus() {
		super();
	}

	// 오버로딩 생성자
	public Bus(String busNumber) {
		super();
		this.busNumber = busNumber;
	}

	public Bus(String busNumber, int numberOfWheel, int numberOfSeat, double weight) {
		super(numberOfWheel, numberOfSeat, weight);
		this.busNumber = busNumber;
	}
	//setter, getter
	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	
	//outputBus();
	public void outputBus() {
		this.output();
		System.out.println("Bus = " + this.busNumber);
	}
	
}
