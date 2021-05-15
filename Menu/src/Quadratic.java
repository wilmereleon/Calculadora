//Imported libraries
import java.util.Scanner;

public class Quadratic {

	public static void main (String[] args) {
		Scanner mk = new Scanner (System.in); // «mk» is short for menu keyboard.
		double numberEnteredA, numberEnteredB; // These variables are used for simple operations: Addition, Subtraction, Multiplication, Division, Root and Pow.
		int option, numA, numB, numC, numberEnteredAL, numberEnteredBL; // These variables are used for operations: Exit, Quadratic and Logarithm.
		while(true) {
			showMenuResult (); // Call the method shown in the menu and its options.
			option = mk.nextInt();
			if(option == 0) // With this condition, by pressing zero, the menu execution is restarted.
				break;
			switch(option){
			case 1: // Quadratic
				System.out.println("Write a: ");
				numA = mk.nextInt();
				System.out.println("Write b: ");
				numB = mk.nextInt();
				System.out.println("Write c: ");
				numC = mk.nextInt();

				int numD = getDiscriminant(numA, numB, numC); // It invokes the special method to evaluate the negative or positive result of the discriminant: Root (4ab * c^2)
				if (numD < 0) {
					System.out.println ("No real solution."); // Print this message when the discriminant the negative.
				}
				else {
				double x1 = (-numB + Math.sqrt (numD)) / (2 * numA); // This section operates the roots, either one or two solutions of the value of x.
				double x2 = (-numB - Math.sqrt (numD)) / (2 * numA);
				System.out.println ("Root 1: " + x1);
				System.out.println ("Root 2: " + x2);
				}
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			default:
				System.err.println ("Error");
				break;
			}
		}
		mk.close();
	}
	
	public static int getDiscriminant (int numA, int numB, int numC) { // Discriminant Function
		int answer = 0;
		answer = numB * numB - 4 * numA * numC;
		return answer;
	}
	
	
	private static double getLog (double numberA, int numberB) { // Logarithm Function
	      return (Math.log10 (numberA) / Math.log10 (numberB));
	}

	private static void showMenuResult () { //Menu
		System.out.println ("(0) Exit");
		System.out.println ("(1) Quadratic");
	}
	
}

