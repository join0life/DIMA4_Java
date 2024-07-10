/*
 * 원의 반지름을 입력하여 원의 면적을 구하는 프로그램을 작성하시오
 */

import java.util.Scanner;

public class StaticTest {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int r;
		double area;
		
		// public static final double PI
		System.out.print("원의 반지름을 입력하시오: ");
		r = keyin.nextInt();
		area = r * r * Math.PI;
		// public static PrintStream out;
		System.out.printf("반지름이 %d인 원의 면적은 %.2f입니다.", r, area);
		
	}
}
