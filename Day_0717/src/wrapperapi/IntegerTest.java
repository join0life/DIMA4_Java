package wrapperapi;

public class IntegerTest {

	public static void main(String[] args) {
		Integer i1 = 2147483647;	// int 데이터 12가 Integer로 wrap 된 것임
		i1 = i1 + 1;
		System.out.println(i1); // 1을 더하면 부호가 바뀜
		
		System.out.println(Integer.BYTES); // 바이트
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); // 비트
		
		// 정수값이 메모리에 저장됐을 때 1의 개수
		int temp = Integer.bitCount(12); // 0000 1100
		System.out.println(temp);
		System.out.println(Integer.bitCount(3)); // 0000 0011
		System.out.println(Integer.bitCount(10)); // 0000 1010
		System.out.println(Integer.bitCount(-1)); // 1111 1111
		
		String str = "12";
		
		// 문자열 데이터를 정수로 변환할 수 있도록 구문 분석하는 메소드
		int i2 = Integer.parseInt(str); 
		System.out.println(i2 * 7);
		
		// 첫 번째 전달인자 : 숫자로 구문 분석가능한 문자열
		// 두 번째 전달인자 : 첫 번째 문자열이 몇 진수인지
		// 숫자를 10진수로 변환하는 메소드
		int i3 = Integer.parseInt("A", 16); // 16진수 12 ==> 10진수 18
		System.out.println(i3);
	}

}
