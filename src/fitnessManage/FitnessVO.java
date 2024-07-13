package fitnessManage;
/*
 * 이름(name), 키(height), 몸무게(weight), 성별(gender)
 * 표준체중, bmi, bmi 결과
 */
public class FitnessVO {
	private String name;
	private double height;
	private double weight;
	private String gender;
	
	// Setter
	public void setName(String n) {
		this.name = n;
	}
	public void setHeight(double h) {
		this.height = h;
	}
	public void setWeight(double w) {
		this.weight = w;
	}
	public void setGender(String g) {
		this.gender = g;
	}

	// Getter
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	public String getGender() {
		return this.gender;
	}
}
