/*
 * [문제] 1~100까지의 자연수 중에서 3과 5의 배수(공배수)만 출력하시오.
 * 		  continue문을 사용할 것
 */
public class Exam_21 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; ++i) {
//			if (i % 3 == 0 && i % 5 ==0) System.out.print(i + " ");
			if (!(i % 3 == 0 && i % 5 ==0)) continue;
				System.out.print(i + " ");
		}
	}

}
