package stringbufferapi;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello World";
		String str3 = new String("Hello World");
		
		
		// 내용 비교 (equals)
		if (str1.equals(str2)) System.out.println("내용 같다");
		if (str1.equals(str3)) System.out.println("내용 같다");
		
		// 주소 비교 ==
		if (str1 == str2) System.out.println("1, 2 주소 같다");
		if (str1 == str3) System.out.println("1, 3 주소 같다");
		
		// =================
		StringBuffer b1 = new StringBuffer("Hello World");
		StringBuffer b2 = b1.append("~~");
		
		System.out.println("내용 비교 : " + b1.equals(b2));
		System.out.println("주소 비교 : " + (b1 == b2));
	}

}
