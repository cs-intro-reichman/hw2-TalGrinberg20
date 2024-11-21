// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args [0]);
		int currentNum = 0;
		int firstNum = 1;
		String mode = args[1];
	for (int i = 0; i <seed; i++) {
		System.out.print(firstNum + " ");
			while (currentNum != 1) { 
			if (currentNum%2 == 0){
				currentNum = currentNum/2;
				}
			else {
				currentNum = currentNum*3 +1 ;
				}
			
		System.out.print(currentNum + " ");
			}
		}
	}
}

			

