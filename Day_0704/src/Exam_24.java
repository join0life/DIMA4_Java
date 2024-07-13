
public class Exam_24 {

	public static void main(String[] args) {
		for(int x = 2; x<10; x += 4) {
			for (int i = 1;i<=9;++i) {
				for(int j=x; j<=x+4; ++j) {
//					System.out.print(j + "x" + i + "=" + j*i + "\t");
					System.out.printf("%d x %d = %2d\t", j, i, (j*i));
				}
				System.out.println();
			}
			System.out.println();	
		}
	}
}