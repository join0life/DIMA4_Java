package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			byte[] buffer = new byte[1000];
			int count = 0;
			
			fis = new FileInputStream("hello.txt");
			fos = new FileOutputStream("hello_copy.txt");
			
			while(true) {
				count = fis.read(buffer);
				if (count == -1) break;
				
				if (count == buffer.length) {
					fos.write(buffer); // 파일로 출력
					for(int i = 0; i < count; ++i) {	// 화면
						System.out.print((char)buffer[i]);
					}
				}
				else if (count < buffer.length) {
					for(int i = 0; i<count; ++i) {
						fos.write((char)buffer[i]); // 마지막에 남은 글자를 한 개씩 저장
					}
				}
			}
			
			System.out.println("복사완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
