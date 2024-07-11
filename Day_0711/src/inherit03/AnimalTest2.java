package inherit03;
// 다형성
// 상속
public class AnimalTest2 {

	public static void main(String[] args) {
		Animal animal;
		animal = new Dog();
		animal.setType("개의 종류");
		animal.output();
		animal.cry(); // 부모의 메소드가 추상이면 자식의 메소드를 찾아가는 것
		
		animal = new Bird();
		animal.setType("새의 종류");
		animal.output();
		animal.cry();
		
		animal = new Cat();
		animal.setType("고양이의 종류");
		animal.output();
		animal.cry();
	}
}
