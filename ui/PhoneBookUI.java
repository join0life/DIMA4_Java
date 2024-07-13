package ui;

import java.util.Scanner;

import service.PhoneBookService;
import service.PhoneBookServiceImpl;
import vo.PhoneBook;

public class PhoneBookUI {
	// Have-A 관계
	Scanner keyin = new Scanner(System.in);
	PhoneBookService service = new PhoneBookServiceImpl(); 
	
	public PhoneBookUI() {
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

	private void menu() {
		System.out.println("==== [연락처] ====");
		System.out.println("	1) 저 장");
		System.out.println("	2) 조 회");
		System.out.println("	3) 수 정");
		System.out.println("	4) 삭 제");
		System.out.println("	5) 전체 연락처 조회");
		System.out.println("	0) 종 료");
		System.out.print("  	# 선택 : ");		
	}

	private void create() {
		System.out.println("\n<< 연락처 등록 >>");

		String phoneNumber, name, relation, check;
		int age;

		if (service.getCount() >= 5) {
			System.out.println("## 연락처를 등록할 수 없습니다.");
			return;
		}

		System.out.print(" # 전화번호 : ");
		phoneNumber = keyin.next();

		// 동일한 아이디가 있는지 중복 체크
		if (service.selectOne(phoneNumber) != null) {
			System.out.println("err> 중복된 전화번호가 있습니다.");
			return;
		}


		System.out.print(" # 이름 : ");
		name = keyin.next();

		System.out.print(" # 관계 : ");
		relation = keyin.next();

		System.out.print(" # 나이 : ");
		age = keyin.nextInt();

		System.out.print("등록하시겠습니까?(y/n) ");
		check = keyin.next();
		if (!(check.equals("y") || check.equals("Y"))) {
			System.out.println("## 가입이 중단되었습니다.");
			return;
		}

		PhoneBook book = new PhoneBook(phoneNumber, name, relation, age);
		boolean result = service.insert(book);

		if (result == true) {
			System.out.println("## 연락처가 저장되었습니다.");
		} else {
			System.out.println("## 연락처 저장 실패");		
		}
	}

	private void retrieve() {
		System.out.println("\n<< 연락처 조회 >>");
		String phoneNumber;

		System.out.print(" # 조회 전화번호 : ");
		phoneNumber = keyin.next();

		PhoneBook book = service.selectOne(phoneNumber);

		if (book == null) {
			System.out.println("## 입력한 전화번호의 연락처가 없습니다.");
			return;
		} 

		System.out.println(book);
		
	}

	private void update() {
		System.out.println("\n<< 연락처 수정 >>");
		
		String phoneNumber;
		String check;
		String relation;
		int age;

		System.out.print("> 전화번호 : ");
		phoneNumber = keyin.next();
		
		PhoneBook book = service.selectOne(phoneNumber);

		if(book.equals(null)) {
			System.out.println("## 입력한 전화번호에 해당하는 연락처가 없습니다.");
			return;
		}

		System.out.print("> 관계 : ");
		relation = keyin.next();

		System.out.print("> 나이 : ");
		age = keyin.nextInt();

		System.out.print("## 정말로 수정할까요? (Y/N)");
		check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 수정 작업이 취소되었습니다.\n");
			return;
		}

		book.setRelation(relation);
		book.setAge(age);
		
		boolean result = service.update(book);
		if (result) {
			System.out.println("## 수정이 완료되었습니다.\n");
		} else {
			System.out.println("## 정보 수정 실패");
		}
	}

	private void delete() {
		String phoneNumber;
		String check;

		System.out.print("# 전화번호 : ");
		phoneNumber = keyin.next();

		PhoneBook book = service.selectOne(phoneNumber);

		if (book.equals(null)) {
			System.out.println("## 입력한 전화번호에 해당하는 연락처가 없습니다.");
			return;
		}

		System.out.print("## 정말로 삭제할까요? (Y/N)");
		check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 삭제 작업이 취소되었습니다.\n");
			return;
		}

		boolean result = service.delete(phoneNumber);
		
		if (result) {
			System.out.println("## 삭제가 완료되었습니다.\n");
		} else {
			System.out.println("## 삭제 실패");
		}

	}

	private void retrieveAll() {
		System.out.println("\n<< 전체 연락처 조회 >>");
		
		int count = service.getCount();
		
		if (count == 0) {
			System.out.println("## 가입한 회원이 한 명도 없습니다.");
			return;
		}
		
		PhoneBook[] list = service.selectAll();
		System.out.println("## 전체 연락처 수 : " + count + "명");
		
		for (int i = 0; i<count; ++i) {
			PhoneBook book = list[i];
			System.out.println(book);
		}		
	}

	
}
