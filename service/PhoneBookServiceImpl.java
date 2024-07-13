package service;

import vo.PhoneBook;

public class PhoneBookServiceImpl implements PhoneBookService{
	PhoneBook[] list = new PhoneBook[5];
	int count = 0;
	
	/*
	 * 전달받은 연락처를 리스트에 저장
	 * @param book
	 * @return 등록 성공시 true, 아니면 false 반환
	 */
	@Override
	public boolean insert(PhoneBook book) {
		if (count == list.length) { // 받을 수 있는 연락처 수를 초과
			return false;
		}
		list[count++] = book;
		return true;
	}

	/*
	 * 전달받은 phoneNumber 값에 해당하는 연락처가 있는지 찾아서 반환
	 * @param phoneNumber
	 * @return 찾으면 회원 정보, 못 찾으면 null을 반환
	 */
	@Override
	public PhoneBook selectOne(String phoneNumber) {
		for(int i = 0; i<count; ++i) {
			if(list[i].getPhoneNumber().equals(phoneNumber))
				return list[i];
		}
		return null;
	}
	
	/*
	 * 전달받은 연락처(book)에서 phoneNumber에 해당하는 book을 검색해서
	 * age, relation을 수정
	 * @param book
	 * @return 수정이 완료되면 true, phoneNumber가 없어서 수정을 못한 경우 false
	 */
	@Override
	public boolean update(PhoneBook book) {
		for(int i = 0; i < count; ++i) {
			if (list[i].getPhoneNumber().equals(book.getPhoneNumber())) {
				list[i].setAge(book.getAge());
				list[i].setRelation(book.getRelation());
				return true;
			}
		}
		return false;
	}

	/**
	 * 전달받은 phoneNumber에 해당하는 연락처의 정보를 찾아서 배열 내에서 삭제
	 * @param phoneNumber
	 * @return 삭제가 완료되면 true, phoneNumer가 없어서 삭제를 못한 경우 false
	 */
	@Override
	public boolean delete(String phoneNumber) {
		for (int i = 0; i<count; ++i) {
			if (list[i].getPhoneNumber().equals(phoneNumber)) { // 삭제하려는 번호를 찾음
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
	 * 모든 연락처 정보를 반환
	 * @return 
	 */
	@Override
	public PhoneBook[] selectAll() {
		return list;
	}

	/*
	 * 총 연락처 수를 반환
	 */
	@Override
	public int getCount() {
		return count;
	}

}
