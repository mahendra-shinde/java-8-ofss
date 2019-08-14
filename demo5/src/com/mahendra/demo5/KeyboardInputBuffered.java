package com.mahendra.demo5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInputBuffered {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		System.out.println("Enter your name: ");
		
		String name = reader.readLine();
		
		System.out.println("Hello "+name);
		
	}

}
