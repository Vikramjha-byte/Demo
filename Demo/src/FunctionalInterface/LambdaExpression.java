package FunctionalInterface;

interface InterfaceCalculator{
	public void addition(int x,int y);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		 InterfaceCalculator interfaceCalculator=(int x,int y) ->{int z= x+y;System.out.println(z);};
		 interfaceCalculator.addition(4, 5);
	}
	
	
	
}
