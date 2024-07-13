
import java.util.Scanner;

public class SwitchTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int score;
		String result = null;
		
		System.out.print("점수를 입력하시오(0~100) : ");
		score = keyin.nextInt();
		
		if (!(score >= 0 && score <= 100)) {
			System.out.println("## 점수가 잘못 입력되었습니다.");
			System.exit(1);
		} 
		
		switch (score / 10) {
		case 10 : case 9 : result = "A학점"; break;
		case 8 : result = "B학점"; break;
		case 7 : result = "C학점"; break;
		case 6 : result = "D학점"; break;
		default : result = "F학점";
 		}
		System.out.println(result);
	}

}
