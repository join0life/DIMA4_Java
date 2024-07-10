package ui;

import java.util.Scanner;

import service.RentCarService;
import vo.RentCarVO;

public class RentCarUI {
	Scanner keyin = new Scanner(System.in);
	RentCarService service = new RentCarService();
	RentCarVO vo = new RentCarVO();
	
	public RentCarUI() {
		String choice;
		
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : create(); break;
			case "2" : retrieve(); break;
			case "3" : retrieveAll(); break;
			case "0" : 
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
	private void create() {
		System.out.println("\n<< 예약 >>");		
		String name, location, check;
		int car, phone;

		if (service.getCount() >= 100) {
			System.out.println("## 예약을 할 수 없습니다.");
			return;
		}

		System.out.print(" # 차 번호 : ");
		car = keyin.nextInt();

		// 동일한 예약자가 있는지 중복 체크
		if (service.selectOne(car) != null) {
			System.out.println("err> 중복된 예약자가 있습니다.");
			return;
		}


		System.out.print(" # 예약자명 : ");
		name = keyin.next();

		System.out.print(" # 전화번호 : ");
		phone = keyin.nextInt();

		System.out.print(" # 예약 위치 : ");
		location = keyin.next();

		System.out.print("예약하시겠습니까?(y/n) ");
		check = keyin.next();
		if (!(check.equals("y") || check.equals("Y"))) {
			System.out.println("## 예약이 중단되었습니다.");
			return;
		}

		RentCarVO rentCar = new RentCarVO(name, location, car, phone);
		boolean result = service.insert(rentCar);

		if (result == true) {
			System.out.println("## 예약이 완료되었습니다.");
		} else {
			System.out.println("## 예약 실패");
		}
		
	}

	private void retrieve() {
		System.out.println("\n<< 예약자 정보 조회 >>");
		int car;

		System.out.print(" # 차 번호 : ");
		car = keyin.nextInt();

		RentCarVO rentCar = service.selectOne(car);

		if (rentCar == null) {
			System.out.println("## 입력한 예약자의 정보가 없습니다.");
			return;
		} 

		rentCar.output();
		System.out.println();
		
	}

	private void retrieveAll() {
		System.out.println("\n<< 전체 예약자 조회 >>");
		
		int count = service.getCount();
		
		if (count == 0) {
			System.out.println("## 예약자가 한 명도 없습니다.");
			return;
		}
		
		RentCarVO[] list = service.selectAll();
		System.out.println("## 전체 예약자의 수 : " + count + "명");
		
		for (int i = 0; i<count; ++i) {
			RentCarVO rentCar = list[i];
			rentCar.output();
		}
	}		

	/*
	 * 메뉴를 화면에 출력
	 * C(Create), R(Retrieve), RA(Retrieve All)
	 */
	private void menu() {
		System.out.println("==== [자동차 렌트] ====");
		System.out.println("	1) 예 약");
		System.out.println("	2) 조 회");
		System.out.println("	3) 전체 출력 ");
		System.out.println("	0) 종 료");
		System.out.print("  	# 선택 : ");
	}

}


