package io;

import java.io.FileReader;

public class TryBlockIO {
	
	public static void main(String[] args) throws Exception {

		try (FileReader f = new FileReader("C:\\Users\\Jai Mahakal\\Desktop\\Java IO\\File.txt")) {

			int ch = f.read();

			while (ch != -1) {

				System.out.print((char) ch);

				ch = f.read();

			}
			
			f.close();
		}
	}
}