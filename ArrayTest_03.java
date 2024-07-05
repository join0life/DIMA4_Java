
public class ArrayTest_03 {

	public static void main(String[] args) {
		String name = "이순신";
		String addr = new String("강감찬네 집"); // String() : 객체
		
		String[] sary1 = {"봄","여름","가을","겨울"}; // 많이 쓰는 방식
		String[] sary2 = new String[] {"봄","여름","가을","겨울"}; // String[] : 배열
		String[] sary3 = new String[] { new String("봄"),
										new String("여름"),
										new String("가을"),
										new String("겨울") };
		String[] sary4 = {new String("봄"),
				new String("여름"),
				new String("가을"),
				new String("겨울") }; // String 배열 + 다른 형 객체 --> 이런 경우에 많이 쓰는 방식
	}

}
