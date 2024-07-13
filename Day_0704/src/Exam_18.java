/*
 * [문제 18a] n까지의 자연수의 합을 구하시오
 * 		  n을 입력하시오. 제어변수 i, 합계누적 변수 total
 * <실행>
 * 자연수 n을 입력 : 10
 * 1~10까지의 합계 = 55
 * 
 * [문제 18b] n까지의 Factorial을 구하시오
 * 		      팩토리얼 변수 factorial
 * <실행>
 * 자연수 n을 입력 : 5
 * 1~5까지의 합계 = 15
 * 5! = 1 * 2 * .... * 5
 * 
 */

import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int total= 0, factorial = 1;
		int n, i = 1;

		System.out.print("자연수를 입력하시오 : ");
		n = keyin.nextInt();

		while (i <= n) {
			total += i;
			factorial *= i;
			i++;
		}
		System.out.printf("1~%d까지의 합계 : %d%n", n, total);
		System.out.printf("%d! = %d", n, factorial);
	}

}
