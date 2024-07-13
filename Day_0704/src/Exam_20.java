/*
 * [문제 20] for문을 이용해서 대문자 알파벳을 출력하시오.
 * ABCDEFGHIJKLMNOPQRXTUVWXYZ
 */
public class Exam_20 {

	public static void main(String[] args) {
		for(int i = 65;i<=90;++i) { // for(char i = 'A'; i <= 'Z'; ++i)
			System.out.print((char)i);
			if (i=='S') continue;
		}
	}

}
// break : switch, while, for 문장을 벗어남
// continue : while -> 조건식으로 이동, for => 증감식으로 이동  