package stringbufferapi;

public class StringBufferTest_02 {

	public static void main(String[] args) {
//		String str = new String("무궁화 꽃");
//		str.concat("이 피었습니다."); // 원본 안바뀜 (Immutable), 원본 바꾸려면 str로 다시 받아줘야 함
//		System.out.println(str);
		
		StringBuffer buf1 = new StringBuffer("무궁화 꽃");
		buf1.append("이 피었습니다."); // 원본 바뀜
		buf1.append(false);
		buf1.append(25);
		System.out.println(buf1.charAt(4));
		System.out.println(buf1);
		
		buf1.insert(0, "산과들에 ");
		System.out.println(buf1);
		
		buf1.delete(1, 3);
		System.out.println(buf1);
		
		buf1.replace(3, 6, "장미");
		System.out.println(buf1); 
		
		buf1.reverse();
		System.out.println(buf1); 
		
		System.out.println("용량 : " + buf1.capacity());
		buf1.trimToSize();
		System.out.println("용량 : " + buf1.capacity());
		
		String temp = buf1.toString(); // 문자열로 변환
		System.out.println(temp);
		System.out.println(temp.getClass());
		System.out.println(buf1.getClass());
		
	}

}
