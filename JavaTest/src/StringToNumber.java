//문제 1
public class StringToNumber {
	public static void main(String[] args) {
		String source = "2345";
		int data = 19;
		
		if (isNumber(source)) {
			System.out.println("곱셈 연산의 결과 :  " + (data * toNumber(source)));
		}
		
	}
	
	//전달된 문자열 내에 숫자이외의 특수기호가 포함되어 있는지 여부 판단하여 true, false 반환
	private static boolean isNumber(String str) {
		for(int i=0; i<str.length(); ++i) {

			if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
				return false;
		}
		return true;
	}
	
	public static int toNumber(String str) {
		int translate = 0;

		for (int i = 0; i < str.length(); i++) {
			translate = translate * 10 + (str.charAt(i) - '0');
			}
		return translate;
	}
} 