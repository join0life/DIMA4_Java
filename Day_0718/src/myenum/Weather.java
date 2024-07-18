/*
 * [문제]
 * - 영단어로 매칭 
 * - 각 날씨에 할 일을 메소드로! todo()
 * - 각 날씨에 놀 일을 메소드로! play()
 */
package myenum;

public enum Weather {
	맑음("Sunny"){
		public String todo() {
			return "빨래 널기";
		}
		public String play() {
			return "놀이공원 가기";
		}
	}, 안개("Foggy"),
	흐림("Cloudy"),
	비("Rain"){
		public String todo() {
			return "비오는 김에 나가서 설거지? 좀 하고.. 빨래도 좀 하고..";
		}
		public String play() {
			return "음악 들으면서 책 읽기";
		}
	}, 눈("Snow"){
		public String todo() {
			return "마당에 쌓인 눈 치우기";
		}
		public String play() {
			return "눈사람 만들기";
		}
	};
	
	public String eng;
	Weather(String eng) {
		this.eng = eng;
	}
	
	public String todo() {
		return "침대에 누워서 아이스크림 먹기";
	}
	
	public String play() {
		return "시야가 흐릿한 틈을 타..";
	}
}
