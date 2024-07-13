/*
 * [문제 19] 1~127까지의 코드값과 그에 해당하는 문자를 출력하시오.
 * 
 * 	1 : x
 *  2 : x
 *  3 : x
 *  
 *  65 : A
 *  66 : B
 *  
 *  127 : x 
 */
public class Exam_19 {

	public static void main(String[] args) {
		for(int i = 1;i<128;i++) {
			System.out.printf("%d : %c%n", i, (char)i); // (char) 써도 되고 안써도 됨
		}
		System.out.printf("=======%d%n", (int)('\n'));
		System.out.printf("=======%d%n", (int)('\r'));
		System.out.println("1\t2\t3\t");
	}
}
