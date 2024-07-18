package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest_02 {

	public static void main(String[] args) {
		File file = new File("song.txt");
		FileInputStream fis = null;
		// 배열에 읽어들이는 방법
		try {
			fis = new FileInputStream(file);
			System.out.println("파일 오픈 성공");
	
			byte[] data = new byte[50]; // 192 - 50 50 50 42
			int count = 0; 
		
			while(true) {
				count = fis.read(data); // 몇 개를 한꺼번에 읽었는지 확인 (50)
				if (count == -1) break;
				
				for(int i = 0; i<count; ++i)
					System.out.print((char)data[i]);
				
				System.out.println("\n");
			}
			
			System.out.println("\n끝!! - 글자수 : " + count);
		} catch (IOException e) {  
			System.out.println(e.getMessage());
		} finally {
				try {
					if (fis != null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("끝!!!");
		
	}

}
