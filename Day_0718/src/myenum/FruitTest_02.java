package myenum;

public class FruitTest_02 {
	public static void main(String[] args) {
		Fruit1 apple = Fruit1.사과; // enum
		String english = apple.getFruit();
		
		System.out.println(apple);
		// name() : Fruit1 데이터의 값을 가져오는 메소드
		System.out.println(apple.name() + " : " + english);
		
		// values() : Fruit1 내에 선언된 모든 데이터를 배열로 반환
		Fruit1[] fary = Fruit1.values();
		System.out.println(fary.length);
		
		System.out.println();
		
		for(Fruit1 f : fary)
			System.out.println(f);
		
		// --------------
		Fruit1 ftemp = Fruit1.바나나;
		
		switch (ftemp) {
		case 바나나 : System.out.println("바나나는 노랗습니다."); break;
		case 사과 : System.out.println("사과는 빨갛습니다."); break;
		case 딸기 : System.out.println("딸기는 달콤합니다."); break;
		default :
		}
		
		// -----valueOf(String) : 데이터와 매칭되는 Enum 타입을 반환
		Fruit1 ftmp = Fruit1.valueOf("딸기");
		System.out.println(ftmp);
		
		// --- 문자열로 반환 (name()==toString() - Enum에서 상속 받음)
		
		String ftmp1 = ftmp.name();
		System.out.println(ftmp1);
		
		String ftmp2 = ftmp.toString();
		System.out.println(ftmp2);
		
		System.out.println(ftmp1.equals(ftmp2));
		
		// --- ordinal() : index를 반환하는 메소드  
		Fruit1 ftmp3 = Fruit1.사과;
		
		int ord = ftmp3.ordinal();
		System.out.println(ord);
	}
}
