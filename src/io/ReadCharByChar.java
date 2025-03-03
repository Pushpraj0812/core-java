package io;

import java.io.FileReader;

public class ReadCharByChar {
	
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("C:\\Users\\Jai Mahakal\\Desktop\\Java IO\\File.txt");
		
		int ch = f.read();
		
		while (ch != -1) {
			
			//System.out.println(ch); // Will print ASC value of each character in the file (Java IO).
			
			System.out.print((char)ch);  // Will print each character in the file (Java IO)
			
			ch = f.read();
		}
		
		f.close();
		
	}
}