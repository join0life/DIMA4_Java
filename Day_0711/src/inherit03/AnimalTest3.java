package inherit03;
// 다형성
// 상속
public class AnimalTest3 {

	public static void main(String[] args) {
		Animal animal;
		animal = new Dog();
		process(animal);
		System.out.println(animal instanceof Dog); // animal이 참조하는 게 Dog가 맞으면 true
//		System.out.println(animal instanceof Math); // 오류
		System.out.println(animal instanceof Bird); // false
		
		animal = new Bird();
		process(animal);
		
		animal = new Cat();
		process(animal);
		
	}
	
	public static void process(Animal animal) {
		// 부모의 추상메소드가 아닌 경우 다형성 처리가 어렵다!
		if (animal instanceof Cat)
			animal.setType("고양이");
		else if (animal instanceof Bird)
			animal.setType("참새");
		else if (animal instanceof Dog)
			animal.setType("강아지");
		
		animal.output();
		
		// cry() 메소드는 추상메소드라서 다형성 처리가 된다!
		animal.cry();
		System.out.println();
	}
}
