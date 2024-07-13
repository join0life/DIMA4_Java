package service;

import vo.Product;

public class CosmeticServiceImpl implements CosmeticService {
	Product[] list = new Product[50];
	int count = 0;
	
	/*
	 * 전달받은 product를 리스트에 저장
	 * @param product
	 * @return 등록 성공시 true, 아니면 false 반환
	 */
	public boolean insert(Product product) {
		if (count == list.length) { 
			return false;
		}
		list[count++] = product;
		return true;
	}
	
	/*
	 * 전달받은 productNo 값에 해당하는 product이 있는지 찾아서 반환
	 * @param productNo
	 * @return 찾으면 회원 정보, 못 찾으면 null을 반환
	 */
	
	public Product selectOne(String productNo) {
		for(int i = 0; i<count; ++i) {
			if(list[i].getProductNo().equals(productNo)) 
				return list[i];
		}
		return null;
	}
	
	/*
	 * 전달받은 상품정보(product)에 상품 번호 해당하는 상품을 검색해서
	 * 상품명, 가격, 타입, 색상을 수정
	 * @param product
	 * @return 수정이 완료되면 true, productNo가 없어서 수정을 못한 경우 false
	 */
	public boolean update(Product product) {		
		for(int i = 0; i < count; ++i) {
			if (list[i].getProductNo() == product.getProductNo()) {
				list[i].setName(product.getName());
				list[i].setPrice(product.getPrice());
				// 립스틱이면 타입, 색상 수정 
				//list[i].setType(product.getType());
				//list[i].setColor(product.getColor());
				// 파운데이션이면 텍스쳐 수정
				return true;
			}
		}
		return false;
	}
	/**
	 * 전달받은 productNo에 해당하는 상품 정보를 찾아서 배열 내에서 삭제
	 * @param productNo
	 * @return 삭제가 완료되면 true, productNo가 없어서 삭제를 못한 경우 false
	 */
	public boolean delete(String productNo) {
		for (int i = 0; i<count; ++i) {
			if (list[i].getProductNo().equals(productNo)) { // 탈퇴하려는 회원 정보를 찾음
				for (int j = i; j <count-1; ++j) { // 뒤의 데이터를 앞으로 옮김
					list[j] = list[j+1];
				}
				--count;
				return true;
			}
		}
		return false;
	}
	/**
	 * 모든 회원의 정보를 반환
	 * @return 
	 */
	public Product[] selectAll() {
		return list;
	}
	
	/*
	 * 총 회원 수를 반환
	 */
	public int getCount() {
		return count;
	}
}

