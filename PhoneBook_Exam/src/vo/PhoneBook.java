package vo;

public class PhoneBook {
	private String phoneNumber;
	private String name;
	private String relation; // 친구, 동료, 학교 등 나와의 관계
	private int age;
	
	public PhoneBook() {
		super();
	}
	public PhoneBook(String phoneNumber, String name, String relation, int age) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.relation = relation;
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PhoneBook [phoneNumber=" + phoneNumber + ", name=" + name + ", relation=" + relation + ", age=" + age
				+ "]";
	}
	
}
