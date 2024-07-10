import java.util.Arrays;

public class DeepCopyTest_01 {
	
	public static void main(String[] args) {
		int[] ary1 = {1,2,3,4,5};
		int[] ary2 = Arrays.copyOf(ary1, 6); // deep copy, 남는 공간은 0으로 채움
		
		ary2[0] = 100; // ary2 배열 요소의 값을 바꿈
		
		// 원본 배열
		for (int temp : ary1) 
			System.out.print(temp + " ");
		
		System.out.println();
		
		// 복사 배열
		for (int temp : ary2) 
			System.out.print(temp + " ");
	}
}
