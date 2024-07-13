
public class MethodTest_06 {

	public static void main(String[] args) {
		
		// output(); // static에서는 non-static에 접근 불가
		MethodTest_06  mt = new MethodTest_06();
		mt.output();
	}
	
	// 멤버 메소드 (static이 없는 메소드)
	public void output() {
		System.out.println("output() 메소드입니다.");
	}

}
