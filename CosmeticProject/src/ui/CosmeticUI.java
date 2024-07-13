package ui;

import java.util.Scanner;

import service.CosmeticService;
import service.CosmeticServiceImpl;
import vo.Foundation;
import vo.Lipstick;
import vo.Product;

public class CosmeticUI {
	Scanner keyin = new Scanner(System.in);
	CosmeticService service = new CosmeticServiceImpl();
	
	public CosmeticUI() {
		String choice;
		
		while (true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : create(); break;
			case "2" : update(); break;
			case "3" : delete(); break;
			case "4" : retrieve(); break;
			case "5" : retrieveAll(); break;
			case "0" : 
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}
	}
	private void menu() {
		System.out.println("==== [ 화장품 관리 ] ====");
		System.out.println("	1. 상품 등록");
		System.out.println("	2. 상품 수정");
		System.out.println("	3. 상품 삭제");
		System.out.println("	4. 상품 조회");
		System.out.println("	5. 전체 상품 조회");
		System.out.println("	0. 종 료");
		System.out.println("===============");
		System.out.print("  	> 선택 : ");
	}

	private void create() {
		System.out.println("\n<< 상품 등록>>");
		String productNo, name, choice, type, color, texture;
		int price;

		System.out.print("1. 립스틱 / 2. 파운데이션 : ");
		choice = keyin.next();

		if (service.getCount() >= 50) {
			System.out.println("## 더 이상 상품을 등록하실 수 없습니다.");
			return;
		}

		if (choice.equals("1")) {
			System.out.print("> 상품번호 : ");
			productNo = keyin.next();

			if (service.selectOne(productNo) != null) {
				System.out.println("## 이미 등록된 상품입니다.");
				return;
			}

			System.out.print("> 상품명 : ");
			name = keyin.next();

			System.out.print("> 상품가격 : ");
			price = keyin.nextInt();

			System.out.print("> 립스틱 타입 : (1. 립밤 / 2. 립글로스 / 3. 틴트) : ");
			type = keyin.next();

			System.out.print("> 립스틱 색상 : (1. 빨강 / 2. 분홍 / 3. 오렌지) : ");
			color = keyin.next();

			Product product = new Lipstick(type, color, productNo, name, price);
			boolean result = service.insert(product);

			if (result == true) {
				System.out.println("## 상품이 등록되었습니다.");
			} else {
				System.out.println("## 상품 등록 실패");
			}
		} else if (choice.equals("2")) {
			System.out.print("> 상품번호 : ");
			productNo = keyin.next();

			if (service.selectOne(productNo) != null) {
				System.out.println("## 이미 등록된 상품입니다.");
				return;
			}

			System.out.print("> 상품명 : ");
			name = keyin.next();

			System.out.print("> 상품가격 : ");
			price = keyin.nextInt();

			System.out.print("> 파운데이션 제형 : (1. 크림 / 2. 스틱 ) : ");
			texture = keyin.next();

			Product product = new Foundation(texture, productNo, name, price);
			boolean result = service.insert(product);

			if (result == true) {
				System.out.println("## 상품이 등록되었습니다.");
			} else {
				System.out.println("## 상품 등록 실패");
			}
		} else 
			System.out.println("## 잘못된 선택입니다.");
	}

	private void update() {
		System.out.println("\n<< 상품 정보 수정 >>");
		
		String productNo, name, type, color, texture;
		int price;

		System.out.print("> 수정할 상품의 번호 : ");
		productNo = keyin.next();
		
		
		Product product = service.selectOne(productNo);
		
		if (product == null) {
			System.out.println("## 상품이 존재하지 않습니다.");
			return;
		}
		
		product.output();
		
		if (product instanceof Lipstick) {
			Lipstick lipstick = (Lipstick) product;
			
			System.out.print("> 상품명 : ");
			name = keyin.next();

			System.out.print("> 상품가격 : ");
			price = keyin.nextInt();

			System.out.print("> 립스틱 타입 : (1. 립밤 / 2. 립글로스 / 3. 틴트) : ");
			type = keyin.next();

			System.out.print("> 립스틱 색상 : (1. 빨강 / 2. 분홍 / 3. 오렌지) : ");
			color = keyin.next();

			lipstick.setName(name);
			lipstick.setPrice(price);
			lipstick.setType(type);
			lipstick.setColor(color);
			
		} else if (product instanceof Foundation) {
			Foundation foundation = (Foundation) product;
			
			System.out.print("> 상품명 : ");
			name = keyin.next();

			System.out.print("> 상품가격 : ");
			price = keyin.nextInt();
			
			System.out.print("> 파운데이션 제형 : (1. 크림 / 2. 스틱 ) : ");
			texture = keyin.next();
			
			foundation.setName(name);
			foundation.setPrice(price);
			foundation.setTexture(texture);
		}
		
		boolean result = service.update(product);
		if (result) {
			product.output();
			System.out.println("## 수정이 완료되었습니다.\n");
		} else {
			System.out.println("## 정보 수정 실패");
		}
		
		
	}

	private void delete() {
		System.out.println("\n<< 상품 삭제 >>");
		
		String productNo;
		String check;

		System.out.print("> 삭제할 상품의 번호 : ");
		productNo = keyin.next();

		Product product = service.selectOne(productNo);

		if (product == null) {
			System.out.println("## 상품이 존재하지 않습니다.");
			return;
		}
		
		product.output();

		System.out.print("## 상품을 삭제하시겠습니까? (y/n)");
		check = keyin.next();

		if (!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 삭제 작업이 취소되었습니다.\n");
			return;
		}

		boolean result = service.delete(productNo);
		
		if (result) {
			System.out.println("## 상품이 삭제되었습니다.\n");
		} else {
			System.out.println("## 삭제 실패");
		}

	}

	private void retrieve() {
		System.out.println("\n<< 상품 조회 >>");
		String productNo;

		System.out.print(" # 조회 상품 번호 : ");
		productNo = keyin.next();

		Product product = service.selectOne(productNo);

		if (product == null) {
			System.out.println("## 상품이 존재하지 않습니다.");
			return;
		} 

		product.output();
	}

	private void retrieveAll() {
		System.out.println("\n<< 전체 상품 조회 >>");

		int count = service.getCount();

		if (count == 0) {
			System.out.println("## 등록된 상품이 없습니다.");
			return;
		}

		Product[] list = service.selectAll();
		System.out.println("## 전체 상품의 수 : " + count + "개");

		for (int i = 0; i<count; ++i) {
			Product product = list[i];
			product.output();
		}
	}


}
