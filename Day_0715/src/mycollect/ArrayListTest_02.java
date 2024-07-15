package mycollect;

import java.util.ArrayList;
import java.util.List;

import vo.Emp;

public class ArrayListTest_02 {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		
		// 1) 직원 데이터 저장
		list.add(new Emp(1, "이몽룡", 2500, "기획부"));
		list.add(new Emp(2, "변사또", 3400, "전산실"));
		list.add(new Emp(3, "성춘향", 2700, "영업부"));
		list.add(new Emp(4, "김방자", 3000, "고객응대"));
		
		// 2) 직원 수 출력
		System.out.println("직원수 : " + list.size());
		
		// 3) 전체 데이터 조회
		list.forEach((item) -> System.out.print(item + " "));
		System.out.println();
		
		// 4) 사원번호 3번인 직원을 조회
		for (int i = 0; i < list.size(); i++) {
			Emp emp = list.get(i); // 전체 직원 정보를 꺼냄
			if(emp.getEmpno() == 3) { // Integer가 자동 unboxing 됨
				System.out.println(emp);
				break;
			}
		}
		
		// 5) "김방자"라는 직원이 있는지 조회
		// 오류 : 목록에는 Emp인데, contains 전달값은 String이기 때문
		@SuppressWarnings("unlikely-arg-type")
		boolean result = list.contains("김방자");
		System.out.println(result);
		
		// Emp 클래스 내부에 equals() 메소드가 Overriding이 되어 있어야 비교 가능
		result = list.contains(new Emp(4, "김방자", 3000, "고객응대팀"));
		System.out.println(result);
	
			
	} 

}
