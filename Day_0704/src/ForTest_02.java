/*구구단 출력*/

import java.util.Scanner;

public class ForTest_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan;
		
		System.out.print("몇 단 출력할까요?");
		dan = scanner.nextInt(); // 5
		
		for(int i = 1;i<=9;++i)
			System.out.println(dan + " x " + i + " = " + dan*i);
	}

}
