package fitness.ui;

import java.util.Scanner;

import fitness.service.FitnessService;
import fitness.vo.Fitness;

public class FitnessUI {
	// Have-A 관계
	Scanner keyin = new Scanner(System.in);
	FitnessService service = new FitnessService();

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
			case "5" : retrieveAll(); break;
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

		if (service.getCount() >= 5) {
			System.out.println("## 회원가입을 할 수 없습니다.");
			return;
		}

		System.out.print(" # 아이디 : ");
		id = keyin.nextInt();

		// 동일한 아이디가 있는지 중복 체크
		if (service.selectOne(id) != null) {
			System.out.println("err> 중복된 아이디가 있습니다.");
			return;
		}


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

		Fitness fitness = new Fitness(id, name, gender, height, weight);
		boolean result = service.insert(fitness);

		if (result == true) {
			System.out.println("## 가입이 완료되었습니다.");
		} else {
			System.out.println("## 회원가입 실패");
		}

	}
	private void retrieve() {
		System.out.println("\n<< 회원 정보 조회 >>");
		int id;

		System.out.print(" # 조회 아이디 : ");
		id = keyin.nextInt();

		Fitness fitness = service.selectOne(id);

		if (fitness == null) {
			System.out.println("## 입력한 아이디의 회원 정보가 없습니다.");
			return;
		} 

		fitness.output();
		System.out.println();

	}
	private void update() {
		System.out.println("\n<< 회원 정보 수정 >>");
	
		int id;
		String check;
		double height, weight;

		System.out.print("> 아이디 : ");
		id = keyin.nextInt();
		
		Fitness fitness = service.selectOne(id);

		if(fitness == null) {
			System.out.println("## 입력한 아이디에 해당하는 회원이 없습니다.");
			return;
		}

		System.out.print("> 키(cm) : ");
		height = keyin.nextInt();

		System.out.print("> 몸무게(Kg) : ");
		weight = keyin.nextInt();

		System.out.print("## 정말로 수정할까요? (Y/N)");
		check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 수정 작업이 취소되었습니다.\n");
			return;
		}

		fitness.setHeight(height);
		fitness.setWeight(weight);
		
		boolean result = service.update(fitness);
		if (result) {
			System.out.println("## 수정이 완료되었습니다.\n");
		} else {
			System.out.println("## 정보 수정 실패");
		}
	}
	private void delete() {
		int id;
		String check;

		System.out.print("# 아이디 : ");
		id = keyin.nextInt();

		Fitness fitness = service.selectOne(id);

		if (fitness == null) {
			System.out.println("## 입력한 아이디에 해당하는 회원이 없습니다.");
			return;
		}

		System.out.print("## 정말로 탈퇴할까요? (Y/N)");
		check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 탈퇴 작업이 취소되었습니다.\n");
			return;
		}

		boolean result = service.delete(id);
		
		if (result) {
			System.out.println("## 탈퇴가 완료되었습니다.\n");
		} else {
			System.out.println("## 탈퇴 실패");
		}

	}
	
	// 회원 전체 조회
	private void retrieveAll() {
		System.out.println("\n<< 전체 회원 조회 >>");
		
		int count = service.getCount();
		
		if (count == 0) {
			System.out.println("## 가입한 회원이 한 명도 없습니다.");
			return;
		}
		
		Fitness[] list = service.selectAll();
		System.out.println("## 전체 회원의 수 : " + count + "명");
		
		for (int i = 0; i<count; ++i) {
			Fitness fitness = list[i];
			fitness.output();
		}
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
		System.out.println("	5) 전체 회원 조회");
		System.out.println("	0) 종 료");
		System.out.print("  	# 선택 : ");
	}
}
