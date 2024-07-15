package myexception;

public class ExceptionTest_01 {

	public static void main(String[] args) {
		String[] str = {"3", "7", "a"};
		
		try {
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[1]);
	//		int num3 = Integer.parseInt(str[2]); // NumberFormatException : 문자열을 숫자로 구문분석하기 때문에 발생
	//		int num4 = Integer.parseInt(str[3]); // ArrayIndexOutOfBoundsException
			
			int result = num1 / num2; // num2가 0일 때 : ArithmeticException
			
			System.out.println("처리 결과 : " + result);
		} catch (NumberFormatException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
