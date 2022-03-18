package demo;

public class Student {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		int i=10;
		Integer value=i;
		int data= value;
		
		Double num= 100.5;
		String name="AZaz09";
		System.out.println(name);
		System.out.println("Unicode value of 'A': "+name.codePointAt(0));
		System.out.println("Unicode value of 'Z': "+name.codePointAt(1));
		System.out.println("Unicode value of 'a': "+name.codePointAt(2));
		System.out.println("Unicode value of 'z': "+name.codePointAt(3));
		System.out.println("Unicode value of '0': "+name.codePointAt(4));
		System.out.println("Unicode value of '9': "+name.codePointAt(5));// ASCII value contains only 256 value while Unicode contains all 65535 values.
		// why string is immutable : whenever we are going to assign a string to memory, it will becomes constant and cannot be alterable.
		
		String name2="Capgemini";// Immutable String.
		name2= name2 +" India"; // it will take new memory location in heap and is taking reference from variable in stack area.
		System.out.println(name2);
		System.out.println(name2.charAt(1));//Returns the char value at the specified index
		System.out.println(name2.length());
		System.out.println("A".compareTo("a"));//return 0 if same,-ve value if A<a otherwise +ve.
		System.out.println("Vikram".compareTo("Vikrant"));
		System.out.println("Vikran".compareToIgnoreCase("Vikram")); //Ignoring the case of the string
		System.out.println(name2.toUpperCase());
		System.out.println(name2.concat(" welcomes you all"));// + and .concat do the same operation
		System.out.println(name2.contains("India"));//Returns true if and only if this string contains the specified sequence of char values.
		System.out.println("vikram".hashCode());// it will return the hash value of the respective string
		System.out.println("vikram".indexOf('a'));// it will return the first occurrence index in string
		System.out.println("Vikram Kumar Jha".indexOf('a', 5)); // it return return the next occurrence of character after the specified index.
		System.out.println(name2.isEmpty());//Returns true if, and only if, length() is 0.
		
//		System.out.println("vikram".isBlank() );//Returns true if the string is empty or contains only white space codepoints,otherwise false.
		
		int lastPosition = name2.lastIndexOf('a');
		System.out.println(lastPosition);
		name="Hello World";
		name2="World";
		System.out.println(name.indexOf(name2));//Returns the index within this string of the first occurrence of thespecified substring. 

		System.out.println(name.replace('l', 'z'));//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar. 

		System.out.println(name.replace("World", "India"));//Replaces each substring of this string that matches the literal targetsequence with the specified literal replacement sequence. Thereplacement proceeds from the beginning of the string to the end, for example, replacing "aa" with "b" in the string "aaa" will result in"ba" rather than "ab".
		
		/*    Split strings  : Splits this string around matches of the given regular expression. 
  */

		String [] strings= name.split(" ");
		
		for(String str :strings) {
			System.out.println(str.trim());
		}
		
		String email="vikram@demo.com";
		String[] splitNames= email.split("@");
		String empName=splitNames[0];
		String domainName=splitNames[1];
		System.out.println("Name of Employee:" + empName);
		
		String[] companyName=domainName.split("\\.");
		System.out.println("Name of company:"+ companyName[0]);
		
		//////////Substrings
		
		name="Hello Java World";
		System.out.println(name.substring(6));
		System.out.println(name.substring(6, 10));
		Long longNum=123456789l;
		String phoneNumber= String.valueOf(longNum);
		System.out.println(phoneNumber.contains("789"));
		
		
		Integer dataOne=1_234_567;
		Float forData;
		Integer sample=123456789;
		Integer digit=sample%10;
		int intData=(int)7.5F;
		sample=sample/10;
		
		System.out.println(sample);
		System.out.println(digit);
		///////////////////////////INCREMENT & DECREMENT/////////////////////
		sample=10;
		System.out.println(++sample);  //Pre Increment
		System.out.println(--sample);//Pre Decrement
		System.out.println(sample++);//Post Increment
		System.out.println(sample--);//Post Decrement
		
		///////short hand operator//////
		
		System.out.println(sample+=10); //sample=sample+10;
		System.out.println(sample-=10);
		System.out.println(sample*=10);
		System.out.println(sample/=10);
		///////Operator Precedence////////////
		System.out.println(10+5*20);
		///////////bitwise operator////////////////////
		byte aByte= (byte)0b1111;
		byte bByte=(byte)0b0001;
		
		byte ansByte= (byte)((byte)aByte &(byte)bByte);
		byte exorByte= (byte)((byte)aByte ^(byte)bByte);
		System.out.println(ansByte);
		System.out.println(exorByte);
		
		/////////////////////////Shift Operator/////////////////
		
		sample=10;
		System.out.println(sample>>1);// 1010 >>1 =0101 divide by2
		System.out.println(sample<<1);//1010<< 1=0001 0100 multiply by 2
		
		////////Relational Operator///////////////
		int a=10;
		int b=20;
		System.out.println(a!=b);
		
		////////////ternary operator/////////////
		
		int value1=(a<b)?a:b;
		int value2=(a>b)?a:b;
		
		System.out.println("value1: "+value1);
		System.out.println("value2:"+ value2);
		
		/////////////////////Logical Operator///////////////
		
		int time=-50;
		if(time>=0 && time<5) {
			System.out.println("you are between 0 and 5");
		} else if(time==5) {
			System.out.println("you are 5");
		}else if(time<0){
			System.out.println("Not a valid age");
		}else {
			System.out.println("you are exceeding 5");
		}
		
		////////////////////
		
	}

}
