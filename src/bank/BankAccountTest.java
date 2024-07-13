package bank;

import java.util.Scanner;

public class BankAccountTest {
	static Scanner keyin = new Scanner(System.in);
	
	public static void main(String[] args) {
		BankAccountVO bank = new BankAccountVO();
		String choice;
		
		while (true) {
			menu();
			choice = keyin.next();
			switch (choice) {
			case "1" : input(bank); break;
			case "2" : output(bank); break;
			case "0" :
				System.out.println("프로그램 종료합니다.");
				return; //System.exit(0); 해도 됨
			default :
				System.out.println("메뉴 선택 오류");
			}
			}
		}
	public static void menu() {
		System.out.println("========== [ DIMA은행 입출금] =========");
		System.out.println("1) 입 금");
		System.out.println("2) 출 금");
		System.out.println("0) 종 료");
		System.out.println("===================================");
		System.out.print("   선택 > ");
	}

	public static void input(BankAccountVO bank) {
		String accountNo;
		int money;
		
		System.out.println("> 계좌번호 : ");
		accountNo = keyin.next();
		
		System.out.println("> 금 액 : ");
		money = keyin.nextInt();
		
		bank.setAccountNo(accountNo);
		bank.deposit(money);
		
	}
	
	public static void output(BankAccountVO bank) {
		String accountNo;
		int money;
		
		System.out.println("> 계좌번호 : ");
		accountNo = keyin.next();
		
		System.out.println("> 출금액 : ");
		money = keyin.nextInt();
		
		int myMoney = bank.withdraw(money);
		if (myMoney == -1) {
			System.out.println("## 잔고 부족!");
			return;
		}
		
		System.out.printf("%s계좌에서 %d원 출금하고 %d원이 남았습니다.", bank.getAccountNo(), myMoney, bank.getBalance());
	}
	
}
