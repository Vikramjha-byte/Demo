package demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);// sc: reference variable Scanner(System.in):Constructor
		System.out.println("Enter the integer data:");
		Integer data= sc.nextInt();
		System.out.println(data);
		System.out.println("Enter the string data:");
		String stringData=sc.next();
		System.out.println(stringData);
		sc.nextLine();// separate nextLine to clear the buffer
		System.out.println("Enter the string line data:");
		String stringNextLine=sc.nextLine();
		System.out.println(stringNextLine);
	}
}
