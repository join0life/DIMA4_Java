package enrollprogram;

import java.util.Scanner;

public class EnrollMain {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Speakable[] man = new Speakable[2]; // 두 명의 정보를 저장

		System.out.println("Speaker 등록 메인 메뉴입니다. 단 2명만 등록할 수 있습니다.");

		int count = 0;
		String choice;

		while(true) {
			System.out.println("어떤 Speaker를 등록하는 지 선택하세요.");
			System.out.println("1. Reader 등록");
			System.out.println("2. Worker 등록");
			choice = keyin.next();

			switch(choice) {
			case "1" : {
				System.out.println("이름을 입력하세요. ");
				String name = keyin.next();

				man[count++] = new Reader(name);

				break;
			}
			case "2" : {
				System.out.println("이름을 입력하세요. ");
				String name = keyin.next();

				man[count++] = new Worker(name);

				break;
			}
			default  :
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
			if (count == 2) {
				System.out.println("두 명 Speaker의 등록이 완료되었습니다. 이제 Speaker들의 speak 실행 결과입니다.");
				for (int i = 0; i<count; ++i) {
					System.out.println(man[i].speak());
				}
				return;
			}

		}
	}
}