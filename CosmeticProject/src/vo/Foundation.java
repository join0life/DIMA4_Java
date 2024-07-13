package vo;

public class Foundation extends Product {
	private String texture;

	public Foundation() {
		super();
	}

	public Foundation(String texture) {
		super();
		this.texture = texture;
	}

	public Foundation(String texture, String productNo, String name, int price) {
		super(productNo, name, price);
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	@Override
	public void output() {
		switch(texture) {
		case "1" : texture = "크림"; break;
		case "2" : texture = "스틱"; break;
		}

		System.out.printf("상품 번호= %s, 상품명= %s, 가격= %d, 파운데이션 제형= %s%n", super.getProductNo(), super.getName(), super.getPrice(), texture);
	}
	
	
}
