package mathapi;

public class MathTest {

	public static void main(String[] args) {
		double data = 42.1954321;
		
		System.out.println("원본 : " + data);
		System.out.println("ceil() : " + Math.ceil(data)); // 올림
		System.out.println("round() : " + Math.round(data)); // 반올림
		System.out.println("floor() : " + Math.floor(data)); // 버림
		
		System.out.println("max() : " + Math.max(15, 20)); // 큰값
		System.out.println("min() : " + Math.min(15, 20)); // 작은값
		
		System.out.println("pow() : " + Math.pow(4, 5)); // 거듭제곱
		System.out.println("sqrt() : " + Math.sqrt(9)); // 루트
	
		System.out.println("PI : " + Math.PI); // 파이
		System.out.println("E : " + Math.E); 
	}
}
