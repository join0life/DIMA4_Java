package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam_34 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		byte[] buffer = new byte[100];
		int count = 0;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("karina.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream("karina_copy.jpg"));
			
			while(true) {
				count = bis.read(buffer);
				if (count == -1) break;
				
				if (count < buffer.length) {
					for(int i=0; i< count; ++i)
						bos.write(buffer[i]);
					break;
				}
				bos.write(buffer);
			}
			System.out.println("복사 완료!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) bis.close();
				if (bos != null) bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
