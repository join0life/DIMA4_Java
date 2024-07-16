package stringapi;

public class StringTest_02 {

	public static void main(String[] args) {
		String str = "i have a dream. a song to sing!";
		
		// 1) 문자열의 길이를 구하여 반환
		int size = str.length();
		System.out.println("문자열의 길이 : " + size);
		
		// 2)  전달된 인덱스 위치의 문자 한 개를 반환
		char ch = str.charAt(0);
		System.out.println(ch);
		
		String s = "Korea!";
		String t = "Korea!";
		
		// 두 문자열을 비교해서 앞이 크면 양수, 같으면 0, 앞이 작으면 음수
		// 'K' - 'K', 'o' - 'o' ... 의 유니코드 값 빼줌, 0이 나오면 s와 t가 같다는 뜻.
		System.out.println("compareTo() : " + s.compareTo(t));
		System.out.println("concat() : " + s.concat(" Victory~"));
		System.out.println("문자열 + : " + (s + " Victory~"));
		
		// 특정 문자열이 포함되어 있는지 여부 확인
		System.out.println("contains() : " + str.contains("song"));
		
		// 전달한 문자열로 끝나는지 확인
		System.out.println("endsWith() : " + s.endsWith("?"));
		
		// 단어 비교
		System.out.println("equals() : " + s.equals(t));
		
		// 전달된 문자가 문자열 내에서 어느 위치에 있는지 index를 반환
		System.out.println("indexOf() : " + s.indexOf('a'));
		
		// 문자열이 비었는지 확인
		System.out.println("isEmpty() : " + s.isEmpty());
		System.out.println("isEmpty() : " + "".isEmpty());
		
		//
		String l = "ha ha ho ho ha ha";
		System.out.println("lastIndexOf() : " + l.lastIndexOf('o'));
		System.out.println("lastIndexOf() : " + l.indexOf('o'));

		// 문자를 바꿔치기 하는 함수 (immutable)
		String copied = s.replace('!', '?');
		System.out.println("replace() : " + s.replace('!','?'));
		System.out.println("replace 이후 원본의 모습 : " + s);
		System.out.println("같은 문자열인가? " + (copied == s)); // 주소가 같은지 비교
		
		String test = "서울 대전 대구 부산 전주";
		String[] sAry = test.split(" "); // delimeter(구분자)
		System.out.println("sAry 데이터 개수 : " + sAry.length);
		for (String k : sAry) System.out.println(k);
		
		// 부분문자열 추출
		String addr = "서울시 동작구 사당동";
		System.out.println("substring() : " + addr.substring(4));
		System.out.println("substring() : " + addr.substring(4, 7));
		
		System.out.println("toUpperCase() : " + addr.toUpperCase());
		
		String email = " hong@naver.com ";
		
		System.out.println("trim() 전 : " + email.length());
		System.out.println("trim() 후 : " + email.trim().length());
		
	}

}
