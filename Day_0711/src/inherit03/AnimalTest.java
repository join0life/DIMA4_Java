package inherit03;

public class AnimalTest {

	public static void main(String[] args) {
//		Animal animal = new Animal(); // 객체 생성 불가
		Dog dog = new Dog();
		dog.setType("포유류");
		dog.output();
		dog.cry(); // 멍멍
		
		System.out.println();
		Bird bird = new Bird();
		bird.setType("조류");
		bird.output();
		bird.cry();
	
		System.out.println();
		Cat cat = new Cat();
		cat.setType("조류");
		cat.output();
		cat.cry();
	}

}
