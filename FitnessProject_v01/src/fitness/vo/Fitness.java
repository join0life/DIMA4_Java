package fitness.vo;
// 아이디(PK), 이름, 성별, 키, 몸무게, 표준체중, BMI, BMI 결과
public class Fitness {
	private int id;
	private String name;
	private String gender;
	private double height;
	private double weight;
	private double stdWeight;
	private double bmi;
	private String bmiResult;
	
	public Fitness() {
	}

	public Fitness(int id, String name, String gender, double height, double weight) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		
		calcStdWeight();
		calcBMI();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}
	// 키가 수정되면 표준체중과 BMI를 재계산 하기 위해 
	public void setHeight(double height) {
		this.height = height;
		calcStdWeight();
		calcBMI();
	}

	public double getWeight() {
		return weight;
	}
	// 몸무게가 수정되면 표준체중과 BMI를 재계산 하기 위해 
	public void setWeight(double weight) {
		this.weight = weight;
		calcStdWeight();
		calcBMI();
	}

	public double getStdWeight() {
		return stdWeight;
	}

	public double getBmi() {
		return bmi;
	}

	public String getBmiResult() {
		return bmiResult;
	}
	
	// 일반 메소드로 stdWeight, bmi, bmiResult 처리하도록 함
	// 계산되어 나오는 결과이므로!
	private void calcStdWeight() {
		double temp = height / 100;
		
		if(gender.equals("남")) { // 기본자료형만 ==으로 비교
			stdWeight = temp * temp * 22;
		} else {
			stdWeight = temp * temp * 21;
		}		
	}
	
	private void calcBMI() {
		double temp = height / 100;
		
		bmi = weight / (temp * temp);
		calcBMIResult();
	}

	private void calcBMIResult() {
		if (bmi >= 35) {
			bmiResult = "고도 비만입니다.";
		} else if (bmi >= 30 && bmi <= 34.9) {
			bmiResult = "중도 비만입니다.";
		} else if (bmi >= 25 && bmi <= 29.9) {
			bmiResult = "경도 비만입니다.";
		} else if (bmi >= 23 && bmi <= 24.9) {
			bmiResult = "과체중입니다.";
		} else if (bmi >= 18.5 && bmi <= 22.9) {
			bmiResult = "정상입니다.";
		} else {
			bmiResult = "저체중입니다.";
		}
	}
		public void output() {
			System.out.printf("%2d %s %s %.2fcm %.2fKg 표준체중: %.2f BMI: %.2f %s%n",
					id, name, gender, height, weight, stdWeight, bmi, bmiResult);
	}
}
