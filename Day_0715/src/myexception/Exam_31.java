package myexception;

import java.util.Scanner;

/*
 * [문제-31] 정수 5개를 반복적으로 입력 받아 총 합계를 구하는 프로그램을 작성하시오
 * -- 반복문, if, 스캐너, 입력/합계 변수, try~catch	 
 * 값 1 => 5
 * 합계 => 5
 * 값 2 => k
 * 값 2 => ㅁ
 * 값 2 => 1
 * 합계 => 6
 */
public class Exam_31 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int total = 0;

		int i = 0;
		while (i < 5) {
			System.out.printf("값 %d => ", i+1);

			try {
				int input = keyin.nextInt(); // 오류날 확률이 있는 코드
				total += input;
				i++;
				
			} catch (Exception e) {
				keyin.nextLine(); // 버퍼 안의 모든 데이터를 가져옴
				--i;
				continue;
				// 이렇게 하거나 keyin.next();
			}
			System.out.printf("합계 => %d%n", total);
		}
	}
}