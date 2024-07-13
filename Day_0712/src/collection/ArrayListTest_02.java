package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest_02 {

	public static void main(String[] args) {
		List<String> slist = Arrays.asList("아이스 아메리카노"
				, "더치커피"
				, "카푸치노"
				, "카페라떼"
				, "녹차라떼");
//		System.out.println(slist);
		
		// 데이터 전체 순회
		for(String temp : slist) 
			System.out.println(temp);
		
		slist.forEach((data) -> System.out.println(data));
	}

}
