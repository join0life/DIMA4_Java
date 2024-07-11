package exam_30;

import java.util.Scanner;

public class PolygonTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Point[] polygon= new Point[50];
		
		int count = 0;
		String choice;
		
		while(true) {
			System.out.print("\n1. 원   2. 사각형   3. 전체 출력    0. 종료 ==> ");
			choice = scanner.next();
			
			switch(choice) {
			case "1" : {
				System.out.print("x => ");
				int x = scanner.nextInt();
				System.out.print("y => ");
				int y = scanner.nextInt();
				System.out.print("radius => ");
				double radius = scanner.nextInt();
				
				polygon[count++] = new Circle(x, y, radius);
				
				break;
			}
			case "2" : {
				System.out.print("x => ");
				int x = scanner.nextInt();
				System.out.print("y => ");
				int y = scanner.nextInt();
				System.out.print("width => ");
				int width = scanner.nextInt();
				System.out.print("height => ");
				int height = scanner.nextInt();				
				polygon[count++] = new Rectangle(x, y, width, height);
				
				break;
			}
			case "3" : {
				for(int i=0; i<count; ++i) {
					polygon[i].print();
				}
				break;
			}
			case "0" : {
				System.out.println("\n## 프로그램을 종료합니다.");
				System.exit(0);
			}
			default  :
				System.out.println("** 메뉴 선택을 다시 해주세요");
			}
		}

	}

}
