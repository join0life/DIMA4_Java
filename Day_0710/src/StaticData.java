
public class StaticData {
	// 인스턴스 변수 - 자신의 클래스가 생성되면 탄생 (Heap 영역)
	// 그 객체를 포인팅하는 참조 변수가 없어지면 GC에 의해서 소멸
	String title = "History of island"; 
	int page = 0;
	
	// 클래스 변수 (static이 붙은) 프로그램이 구동되면 생성
	// 프로그램이 종료되면 소멸 (static 영역)
	static int CODE = 12; 
	
	public void setPage(int page) {
		this.page  = page;
	}
	
	public void process(int page) {
		int maxPage = 500;	// 지역 변수 (Stack) - 메소드를 호출하면 탄생
		
		{
			int inner = 150;
			maxPage += 10;
			System.out.println("inner = "+ inner);
			System.out.println("Max Page ="+ maxPage);
		} // 지역 종료
		
//		inner += 1;
	} // 지역이 닫히면 소멸
	
	public void calc() {
		this.title = "2024년 7월 어느 날";
		this.page = 1500;
		CODE = 7; // 하나의 변수를 여러 객체에서 공유하면서 사용할 때!
		StaticData.CODE = 7;
	}
}
