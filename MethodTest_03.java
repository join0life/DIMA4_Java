/*
 * public static void exchange(int a, int b);
 * Call by Value : 값에 의한 호출, 원본에 접근할 수 없다
 * Call by reference : 참조에 의한 호출, 원본에 접근 가능
 */
public class MethodTest_03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a="+a+", b="+b);
		exchange(a, b); // Call by Value
		System.out.println("a="+a+", b="+b);
	}
	
	public static void exchange(int a, int b) {
		int temp;
		
		temp = a;
		a = b;
		b = temp;
	}
	
}
