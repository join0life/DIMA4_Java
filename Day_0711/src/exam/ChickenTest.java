package exam;

import inherit03.Animal;
import inherit03.Bird;
import inherit03.Cat;
import inherit03.Dog;

public class ChickenTest {

	public static void main(String[] args) {
		Chicken chicken;
		chicken = new FriedChicken();
		process(chicken);
		
		chicken = new SeasonedChicken();
		process(chicken);
		
	}
	public static void process(Chicken chicken) {
		// 부모의 추상메소드가 아닌 경우 다형성 처리가 어렵다!
		if (chicken instanceof FriedChicken)
			chicken.setType("후라이드 치킨");
		else if (chicken instanceof SeasonedChicken)
			chicken.setType("양념 치킨");
		
		chicken.output();
		
		// cry() 메소드는 추상메소드라서 다형성 처리가 된다!
		chicken.cook();
		System.out.println();
	}

}
