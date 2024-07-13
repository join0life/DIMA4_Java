import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		int[] data = new int[10]; // 0 큰 값, 1 중간값, 2 작은 값

		for (int i = 0; i < data.length; ++i) {
			data[i] = (int)(Math.random()*100+1);
		}
		
		System.out.println("### 정렬 전 ###");
		for (int tmp : data) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		// 선택정렬 (Selection Sort)
		for (int i = 0; i <data.length - 1; ++i) {
			for(int j = i+1; j < data.length; ++j) {
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
//		System.out.printf("큰 값은 %d, 중간 값은 %d, 작은 값은 %d%n", data[0], data[1], data[2]);
		System.out.println("### 정렬 후 ###");
		for (int i = 0; i < data.length; ++i)
			System.out.print(data[i]+" ");
	}

}
