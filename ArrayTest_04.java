
public class ArrayTest_04 {

	public static void main(String[] args) {
//		int[][] ary = new int[3][4];
		
		int[][] ary = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		System.out.println("ary의 개수 : " + ary.length);
		System.out.println("ary의 위치 : " + ary);
		
		System.out.println("ary[0]의 위치 : " + ary[0]);
		System.out.println("ary[0]의 개수 : " + ary[0].length);
		System.out.println("ary[0][0]의 데이터 : " + ary[0][0]);
		
//		int ary2[][] = new int[3][4];
//		int[] ary3[] = new int[3][4];
		
		for(int i = 0; i<ary.length; ++i) {
			for(int j =0; j < ary[i].length; ++j) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
	}

}
