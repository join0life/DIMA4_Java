package stringapi;

// String에 있는 메소드만 사용하여 처리할 것.
public class Test {

	public static void main(String[] args) {
		String n1 = "123"; // ==> 숫자로 변환 (단, charAt())
		String n2 = "45";
		
		int size = n1.length();
		int result = 0;

		for (int i = 0; i < size; i++) {
			result = result * 10 + (n1.charAt(i) - '0');
			}
		
		System.out.println(result);
	
	}

}
