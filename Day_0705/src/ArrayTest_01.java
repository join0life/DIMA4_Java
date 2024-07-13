
public class ArrayTest_01 {

	public static void main(String[] args) {
		// 정수 배열 생성 후 초기화
//		int[] iary = new int[10];
//		iary[0] = 15;
//		iary[1] = 5;
//		iary[2] = 7;

		int[] iary = new int[10];
//		int[] iary = {15, 5, 7, 0, 0, 0, 0, 0}; // 많이 쓰는 방식
//		int[] iary = new int[] {15, 5, 7, 0, 0, 0, 0, 0}; --> 이런 방법도 있지만 잘 안 씀
		
		// 데이터를 발생시켜 초기화(100 : 10~109) (101 : 10~110)
		for(int idx = 0; idx < iary.length; ++idx)
			iary[idx] = (int)(Math.random()*101 + 10); // Math.random() : 0~1(0이상 1미만)
			// 101 : 발생시키는 데이터의 개수, 10 : 초기값
			// ex. 1~100 : Math.random()*100 + 1)
		
		for(int idx = 0; idx < iary.length ; ++idx)
			System.out.println(iary[idx]);
	}
}
