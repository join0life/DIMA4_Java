/*
 * [문제 27] 스무고개
 * 난수 1~100의 수 한 개를 발생(답)시켜 5회 안에 맞추는 프로그램을 작성하시오.
 * 
 * 맞춰보세요 -> 7
 * up
 * 틀렸습니다. 맞춰보세요 -> 90
 * down
 * 틀렸습니다. 맞춰보세요-> 50
 * up
 * 다섯번 만에 맞추기 
 */

import java.util.Scanner;

public class Exam_27 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int input, random;

		random = (int)(Math.random()*100 + 1);

		for (int i = 0; i <5; i++) {
			System.out.print((i+1) + "회) 답을 입력 : ");
			input = keyin.nextInt();

			if (input > random) {
				System.out.printf("down%n");
			} else if (input < random) {
				System.out.printf("up%n");
			} else {
				System.out.println("### 짝짝짝 맞췄습니다.");
				System.exit(0);
			}
		}
		System.out.println("## 못맞췄습니다. 정답은 "+random);
	}
}