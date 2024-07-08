import java.util.Scanner;

public class MethodTest_05 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int x, y;
		double result = 0;
		String choice = null;

		while (true) {
			System.out.print("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 0. 종료 ==> ");
			choice = keyin.next();
			if (choice.equals("0")) break;

			System.out.print("숫자 1: "); x = keyin.nextInt();
			System.out.print("숫자 2: "); y = keyin.nextInt();

			switch(choice) {
			case "1" ->  result = add(x, y);
			case "2" ->  result = substract(x, y);
			case "3" ->  result = multiply(x, y);
			case "4" ->  result = divide(x, y);
			default -> System.out.println("잘못된 입력입니다.");
			}

			System.out.println("결과는 : " + result);

		}


	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int substract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static double divide(int a, int b) {
		return (double)a / b;
	}
}
