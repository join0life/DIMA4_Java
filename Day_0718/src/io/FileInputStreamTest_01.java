package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest_01 {

	public static void main(String[] args) {
		File file = new File("song.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			System.out.println("파일 오픈 성공");
			
			int data = 0;
			int count = 0; // 몇 번 read 했는지 체크하는 변수
			while(true) {
				data = fis.read(); // 반환데이터 : 읽은 데이터(한 글자씩)
				count++;
				
				if (data == -1) break;
				
				System.out.print((char)data); 
			}
			
			System.out.println("\n끝!! - 글자수 : " + count);
			
		} catch (IOException e) {  
			System.out.println(e.getMessage());
		}
		
		System.out.println("끝!!!");
		
	}

}
