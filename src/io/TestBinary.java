package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("E:\\TAMASHA (1).jpg");

		FileOutputStream out = new FileOutputStream("C:\\Users\\Jai Mahakal\\Desktop\\Java IO\\cj.jpg");

		int ch = in.read();

		while (ch != -1) {

			out.write(ch);

			ch = in.read();

		}
		out.close();
		in.close();
	}
}