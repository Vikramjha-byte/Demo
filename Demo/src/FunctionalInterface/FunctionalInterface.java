package FunctionalInterface;

interface ICalculator{
	public void addition(int x,int y);
	public void subtraction(int x, int y);
}

public class FunctionalInterface {
	
	//////Anonymous Inner class without name

	public static void main(String[] args) {
		// Anonymous class
		ICalculator icalculator= new ICalculator() {

			@Override
			public void addition(int x, int y) {
				// TODO Auto-generated method stub
				int z=x+y;
				System.out.println(z);
			}

			@Override
			public void subtraction(int x, int y) {
				// TODO Auto-generated method stub
				int z=x-y;
				System.out.println(z);
			}
		};///Terminating the class here
		icalculator.addition(4, 5);
		icalculator.subtraction(5, 4);

	}

}
