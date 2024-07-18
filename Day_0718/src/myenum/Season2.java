package myenum;

public enum Season2 {
	봄("Spring", "SS", 1000), 여름("Summer", "MM", 1500), 가을("Fall", "FF", 2000), 겨울("Winter", "WW", 3000);
	
	private String data;
	private String temp;
	private Integer money;
	
	Season2(String data, String temp, Integer money) { // 접근지정자 사용 불가
		this.data = data;
		this.temp = temp;
		this.money = money;
		//System.out.println("계절 : " + this);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
	
	
}
