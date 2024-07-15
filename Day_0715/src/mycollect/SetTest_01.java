package mycollect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest_01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("포도");
		set.add("딸기");
		set.add("수박");
		set.add("옥수수");
		set.add("바나나");
		
		// 1) 전체조회 : set은 순서 상관없이 조회
		set.forEach((fruit) -> System.out.print(fruit + " "));
		System.out.println();
		
		// 2) 조회
		boolean result = set.contains("수박");
		System.out.println(result);
		
		// 3) 삭제
		result = set.remove("수박");
		System.out.println(result? "삭제 완료" : "삭제 실패");
		
		int count = set.size();
		System.out.println("Set 데이터 개수 : " + count);
		
		result = set.add("옥수수");
		System.out.println(result? "추가 완료" : "추가 실패");
		
		// 4) Iterator를 이용한 전체 조회
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) { // 다음 데이터가 있으면 true, 없으면 false
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}

}
