package friend;

public class FriendVO {
	// 멤버 필드
	private String name;
	private String phone;
	private int age;
	
	
	// 생성자
	public FriendVO() {
		super();
	}

	// 오버로딩 생성자
	public FriendVO(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 일반 메소드
	public void output() {
		System.out.printf("%3s %15s %3d%n", name, phone, age);
	}
}
