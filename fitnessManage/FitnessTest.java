package fitnessManage;

import java.util.Scanner;

public class FitnessTest {
	static Scanner keyin = new Scanner(System.in);

	public static void main(String[] args) {
		FitnessVO fitness = null;
		String choice;
		
		while (true) {
			menu();
			choice = keyin.next();
			
			switch (choice) {
			case "1" : fitness = input(fitness); break;// Call by Reference
			case "2" : output(fitness); break;
			case "0" :
				System.out.println("## 프로그램을 종료합니다.");
				System.exit(0);
			default : 
				System.out.println("## 메뉴 선택을 다시 해주세요.");
 			}
		}
	}
	
	public static void menu() {
		System.out.println("========== [ Fitness 회원관리 ] =========");
		System.out.println("1) 입 력");
		System.out.println("2) 출 력");
		System.out.println("0) 종 료");
		System.out.println("===================================");
		System.out.print("   선택 > ");
	}
	
	public static FitnessVO input(FitnessVO fitness) {
		fitness = new FitnessVO();
		String name, gender;
		double height, weight;
		
		System.out.print("** 이름 : ");
		name = keyin.next();
		
		System.out.print("** 성별 : ");
		gender = keyin.next();
		
		System.out.print("** 키(cm) : ");
		height = keyin.nextDouble();
		
		System.out.print("** 몸무게(Kg) : ");
		weight = keyin.nextDouble();
		
		fitness.setName(name);
		fitness.setGender(gender);
		fitness.setHeight(height);
		fitness.setWeight(weight);
		
		System.out.println("## 회원 가입 처리함!");
		return fitness;
	}
	public static void output(FitnessVO fitness) {
		if (fitness == null) {
			System.out.println("** 등록한 회원이 없습니다.");
			return;
		}
		System.out.println("이름 : "+ fitness.getName());
		System.out.println("성별 : "+ fitness.getGender());
		System.out.println("키(cm) : "+ fitness.getHeight());
		System.out.println("몸무게(Kg) : "+ fitness.getWeight());
	}
	
}
