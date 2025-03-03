package io;

import java.io.FileWriter;

public class TestFileWriter {
	
public static void main(String[] args) throws Exception {
		
		FileWriter out = new FileWriter("C:\\Users\\Jai Mahakal\\Desktop\\Java IO\\Hello.txt");
		
		out.write("hello \n");
		
		out.write("how are you?");
		
		out.close();
	}
}