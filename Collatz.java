// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]); // Number of sequences to generate
        String mode = args[1]; // Mode: "v" for verbose, "c" for concise
        boolean allReachOne = true; // Flag to check if all sequences reach 1

        for (int i = 1; i <= seed; i++) {
            int currentNum = i; // Start each sequence with the current seed
            int steps = 0; // Count the steps to reach 1

            if (mode.equals("v")) { // Verbose mode
                System.out.print(i + " "); // Print the seed at the start
            }

            // Compute the hailstone sequence
            while (currentNum != 1) {
                if (currentNum % 2 == 0) {
                    currentNum = currentNum / 2; // Even case
                } else {
                    currentNum = currentNum * 3 + 1; // Odd case
                }
                steps++;
                if (mode.equals("v")) { // Print each step in verbose mode
                    System.out.print(currentNum + " ");
                }
            }

            if (mode.equals("v")) { // End of verbose mode output for the current sequence
                System.out.println("(" + steps + ")");
            }

            // If a sequence doesn't reach 1 (theoretically impossible), set flag
            if (currentNum != 1) {
                allReachOne = false;
            }
        }

        // Summary line
        if (mode.equals("c")) { // Concise mode
            if (allReachOne) {
                System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
            } else {
                System.out.println("Not all hailstone sequences reached 1.");
            }
        }
    }
}

// // Demonstrates the Collatz conjecture in verbose mode.
// public class Collatz {
//     public static void main(String[] args) {
//         int seed = Integer.parseInt(args[0]); 

//         for (int i = 1; i <= seed; i++) {
//             int currentNum = i; 
//             int steps = 0; 

//             System.out.print(i + " ");

//             while (currentNum != 1) {
//                 if (currentNum % 2 == 0) {
//                     currentNum = currentNum / 2; 
//                 } else {
//                     currentNum = currentNum * 3 + 1; 
//                 }
//                 steps++;
//                 System.out.print(currentNum + " ");
//             }

//             System.out.println("(" + steps + ")"); 
//         }

//         System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
//     }
// }



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

			

