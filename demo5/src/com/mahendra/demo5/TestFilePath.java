package com.mahendra.demo5;

import java.io.File;

public class TestFilePath {

	public static void main(String[] args) {

			File file = new File("file.txt");
			System.out.println("Path :"+file.getAbsolutePath());
	}
}
