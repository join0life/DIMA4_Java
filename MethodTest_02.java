/*
 * 정수값을 입력받아 그 정수가 소수인지 판단하는 메소드를 작성하시오
 * 소수이면 true, 아니면 false 반환
 * 
 * 소수란? 1과 자기 자신 이외에는 나누어 떨어지지 않는 수
 * 		   2 3 5 7 11 
 * public static boolean isPrimeNumber(int);
 * 
 * <실행>
 * 수를 입력 : 9
 * 9는 소수가 아닙니다.
 * 수를 입력 : 7
 * 7은 소수입니다.
 */

import java.util.Scanner;

public class MethodTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int num;

		num = keyin.nextInt();
		
		boolean result = isPrimeNumber(num);
		
		System.out.println(num + "는(은) " + ((result) ? "소수입니다." : "소수가 아닙니다."));

//		if (isPrimeNumber(num)) {
//			System.out.println(num + "는(은) 소수입니다.");
//		} else {
//			System.out.println(num + "는(은) 소수가 아닙니다.");
//		}
		System.out.println(num + "는(은) " + ((isEven(num))? "짝수입니다." : "홀수입니다."));

	}
	public static boolean isPrimeNumber(int a) { // 2 ~ n-1
		for(int i = 2; i < a; ++i) { // a = 9라면, 
			if(a % i == 0) 
				return false;
		}
		return true;
	}

	public static boolean isEven(int n) {
		if (n % 2 == 0) return true;
		return false;
		}
	}

