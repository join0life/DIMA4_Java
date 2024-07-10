package service;

import vo.RentCarVO;

public class RentCarService {
	RentCarVO[] list = new RentCarVO[100];
	int count = 0;

	/**
	 * 전달 받은 회원명을 리스트에 저장
	 * @param rendCar
	 * @return 등록 성공시 true, 아니면 false 반환
	 */

	public boolean insert(RentCarVO rentCar) {
		if (count == list.length) {
			return false;
		}
		list[count++] = rentCar;
		return true;
	}

	/**
	 * 전달 받은 예약자명에 해당하는 예약자가 있는지 찾아서 반환
	 * @param name
	 * @return 찾으면 회원 정보, 못 찾으면 null을 반환
	 */

	public RentCarVO selectOne(int car) {
		for (int i = 0; i <count; ++i) {
			if(list[i].getCar() == car)
				return list[i];
		}
		return null;
	}

	/**
	 * 모든 예약자 정보를 반환
	 * @return
	 */

	public RentCarVO[] selectAll() {
		return list;
	}

	/*
	 * 총 예약자 수를 반환
	 */
	public int getCount() {
		return count;
	}
}
