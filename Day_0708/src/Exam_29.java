import java.util.Scanner;

public class Exam_29 {

	public static void main(String[] args) {
		System.out.println("[문제 29] 2차원 정수 배열 6x6 생성");
		// 1~10 사이의 난수를 생성하여 0,0~5,5열까지 초기화
		// 6행과 6열은 각 행과 열의 합이 저장됨
        Scanner keyin = new Scanner(System.in);
        
        int[][] iary = new int [6][6]; // 6x6 배열 생성
        
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				iary[i][j] = (int)(Math.random() * 10 + 1); // 5x5 초기화
			}
		}
		
		for (int i = 0; i < 5; ++i) {
            int row = 0;
            for (int j = 0; j < 5; ++j) {
                row += iary[i][j];
            }
            iary[i][5] = row; // 6행에 값 넣기
        }
		
        for (int j = 0; j < 5; ++j) {
            int col = 0;
            for (int i = 0; i < 5; ++i) {
                col += iary[i][j];
            }
            iary[5][j] = col; // 6열에 값 넣기
        }
		
        for (int i = 0; i < 6; ++i) {
        	for (int j = 0; j < 6; ++j) {
        		System.out.printf("%3d ", iary[i][j]);
        	}
        	System.out.println();
        }
	}
}