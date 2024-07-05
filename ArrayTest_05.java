
public class ArrayTest_05 {

	public static void main(String[] args) {
		int[][] iary = new int[3][5];
		
		// 초기화
		int initValue = 0;
		for (int i =0; i< iary.length; ++i) 
			for (int j =0; j < iary[i].length; ++j) 
				iary[i][j] = initValue++;
				
		for (int i =0; i<iary.length;++i) {
			for (int j =0; j < iary[i].length; ++j) 
				System.out.printf("%2d ", iary[i][j]);
			System.out.println();
		}
	}

}
