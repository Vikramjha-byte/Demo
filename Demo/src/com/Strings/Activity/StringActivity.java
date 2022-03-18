package com.Strings.Activity;

public class StringActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString= new String("Activity");
		System.out.println(myString.charAt(3));
		System.out.println(myString.codePointAt(6));
		System.out.println(myString.codePointBefore(5));
		System.out.println(myString.codePointCount(0, 7));
		System.out.println(myString.compareTo("activity"));
		System.out.println(myString.compareToIgnoreCase("activity"));
		System.out.println(myString.concat(" with String"));
		System.out.println(myString.contains("Act"));
		System.out.println(myString.length());
		System.out.println(myString.replace('c', 'n'));
		myString.startsWith("A");
		StringBuilder stringBuilder= new StringBuilder("My");
		System.out.println(stringBuilder.append(" activity on stringbuilder"));
		System.out.println(stringBuilder.capacity());
		System.out.println(stringBuilder.delete(0, 6));
		System.out.println(stringBuilder.reverse());
		
		String newString= "activity on stringbuilder";
		String[] stringArray= new String[newString.length()];
		stringArray= newString.split(" ");
		for(String x : stringArray) {
			System.out.println(x);
		}
		
		
	}

}
