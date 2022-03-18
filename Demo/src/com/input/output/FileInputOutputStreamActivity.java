package com.input.output;

import java.io.*;
import java.io.IOException;

public class FileInputOutputStreamActivity {
	
	
	public static void copyingThroughInputStream() throws IOException {
		FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Vikram Kumar Jha\\Desktop\\buffered.txt");
		FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\Vikram Kumar Jha\\Desktop\\bufferedoutput.txt");
		int i;
		while((i=fileInputStream.read())!=-1) {
			fileOutputStream.write(i);
		}
		System.out.println("Write completed.....");
		System.out.println(fileInputStream.available());
		
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copyingThroughInputStream();
	}

}
