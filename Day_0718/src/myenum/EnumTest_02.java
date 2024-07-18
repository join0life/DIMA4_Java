package myenum;

public class EnumTest_02 {

	public static void main(String[] args) {
		Season2 s = Season2.여름;
		
		System.out.println(s.getData()); // 매칭된 영어단어 반환
		System.out.println(Season2.가을.getData());
	}

}
