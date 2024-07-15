package mycollect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_01 {

	public static void main(String[] args) {
		// Key는 Set이다.
		// 인덱스가 없다. 데이터에 접근할 때에는 키를 이용해 접근
		// 데이터가 순서없이 들어감.
		// 다량의 데이터를 조회할 때 List보다 성능이 좋음
		// put(), get()
		Map<Integer, String> map = new HashMap<>(); 
		
		
		// C(Create)
		map.put(1, "이순신");
		map.put(2, "강감찬");
		map.put(3,  "권율");
		map.put(4,  "김유신");
		
		// R(Read)
		String find = map.get(4); // 4는 key값이며, 인덱스 아님!!
		System.out.println(find);
		
		// size() : 데이터의 총 개수
		int count = map.size();
		System.out.println("데이터의 총 개수 : " + count);
		
		// U(Update) ==> 김유신을 홍범도로 수정
		String temp = map.replace(4, "홍범도");
		System.out.println(temp);
		
		System.out.println(map);
		
		//권율을 맥아더로 수정
		temp = map.put(3, "맥아더");
		System.out.println(temp);
		
		System.out.println(map);
		
		// 키를 이용해 조회(검색)
		boolean result = map.containsKey(5);
		System.out.println(result? "5번 있음" : "5번 없음");
		
		// 값을 이용해 조회
		result = map.containsValue("김구");
		System.out.println(result? "김구 있음" : "김구 없음");
		
		// 삭제
		String removedData = map.remove(1);
		System.out.println("삭제 처리된 사람 : " + removedData);
		
		// 데이터 전체 조회
		// Set<Integer> keys = map.keySet(); Iterator<Integer> iter = keys.iterator();
		
		// 1) 키목록을 이용해 Iterator 객체 생성
		Iterator<Integer> iter = map.keySet().iterator();
		
		// 2) 전체 조회
		while (iter.hasNext()) {
			Integer key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
	}

}
