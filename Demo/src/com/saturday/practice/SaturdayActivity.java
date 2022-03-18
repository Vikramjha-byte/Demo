package com.saturday.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

interface ICalculator{
	public int operate(int x, int y);
}

/*
 * class AddDigit implements ICalculator{
 * 
 * @Override public void add() { // TODO Auto-generated method stub int
 * number=45+20; System.out.println(number); }
 * 
 * }
 */


public class SaturdayActivity {
	/*
	 * static int num1=0; static int num2=0; static int value=0; static String
	 * op=null;
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrList= new ArrayList<>();
		arrList.add(12);
		arrList.add(34);
		arrList.add(54);
		
		
		
		/*
		 * 
		 * Collections.sort(arrList); for(Integer arr : arrList) {
		 * System.out.println(arr); }
		 */
		
		
		/*
		 * Using Advance Loop................
		 * for(int values:arrList) { System.out.println(values); }
		 */
		
		/*
		 * Using Iterator...........
		 * Iterator iterator= arrList.iterator(); while(iterator.hasNext()) {
		 * System.out.print("["+iterator.next()+"] "); }
		 */
		
		/*
		 * Traversing the list to produce the output Working with Interface
		 */
		 
		/*
		 * AddDigit obj=new AddDigit(); obj.add();
		 */

		/*
		 * Implementing the interface anonymously----Anonymous innerclass(without any name)
		 * 
		 * ICalculator iCalculator= new ICalculator() {
		 * 
		 * @Override public void add() {int
		 * number=23+65; System.out.println(number); } }; iCalculator.add();
		 */
		/*
		 * Implementing the interface anonymously using lambda expression: Reducing the lines of code
		 * 
		 * ICalculator iCalculator= () -> {int number=24+65; System.out.println(number);
		 * }; iCalculator.add();
		 */
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter the number");
		 * num1=sc.nextInt(); num2=sc.nextInt();
		 * System.out.println("Enter the operation +,-,*,/,% : "); op=sc.next();
		 * switch(op) { case "+": result(num1,num2,(x,y)->x+y); break; case "-":
		 * result(num1,num2,(x,y)->x-y); break; case "*": result(num1,num2,(x,y)->x*y);
		 * break; case "/": result(num1,num2,(x,y)->x/y); break; case "%":
		 * result(num1,num2,(x,y)->x%y); break; default:
		 * System.out.println("Enter the valid operation");
		 * 
		 * }
		 */
	}
	/*
	 * public static void result(int x,int y,ICalculator iCalculator) { int
	 * res=iCalculator.operate(x, y);
	 * System.out.println("The result of the operation is : "+res); }
	 */

}
