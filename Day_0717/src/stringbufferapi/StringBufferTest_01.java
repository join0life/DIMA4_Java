package stringbufferapi;

public class StringBufferTest_01 {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer();	// java.lang.* 내부의 클래스는 import 하지 않음
		System.out.println("버퍼 공간 : " + buf1.capacity()); // 16
		
		StringBuffer buf2 = new StringBuffer("나리 나리 개나리 입에따다 물고요. "
				+ "병아리떼 뿅뿅뿅 봄나들이 갑니다.");
		System.out.println("버퍼 공간 : " + buf2.capacity()); 
		
		StringBuffer buf3 = new StringBuffer(new StringBuffer("손오공, 근두운타고 놀러갑니다."));
		
		StringBuffer buf4 = new StringBuffer(100);
		System.out.println("버퍼 공간 : " + buf4.capacity());
	}

}
