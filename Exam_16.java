/*
 * [문제] 성별, 키(cm)와 몸무게(kg)를 키보드로 입력 받아 표준체중과 BMI를 구하시오!
 * 		  남성 표준체중 = 키(m) x 키(m) x 22
 * 		  여성 표준체중 = 키(m) x 키(m) x 21
 * 
 * 		  몸무게(kg)을 지정한 후 BMI를 구하시오!
 * 		  BMI = 몸무게(kg) / 키(m)의 제곱
 */

import java.util.Scanner;

public class Exam_16 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double height, weight, stdWeight, bmi;
		String gender;
		
		System.out.print("성별 입력(남/여) : ");
		gender = keyin.next();
		
		System.out.print("키(cm) 입력 : ");
		height = keyin.nextDouble();
		
		System.out.print("몸무게(kg) 입력 : ");
		weight = keyin.nextDouble();
		// ---------- 입력
		
		double temp = height / 100;
		
		// 남자인지 여자인지 판단해서 표준체중을 다르게 계산해야 함
		// switch문으로 수정
		switch (gender) {
		case "남" : stdWeight = temp * temp * 22; break;
		case "여" : stdWeight = temp * temp * 21; break;
		}
		
		bmi = weight / (temp * temp);
		// BMI 결과 처리
//		고도 비만 : 39 이상
//		중(重)도 비만 (2단계 비만) : 32 - 38.9
//		경도 비만 (1단계 비만) :30 -36.9
//		과체중 : 24- 29.9
//		정상 : 10 - 23.9
//		저체중 : 10 미만
		
		if (bmi >= 35) {
			System.out.println("고도 비만입니다.");
		} else if (bmi >= 30 && bmi <= 34.9) {
			System.out.println("중도 비만입니다.");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("경도 비만입니다.");
		} else if (bmi >= 23 && bmi <= 24.9) {
			System.out.println("과체중입니다.");
		} else if (bmi >= 18.5 && bmi <= 22.9) {
			System.out.println("정상입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
		
		// 출력
//		System.out.printf("키가 %.2fcm의 표준체중은 %.2fkg이고 BMI는 %.2f입니다.", height, stdWeight, bmi);
		
		keyin.close();
	}
}

