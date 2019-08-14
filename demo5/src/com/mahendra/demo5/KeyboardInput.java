package com.mahendra.demo5;

import java.io.IOException;

public class KeyboardInput {

	public static void main(String[] args) {

		byte[] buffer = new byte[100];
		System.out.println("Enter your name: ");
		try {
			int len = System.in.read(buffer);
			// Convert LEN number of bytes from 'buffer' into a string
			String name = new String(buffer, 0, len);
			// On linux/Unix : len = total bytes + 1
			// On Windows/DOS : len = total bytes + 2
			// As windows need 2 bytes for line break but unix / linux requires ONE byte
			// only
			System.out.println("Number of bytes read " + len);
			System.out.println("Name : " + name + " hello world");
			// Ideally you should trim string before using it
			// to remove extra line break
			// ex name = name.trim();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
