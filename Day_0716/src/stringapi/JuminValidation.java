package stringapi;

import java.util.Scanner;

public class JuminValidation {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String jumin = "941225-2123456";   // 올바른 주민번호
		
//		System.out.print("# 주민번호 입력 : ");
//		jumin = keyin.next();
		
		if(jumin.length() != 14) {
			System.out.println("# 잘못된 주민번호입니다. (길이)");
			System.exit(0);
		}
		
		if(!isValid(jumin)) {
			System.out.println("# 잘못된 주민번호입니다. (-)");
			System.exit(0);
		}
		String[] str = jumin.split("-");
		if(!(isNumeric(str[0]) && isNumeric(str[1]))) {
			System.out.println("# 잘못된 주민번호입니다. (숫자)");
			System.exit(0);
		}
		
		// 검증을 할 수 있는 조건 구비
		if(!(codeCheck(jumin))) {
			System.out.println("# 잘못된 주민번호입니다. (검증알고리즘)");
			System.exit(0);
		}
		
		// 올바른 주민번호
		String year, month, day, gender;
		
		year = birthyear(jumin);
		month = jumin.substring(2, 4);
		day= jumin.substring(4, 6);
		gender = genderCheck(jumin);
		
		// final result 출력
		System.out.println("당신은 "
				+ year  + "년 "
				+ month + "월 "
				+ day   + "일생 "
				+ gender + "입니다." );
	}
	
	// 주민번호를 전달받아 검증코드 알고리즘으로 올바른 주민번호인지 체크
	// 123456-5678901
	private static boolean codeCheck(String id) {
		int total = 0;	// 합계
		int temp  = 0;	// 주민번호 한 개씩 따와서 저장할 변수
		int value = 2;
		
		for(int i=0; i<id.length()-1; ++i) {
			if(i == 6) continue;    		// '-'를 건너뛰는 로직
			temp = id.charAt(i) - '0';      // '1'
			total += temp * value;
			value++;

			if(value == 10) value = 2;
		}
		
		int position = id.length()-1;
		int check = id.charAt(position) - '0';
		
		int tmp = 11 - (total % 11);
		
		if(tmp > 9) tmp = tmp % 10;   
		System.out.println(tmp);
		if(check == tmp) return true; 
		
		return false;
	}

	//  주민번호를 전달받아 성별 위치의 값이 1, 2이면 1900년도 생으로 3, 4이면 2000도 생으로 작성하여 반환
	private static String birthyear(String id) {
		String birth = null;
		char gender = id.charAt(7);
		
		if(gender == '1' || gender == '2')
			birth = "19".concat(id.substring(0, 2));
		else
			birth = "20".concat(id.substring(0, 2));
		
		return birth;
	}

	// 전달받은 주민번호로 1, 3이면 “남자”, 2, 4면 “여자”라는 문자열 반환
	private static String genderCheck(String id) {
		if((id.charAt(7) - '0') % 2 == 0) return "여성";
		return "남성";
	}

	// ‘-‘ 위치에 문자열이 올바르게 포함되어 있는지 체크하고, 성별의 범주가 1~4까지인지 체크
	private static boolean isValid(String id) {
		if(id.charAt(6) != '-') return false;
		
		char gender = id.charAt(7);
		if(gender >= '1' && gender <= '4') return true;

		return false;
	}

	// '-' 앞과 위에 숫자로만 되어 있는지 체크
	private static boolean isNumeric(String id) {
		for(int i=0; i<id.length(); ++i) {

			if(!(id.charAt(i) >= '0' && id.charAt(i) <= '9'))
				return false;
		}
		return true;
	}
}
