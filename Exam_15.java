/*
 * [문제] 숫자1 : 50
 * 		  숫자2 : 40
 * 		  1) 덧셈 2) 뺄셈 3) 곱셈 4) 나눗셈 ==> 3
 * 		  곱셈의 결과는 2000
 */

import java.util.Scanner;

public class Exam_15 {
	
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int num1, num2, choice;
		double result = 0;
		
		System.out.print("숫자1 : ");
		num1 = keyin.nextInt();
		
		System.out.print("숫자2 : ");
		num2 = keyin.nextInt();
		
		System.out.print("1) 덧셈 2) 뺄셈 3) 곱셈 4) 나눗셈");
		choice = keyin.nextInt();
		
//		switch(choice) {
//		case 1 : result = num1 + num2; break;
//		case 2 : result = num1 - num2; break;
//		case 3 : result = num1 * num2; break;
//		case 4 : result = num1 / (double)num2; break;
//		default : {
//			System.out.println("잘못 입력하셨습니다.");
//			System.exit(0);
//		}
//		}
//		//switch문(2)
//		switch(choice) {
//		case 1 -> result = num1 + num2; 
//		case 2 -> result = num1 - num2; 
//		case 3 -> result = num1 * num2; 
//		case 4 -> result = num1 / (double)num2; 
//		default -> {
//			System.out.println("잘못 입력하셨습니다.");
//			System.exit(0);
//		}
//		}
		
		//switch 식
		result = switch(choice) {
		case 1 -> num1 + num2; 
		case 2 -> num1 - num2; 
		case 3 -> num1 * num2; 
		case 4 -> num1 / (double)num2; 
		default -> 0.0; // 무조건!
		};
		System.out.printf("%,.2f%n", result);
	}
}
