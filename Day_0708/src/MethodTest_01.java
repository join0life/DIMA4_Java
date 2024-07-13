// 호출(static 메소드 안에서는 non-static을 호출 불가)
public class MethodTest_01 {
	public static void main(String[] args) {
		int a = 22;
		int b = 30;
		int test = add(a, b);	// 전달인자(arguments)
		System.out.println(test);
		
		System.out.println(multiply(a, b));
		
		test = power(a, 3); // a의 세제곱을 계산해서 반환하는 메소드 
		System.out.println(test);
	}
	// 메소드 선언 (정의) - 클래스 메소드
	public static int add(int a, int b) { // 매개변수(parameter)
		int result = a + b;
		return result;
	}
	
	public static int multiply(int a, int b) { // 메소드는 중괄호 생략 못 함
		return a * b;
	}
	
	public static int power(int a, int b) {
		int result = 1;
		
		for(int i = 0; i < b; ++i)
			result = result * a;
		
		return result;
	}
}
