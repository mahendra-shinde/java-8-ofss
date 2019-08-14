package com.mahendra.demo5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args)  {
		
		Book b = new Book(101,"The Brief history of time","Stephen Hawkins");
		
		ObjectOutputStream dout;
		try {
			// ObjectOutputStream is responsible to Serialize an object 
			// And sent it to destination (fileoutputstream)
			dout = new ObjectOutputStream(new FileOutputStream("books-data"));
			dout.writeObject(b);
			dout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
