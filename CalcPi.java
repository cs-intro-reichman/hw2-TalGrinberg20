// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numDigits = Integer.parseInt(args[0]);
		double newPI = 1.0;
		for (int i = 3, c=1; c <= numDigits; i+=2,c++) {
			if (c%2 != 0){
			newPI -= 1.0/(i);
			}
			else {
			newPI += 1.0/(i);
			}
		}
		System.out.println("pi according to Java: " + Math.PI);		
		System.out.println("pi, approximated: " + newPI*4.0);		
	}
}
