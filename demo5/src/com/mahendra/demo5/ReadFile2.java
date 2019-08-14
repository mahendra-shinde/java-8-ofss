package com.mahendra.demo5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile2 {

	public static void main(String[] args) {
		try {
			// Using Absolute path (file must be at location c:\data
			FileInputStream fin = new FileInputStream("c:\\data\\file.txt");
//			int size = fin.available();
//			byte[] content = new byte[size];
//			int len = fin.read(content);

			byte[] buffer = new byte[100];
			int len = fin.read(buffer); // Read first 100 bytes from file
			while (len > 0) {
				System.out.println(new String(buffer, 0, len));
				len = fin.read(buffer); // Read next 100 bytes
			}
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
