package com.input.output;

import java.io.*;
import java.io.IOException;

public class FileIOActivity {

	public static void readingFile(File file) throws IOException {
		
		try {
			System.out.println(file);
			FileReader myReader = new FileReader(file);
			int i;
			while ((i=myReader.read()) != -1) {
				System.out.print((char)i);
			}

		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Check your file directory....");
		} 

	}

	public static void writingFile(File file) throws IOException {
		
		try {
			System.out.println(file.getName());
			FileWriter myWriter = new FileWriter(file,false);
			myWriter.write("Humpty Dumpty sat on a wall\r\n" + "Humpty Dumpty had a great fall\r\n"
					+ "All the king's horses and all the king's men\r\n" + "Couldn't put Humpty together again\r\n"
					+ "Humpty Dumpty sat on a wall\r\n" + "Humpty Dumpty had a great fall\r\n"
					+ "All the king's horses and all the king's men\r\n" + "Couldn't put Humpty together again\r\n"
					+ "Humpty Dumpty sat on a wall\r\n" + "Humpty Dumpty had a great fall\r\n"
					+ "All the king's horses and all the king's men\r\n" + "Couldn't put Humpty together again");
			myWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myFile = new File("C:\\Users\\Vikram Kumar Jha\\Desktop\\New.txt");
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
				writingFile(myFile);
			} else {
//				System.out.println("File already created");
//				System.out.println("File name : " + myFile.getName());
//				System.out.println("Absolute path : " + myFile.getAbsolutePath());
//				System.out.println("writable : " + myFile.canWrite());
//				System.out.println("Readable : " + myFile.canRead());
//				System.out.println("file size : " + myFile.length());
				readingFile(myFile);
				
			}
		} catch (IOException e) {
			System.out.println("An error occured");
//			e.printStackTrace();
		}
	}

}
