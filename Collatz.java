
// Demonstrates the Collatz conjecture in verbose mode.
public class Collatz {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]); 

        for (int i = 1; i <= seed; i++) {
            int currentNum = i; 
            int steps = 0; 

            System.out.print(i + " ");

            while (currentNum != 1) {
                if (currentNum % 2 == 0) {
                    currentNum = currentNum / 2; 
                } else {
                    currentNum = currentNum * 3 + 1; 
                }
                steps++;
                System.out.print(currentNum + " ");
            }

            System.out.println("(" + steps + ")"); 
        }

        System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
    }
}



// // Demonstrates the Collatz conjecture.
// public class Collatz {
// 	public static void main(String args[]) {
// 		int seed = Integer.parseInt(args [0]);
// 		int currentNum = 0;
// 		int firstNum = 1;
// 		String mode = args[1];
// 	for (int i = 0; i < seed; i++, firstNum++) {
// 		System.out.print(i+1 + " ");
// 			while (currentNum != 1) { 
// 			if (currentNum%2 == 0){
// 				currentNum = currentNum/2;
// 				}
// 			else {
// 				currentNum = currentNum*3 +1 ;
// 				}
			
// 		System.out.print(currentNum + " ");
// 			}
// 		}
// 	}
// }

			

