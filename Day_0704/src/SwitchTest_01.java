
public class SwitchTest_01 {

	public static void main(String[] args) {
		String family = "father";
		
		switch (family) {
		case "father" : case "FATHER" : case "Father" : System.out.println("아버지"); break;
		case "Mather" :
		case "mahter" : System.out.println("어머니"); break;
		case "Brother" : System.out.println("남자 형제"); break;
		case "Sister" : System.out.println("여자 형제"); break;
		default : System.out.println("누구???");
		}
		
		//----------------------
		int value = 1;
		String result = "";
		
		switch (value) {
		case 0 : result += "*";
		case 1 : result += "^";
		case 2 : result += "^";
		case 3 : result += "*";
		}
		System.out.println(result);
	}

}
