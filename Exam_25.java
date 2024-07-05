/*
 * [문제 25] int 배열 10개를 선언하고, 난수를 1~100사이로 발생시켜 초기화한다.
 * 			 1 2 3 4 5 6 7 8 9 10
 * 			 10 9 8 7 6 5 4 3 2 1 
 * 
 * 			가장 맨 앞의 데이터와 맨 뒤의 데이터 교환
 * 			맨 앞 + 1 위치와 맨 뒤 -1 위치의 데이터 교환
 */

public class Exam_25 {
	public static void main(String[] args) {
		int[] iary = new int[10];

		for(int i = 0; i < iary.length; ++i)
			iary[i] = (int)(Math.random()*100 + 1);

		System.out.println("### 교환 전");
		for(int i = 0; i < iary.length ; ++i)
			System.out.print(iary[i] + " ");

		System.out.println();
		
		for(int i = 0; i < iary.length / 2; ++i) {
			int temp = iary[i];
			iary[i] = iary[iary.length - (i+1)];
			iary[iary.length - (i+1)] = temp;
		}

		System.out.println("### 교환 후");
		for(int i = 0; i < iary.length; ++i) {
			System.out.print(iary[i]+" ");
		}
	}
}
