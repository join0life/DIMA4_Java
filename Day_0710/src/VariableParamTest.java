class Person {
	public void output(int... ary) { // ary 배열
		for (int i =0; i<ary.length; ++i) 
			System.out.print(ary[i] + " ");
		
		System.out.println();
		
		System.out.println("===End===");
	}
}


public class VariableParamTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.output(); // 전달 인자 없음
		p.output(1);
		p.output(1, 2);
		p.output(1, 2, 3);
		p.output(1, 2, 3, 4);
	}

}
