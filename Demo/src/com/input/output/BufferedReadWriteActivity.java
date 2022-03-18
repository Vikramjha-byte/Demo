package com.input.output;

import java.io.*;

public class BufferedReadWriteActivity {
	
	public static void writeToBuffer() throws IOException {
		FileWriter myWriter= new FileWriter("C:\\Users\\Vikram Kumar Jha\\Desktop\\buffered.txt",false);
		BufferedWriter myBufferWriter= new BufferedWriter(myWriter);
		myBufferWriter.write("Johnny, Johnny.\r\n"
				+ "Yes papa?\r\n"
				+ "Eating sugar?\r\n"
				+ "No papa.\r\n"
				+ "Telling lies?\r\n"
				+ "No papa.\r\n"
				+ "Open your mouth.\r\n"
				+ "Ha-ha-ha!");
		myBufferWriter.close();
	}
	
	public static void readFromBuffer() throws IOException {
		FileReader myReader= new FileReader("C:\\Users\\Vikram Kumar Jha\\Desktop\\buffered.txt");
		BufferedReader myBufferReader= new BufferedReader(myReader);
		int i;
		while((i=myBufferReader.read())!=-1) {
			System.out.print((char)i);
		}
	}
	
	public static void main(String[] args) throws IOException {
		writeToBuffer();
		readFromBuffer();
	}

}
