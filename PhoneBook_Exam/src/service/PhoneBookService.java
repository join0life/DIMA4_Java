package service;

import vo.PhoneBook;

public interface PhoneBookService {
	public boolean insert(PhoneBook book);
	public PhoneBook selectOne(String phoneNumber);
	public boolean update(PhoneBook book); // 나이, 관계만 수정하기로!
	public boolean delete(String phoneNumber);
	public PhoneBook[] selectAll();
	public int getCount();
}
