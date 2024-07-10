package vo;
// 이름, 차 번호, 전화번호, 예약 위치
public class RentCarVO {
	private String name, location;
	private int car, phone;

	public RentCarVO() {
	}
	
	public RentCarVO(String name, String location, int car, int phone) {
		this.name = name;
		this.location = location;
		this.car = car;
		this.phone = phone;
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCar() {
		return car;
	}

	public void setCar(int car) {
		this.car = car;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void output() {
		System.out.printf("%3s %4d %11d %s%n", name, car, phone, location);
	}
}
