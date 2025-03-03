package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineByLIne {
	
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\Jai Mahakal\\Desktop\\Java IO\\File.txt");

		BufferedReader f = new BufferedReader(file);

		String line = f.readLine();

		while (line != null) {

			System.out.println(line);

			line = f.readLine();

		}
		f.close();
		file.close();
	}
}