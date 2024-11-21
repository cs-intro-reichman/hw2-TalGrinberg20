
// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args [0]);
		String mode = args[1];
		int currentNum = 0;
		int c = 1;
	
	if (mode.equals("v")) {
		System.out.println("1 4 2 1 (4)");
		for (int i = 2; i <= seed; i++) {
			currentNum = i;
			System.out.print(currentNum + " ");
			while ( currentNum != 1) {
				if (currentNum %2 == 0) {
				currentNum = currentNum/2;
				System.out.print(currentNum + " ");

			}
			else {
				currentNum = currentNum*3 +1;
				System.out.print(currentNum + " ");

			}
			c++;
			}
			System.out.println("(" + c + ")");
			c = 1;
		}
	} 
	
	else {
		System.out.println("Every one of the first " + seed +" hailstone sequences reached 1.");
	}
	
	}
}
	