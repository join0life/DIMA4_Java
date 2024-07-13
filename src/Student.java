/*
 * 출력하기 위해서는 무조건 main method가 필요함
 * VO(Value Object): 관련있는 값을 저장하기 위한 용도로 만들어진 클래스
 * 접근 지정자 (access) : private, public, (default), protected
 * 속성은 private으로 지정한다.
 * 속성에 값을 대입하기 위해 접근하는 메소드 : setter
 * 속성에 값을 꺼내기 위해 접근하는 메소드 : getter
 */
// 캡슐화 ==> 정보 은닉(private)
public class Student {
   private String name; // 멤버 변수 (Instance 변수)
   private int kor;
   private int eng;
   private int mat;
   private double avg;
   
   // Setter 생성하기
   public void setName(String name) { // name : 지역변수
	   this.name = name; 
   }
   
   public void setKor(int k) {
	   this.kor = k;
   }
   
   public void setEng(int e) {
	   this.eng = e;
   }
   
   public void setMat(int m) {
	   this.mat = m;
   }
   
   public void setAvg(double a) {
	   this.avg = a;
   }
   
   // Getter
   public String getName() {
	   return this.name;
   }
   
   public int getKor() {
	   return this.kor;
   }
   
   public int getEng() {
	   return this.eng;
   }
   
   public int getMat() {
	   return this.mat;
   }
   
   public double getAvg() {
	   return this.avg;
   }
   
   // 일반 메소드
   public void output() {
	   System.out.printf("%3s %3d %3d %3d %.2f%n", name, kor, eng, mat, avg); // this.name, this kor...
   }
}

