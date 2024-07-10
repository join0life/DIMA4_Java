
public class SwallowCopy {
	
	public static void main(String[] args) {
		int[] ary1 = {1,2,3,4,5};
		int[] ary2;
		
		// 얕은 복사
		ary2 = ary1; // 주소 복사
		for (int temp : ary1) 
			System.out.print(temp + " ");
		
		System.out.println();
		
		ary2[1] = 100; // ary2 배열 요소의 값을 바꿈
		
		for (int temp : ary1) 
			System.out.print(temp + " ");
	}
}
