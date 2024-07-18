package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {

	public static void main(String[] args) {
		// 파일로 저장하려는 객체는 Serial 상태로 변환되어 있어야 한다.
		FriendVO f = new FriendVO("손오공", "010-1234-5678", 25);
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("friend.dat"));
			
			oos.writeObject(f);
			
			System.out.println("저장완료!");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
