//Imported libraries
import java.util.Scanner;

public class Menu {

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
			case 1: // Addition
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (numberEnteredA+" + "+numberEnteredB+" = "+getAdd (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 2: // Subtraction
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (numberEnteredA+" - "+numberEnteredB+" = "+getSubtraction (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 3: // Multiplication
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (numberEnteredA+" * "+numberEnteredB+" = "+getMultiplication (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 4: // Division
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (numberEnteredA+" / "+numberEnteredB+" = "+getDivision (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 5: // Quadratic
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
			case 6: // Root
				System.out.println("Type the radicand: "); // In this line you enter the number to which you want to take the root.
				numberEnteredA = mk.nextDouble();
				System.out.println("Type the index: "); //In this line the value of the root index is entered.
				numberEnteredB = mk.nextDouble();
				System.out.println ("The Root of "+numberEnteredA+" is "+getRoot (numberEnteredA, numberEnteredB)); 
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 7: //Pow
				System.out.println("Type the base: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type the exponent: ");
				numberEnteredB = mk.nextDouble();
				System.out.println ("The Pow of "+numberEnteredA+" is with exponent "+numberEnteredB+" is "+getPow (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 8: // Logarithm (The function that invokes this case allows you to enter any logarithmic base.)
				System.out.println("Type the number: ");
				numberEnteredAL = (int) mk.nextDouble();
				System.out.println("Type the base: ");
				numberEnteredBL = (int) mk.nextDouble();
				System.out.println ("The Logarithm of "+numberEnteredAL+" with base "+numberEnteredBL+" is "+getLog (numberEnteredAL, numberEnteredBL));
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
	
	public static double getAdd (double numberA, double numberB) { // Addition Function
		return numberA + numberB;
	}
	
	public static double getSubtraction (double numberA, double numberB) { // Subtraction Function
		return numberA - numberB;
	}
	
	public static double getMultiplication (double numberA, double numberB) { // Multiplication Function
		return numberA * numberB;
	}
	
	public static double getDivision (double numberA, double numberB) { // Division Function
		return numberA / numberB;
	}
	
	public static int getDiscriminant (int numA, int numB, int numC) { // Discriminant Function
		int answer = 0;
		answer = numB * numB - 4 * numA * numC;
		return answer;
	}
	
	public static double getRoot (double numberA, double numberB) { // Root Function
		return Math.pow (numberA, 1 / numberB);
	}
	
	public static double getPow (double numberA, double numberB) { // Pow Function
		return Math.pow (numberA, numberB);
	}
	
	private static double getLog (double numberA, int numberB) { // Logarithm Function
	      return (Math.log10 (numberA) / Math.log10 (numberB));
	}

	private static void showMenuResult () { //Menu
		System.out.println ("(0) Exit");
		System.out.println ("(1) Addition");
		System.out.println ("(2) Subtraction");
		System.out.println ("(3) Multiplication");
		System.out.println ("(4) Division");
		System.out.println ("(5) Quadratic");
		System.out.println ("(6) Root");
		System.out.println ("(7) Pow");
		System.out.println ("(8) Logarithm");
	}
	
}

