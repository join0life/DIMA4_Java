/*
 * [문제 23] 구구단 2단에서부터 9단까지 모두 출력하시오
 * 2x1=2
 * 2x2=4
 * 2x9=18
 * 3x1=3
 *  :
 * 3x9=27
 */
public class Exam_23 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; ++i) {
			for(int j = 1 ; j<= 9; ++j) {
				System.out.println(i + "x" + j + "=" + i*j);
//				System.out.printf("%d x %d = %2d%n", i, j, (i*j));
			}
		System.out.println();
		}
		
	}

}
