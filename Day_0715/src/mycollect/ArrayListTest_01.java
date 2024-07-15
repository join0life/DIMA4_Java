/*
 *  일반적인 객체를 ArrayList에 넣어서 테스트
 */
package mycollect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest_01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		// Integer는 정수형 기본자료형인 int를 객체화 시킨 클래스
		List<Integer> list2 = new ArrayList<>(); 
		// C(add()), R(get()), U(set()), D(remove())
		// size(), contains(), isEmpty(), clear()
		// 인덱스를 이용해 데이터에 접근한다.
		
		list1.add("역삼동");
		list1.add("상도동");
		list1.add("여의도동");
		list1.add("수유동");
		
		String temp = list1.get(3);
		System.out.println(temp);
		
		list1.add(0, "창동");
		int count = list1.size();
		System.out.println("데이터 개수 : " + count);
		
		// 전체순회-V1
		for (int i = 0; i<count; ++i) 
			System.out.print(list1.get(i) + " ");
		
		System.out.println();
		
		// Advanced For - V2
		for(String t : list1) 
			System.out.print(t + " ");
		
		System.out.println();
		
		// Lambda - V3 (권장)
		list1.forEach((t) -> System.out.print(t + " "));
		
		System.out.println();
		
		list1.set(2, "사당동");
		list1.forEach((t) -> System.out.print(t + " "));
		
		System.out.println();
		
		String tmp = list1.remove(1);
		list1.forEach((t) -> System.out.print(t + " "));
		
		System.out.println();
		
		System.out.println("삭제되어 반환된 데이터 : " + tmp);
		
		// 특정 데이터가 존재하는지 조회
		boolean result = list1.contains("수유동");
		System.out.println(result);
		result = list1.contains("월계동");
		System.out.println(result);
		
		
	}

}
