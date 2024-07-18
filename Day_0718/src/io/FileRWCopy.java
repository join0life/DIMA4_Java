package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWCopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			char[] buffer = new char[1000];
			int count = 0;
			
			fr = new FileReader("supernova.txt");
			fw = new FileWriter("supernova_copy.txt");
			
			while(true) {
				count = fr.read(buffer);
				
				if (count == -1) break;
				
				if (count == buffer.length) {
					fw.write(buffer); // 파일로 출력
					
					for(int i = 0; i < count; ++i) {	// 화면
						System.out.print((char)buffer[i]);
					}
				}
				else if (count < buffer.length) {
					for(int i = 0; i<count; ++i) {
						fw.write((char)buffer[i]); // 마지막에 남은 글자를 한 개씩 저장
					}
				}
			}
			
			System.out.println("복사완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
				if (fr != null) fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
