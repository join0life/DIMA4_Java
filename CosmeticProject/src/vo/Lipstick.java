package vo;

public class Lipstick extends Product{
	private String type;
	private String color;
	public Lipstick() {
		super();
	}
	public Lipstick(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	public Lipstick(String type, String color, String productNo, String name, int price) {
		super(productNo, name, price);
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void output() { 
		switch(type) {
		case "1" : type = "립밤"; break;
		case "2" : type = "립글로스"; break;
		case "3" : type = "틴트"; break;
		}
		
		switch(color) {
		case "1" : color = "빨강"; break;
		case "2" : color = "분홍"; break;
		case "3" : color = "오렌지"; break;
		}
		
		System.out.printf("상품 번호= %s, 상품명= %s, 가격= %d, 립스틱 타입= %s, 색상= %s%n", super.getProductNo(), super.getName(), super.getPrice(), type, color);
	}


}
