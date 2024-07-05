import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int temp;
		int[] data = new int[10]; // 0 큰 값, 1 중간값, 2 작은 값

//		int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//		int cnt = 0;
		for (int i = 0; i < data.length; ++i) {
			data[i] = (int)(Math.random()*100+1);
		}
		
		System.out.println("### 정렬 전 ###");
		for (int tmp : data) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		// 거품정렬 (Bubble Sort)
		for (int i = 0; i <data.length-1; ++i) {
//			cnt = 0;
			for(int j = 0; j < data.length-1-i; ++j) {
				if (data[j] < data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
//					cnt++;
				}
			}
//			if (cnt == 0) break;
		}
//		System.out.printf("큰 값은 %d, 중간 값은 %d, 작은 값은 %d%n", data[0], data[1], data[2]);
		System.out.println("### 정렬 후 ###");
		for (int i = 0; i < data.length; ++i)
			System.out.print(data[i]+" ");
		System.out.println();
//		System.out.println("바꾼 횟수 : " + cnt);
	}

}
