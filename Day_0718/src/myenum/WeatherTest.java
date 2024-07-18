package myenum;

public class WeatherTest {

	public static void main(String[] args) {
		Weather[] weather = Weather.values();

		for(Weather w : weather) {
			System.out.println("날씨 ☀️ : " + w);
			System.out.println("해야할 일 ⭐ : " + w.todo());
			System.out.println("이거 하고 놀기 ✌️ : " + w.play());
		}

	}
}
