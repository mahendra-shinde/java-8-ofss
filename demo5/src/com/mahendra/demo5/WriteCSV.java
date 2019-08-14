package com.mahendra.demo5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class WriteCSV {

	public static void main(String[] args) {
		
		/*
		 * String path = WriteCSV.class.getResource("/books.csv").getPath();
		 * System.out.println("Path to File "+path);
		 * 
		 * File file = new File(path);
		 * System.out.println("Does file exists "+file.exists() );
		 */
		
		try {
			
			// "." refers to present working directory (Eclipse project directory)
			FileWriter writer = new FileWriter("books.csv"
												,true);
			PrintWriter out = new PrintWriter(writer);
			Book b = new Book(106,"Harry Potter Vol 3","J.K. Rollin");
			out.println(b.getBookId()+", "+b.getTitle()+", "+b.getAuthor());
			out.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
