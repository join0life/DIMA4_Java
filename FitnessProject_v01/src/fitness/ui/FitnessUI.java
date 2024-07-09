package fitness.ui;

import java.util.Scanner;

import fitness.vo.Fitness;

public class FitnessUI {
	// Have-A 관계
	Scanner keyin = new Scanner(System.in);
	Fitness fitness = null; 
	
	// 생성자 
	public FitnessUI() {
		String choice;
		
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : create(); break;
			case "2" : retrieve(); break;
			case "3" : update(); break;
			case "4" : delete(); break;
			case "0" : 
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
	/*
	 * 회원 가입 
	 */
	private void create() {
		System.out.println("\n<< 회원가입 >>");
		
		String name, gender, check;
		int id;
		double height, weight;
		
		if (fitness != null) {
			System.out.println("## 내부 사정으로 가입이 불가능합니다.");
			return;
		}
		
		System.out.print(" # 아이디 : ");
		id = keyin.nextInt();
		
		System.out.print(" # 이름 : ");
		name = keyin.next();
		
		System.out.print(" # 성별(남/여) : ");
		gender = keyin.next();
		
		System.out.print(" # 키(cm) : ");
		height = keyin.nextDouble();
		
		System.out.print(" # 몸무게(Kg) : ");
		weight = keyin.nextDouble();
		
		System.out.print("등록하시겠습니까?(y/n) ");
		check = keyin.next();
		if (!(check.equals("y") || check.equals("Y"))) {
			System.out.println("## 가입이 중단되었습니다.");
			return;
		}
		
		fitness = new Fitness(id, name, gender, height, weight);
		System.out.println("## 가입이 완료되었습니다.");
		
	}
	private void retrieve() {
		System.out.println("\n<< 회원 정보 조회 >>");
		int id;
		
		if (fitness == null) {
			System.out.println("## 조회할 정보가 없습니다.");
			return;
		}
		
		System.out.print(" # 조회 아이디 : ");
		id = keyin.nextInt();
		
		if (id != fitness.getId()) {
			System.out.println("## 조회할 정보가 없습니다.");
			return;
		} 
				
		fitness.output();
		System.out.println();
		
	}
	private void update() {
		int height, weight;
		String check;

		if(fitness == null) {
			System.out.println("## 저장된 정보가 없습니다.\n");
			return;
		}
		System.out.print("> 아이디 : ");
		int id = keyin.nextInt();
		
		if(id != fitness.getId()) {
			System.out.println("## 저장된 정보가 없습니다.\n");
			return;
		}
		
		System.out.print("> 키 : ");
		height = keyin.nextInt();
		
		System.out.print("> 몸무게 : ");
		weight = keyin.nextInt();
		
		System.out.print("## 정말로 수정할까요? (Y/N)");
		check = keyin.next();
		
		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 수정 작업이 취소되었습니다.\n");
			return;
		}
		
		fitness.setHeight(height);
		fitness.setWeight(weight);
		
		System.out.println("## 수정 완료\n");
		
	}
	private void delete() {
		// 1) 탈퇴할 회원 여부 파악
		// 2) id를 물어봐서 같은 데이터가 있을 때만 탈퇴 (fitness = null;)
		// 3) 탈퇴 여부를 확인 (check 변수 필요)
		int id;
		String check;
		
		if (fitness == null) {
			System.out.println("회원 정보가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("# 아이디 : ");
		id = keyin.nextInt();
		
		
		if (id != fitness.getId()) {
			System.out.println("회원 정보가 일치하지 않습니다.");
			return;
		}
		
		System.out.print("## 정말로 탈퇴할까요? (Y/N)");
		check = keyin.next();
		
		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 탈퇴 작업이 취소되었습니다.\n");
			return;
		}
		
		fitness = null;
		
		System.out.println("탈퇴 처리 되었습니다.");
		
	}
	/*
	 * 메뉴를 화면에 출력
	 * C(Create), R(Retrieve), U(Update), D(Delete)
	 */
	private void menu() {
		System.out.println("==== [피트니스 회원 관리] ====");
		System.out.println("	1) 저 장");
		System.out.println("	2) 조 회");
		System.out.println("	3) 수 정");
		System.out.println("	4) 삭 제");
		System.out.println("	0) 종 료");
		System.out.print("  	# 선택 : ");
	}
}
