package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest_01 {

	public static void main(String[] args) {
		// Generic을 지정해서 ArrayList에 들어갈 객체 타입을 설정
		List<String> slist = new ArrayList<>();
		
		slist.add("아이스 아메리카노");
		slist.add("카푸치노");
		slist.add("카페라떼");
		slist.add("녹차라떼");
		System.out.println("데이터 개수: " + slist.size());
		
		slist.add(1, "더치커피");
		System.out.println(slist); // toString()이 자동 호출되어 문자열로 출력
		System.out.println(slist.get(2));
		System.out.println(slist.contains("녹차라떼"));
		System.out.println(slist.isEmpty()); // false
		System.out.println(slist.remove(0)); // 지운 데이터를 반환
		System.out.println(slist.remove("아이스 아메리카노"));
		System.out.println(slist);
		
		slist.set(0, "따뜻한 아메리카노");
		System.out.println(slist);
		
		slist.clear();
		System.out.println("데이터 개수: " + slist.size());
	}

}
