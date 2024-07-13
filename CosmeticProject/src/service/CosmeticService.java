package service;

import vo.Product;

public interface CosmeticService {
	public boolean insert(Product product);
	public boolean update(Product product); // 상품명, 가격, 타입, 색깔 수정 가능
	public boolean delete(String productNo);
	public Product selectOne(String productNo);
	public Product[] selectAll();
	public int getCount();
}
