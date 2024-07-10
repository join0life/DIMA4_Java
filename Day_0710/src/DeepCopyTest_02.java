import java.util.Arrays;

public class DeepCopyTest_02 {
	
	public static void main(String[] args) {
		int[] ary1 = {1,2,3,4,5};
		int[] ary2 = Arrays.copyOfRange(ary1, 1, 10); // to(10)값이 원본의 크기보다 크다면 0으로 채움 
		
		// 원본 배열
		for (int temp : ary1) 
			System.out.print(temp + " ");
		
		System.out.println();
		
		// 복사 배열
		for (int temp : ary2) 
			System.out.print(temp + " ");
	}
}
