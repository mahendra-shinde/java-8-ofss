package com.mahendra.demo5;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		InputStream in = ReadCSV.class.getResourceAsStream("/books.csv");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		List<Book> books = new LinkedList<>();
		
		//Read all books and store them in linked list
		try {
			String line = br.readLine();
			while(line!=null) {
			books.add(extract(line));
			line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("List of books: ");
		for(Book b : books) {
			System.out.println(b.getTitle()+" "+b.getAuthor());
		}
		
	}
	
	public static Book extract(String line) {
		String[] fields = line.split(",");
		int bookId = Integer.parseInt(fields[0]);
		String title = fields[1].trim();
		String author = fields[2].trim();
		return new Book(bookId,title,author);	
	}

}
