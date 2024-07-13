
public class ArrayTest_02 {

	public static void main(String[] args) {
		// 객체배열
		String[] name = {"홍길동", "전우치", "손오공", "저팔계", "콩쥐", "팥쥐"};
		int[] mat = {89, 75, 99, 65, 85, 75};
		int[] kor = {65, 85, 99, 100, 75, 65, 77};
		int[] total = new int[name.length];
		
		// 홍길동 89 65 154 
		// 손오공 xx xx xx
		// 전우치 xx xx xx
		for(int i = 0; i<name.length; ++i)
			total[i] = mat[i] + kor[i];

		for(int i = 0; i<name.length; ++i)
			System.out.printf("%-5s %3d %3d %4d%n", name[i], mat[i], kor[i], total[i]);
		
		// 향상된 for문
//		for(String temp : name)
//			System.out.printf("%s%n", temp);
	}

}
