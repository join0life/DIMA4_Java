/*
 * [문제 26] 중복 제거
 * 			 정수 배열 10개를 선언하고 난수 1~50까지 발생시켜 초기화 한다.
 * 			 배열 안에 저장된 데이터는 중복된 값이 들어갈 수 없다.
 * 
 */
public class Exam_26 {

	public static void main(String[] args) {
		int[] iary = new int[10];
		
		// 초기화
			for(int i = 0; i < iary.length; ++i) {
				iary[i] = (int)(Math.random()*50 + 1);
				// 중복된 데이터가 있는지 확인
				for (int j = 0; j < i; ++j) {
					if (iary[i] == iary[j]) {
						--i;
						break;
				}
			}
		}
			for(int test : iary)
				System.out.print(test + " ");
			System.out.println();
	}

}
