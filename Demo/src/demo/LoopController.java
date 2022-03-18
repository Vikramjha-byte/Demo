package demo;

public class LoopController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////////////////while loop///////////////////////
		int count=0;
		while(count<5) {
			System.out.println("hello "+count);
			count++;
		}
		System.out.println("Next Statement");
		
		/////////////////////////////do while//////////////////
		count=0;
		do {
			System.out.println("hello "+ count);
			count++;
		}while(count<5);
			System.out.println("Next statement after do while");
		//////////////////for Loop/////////////////////
			for(int i=0;i<5;i++) {
				System.out.println("Hello "+i);
			}
			System.out.println("Next statement after For loop");
	}

}
