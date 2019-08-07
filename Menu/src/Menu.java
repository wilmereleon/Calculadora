//Imported libraries
import java.util.Scanner;

public class Menu {

	public static void main (String[] args) {
		Scanner mk = new Scanner (System.in); // «mk» is short for menu keyboard
		double numberEnteredA, numberEnteredB;
		int option, numA, numB, numC;
		while(true) {
			showMenuResult ();
			option = mk.nextInt();
			if(option == 0)
				break;
			switch(option){
			case 1:
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getAdd (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 2:
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getSubtraction (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 3:
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getMultiplication (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 4:
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getDivision (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 5:
				System.out.println("Write a: ");
				numA = mk.nextInt();
				System.out.println("Write b: ");
				numB = mk.nextInt();
				System.out.println("Write c: ");
				numC = mk.nextInt();

				int d = getDiscriminant(numA, numB, numC);
				if (d < 0) {
					System.out.println ("No real solution.");
				}
				else {
				double x1 = (-numB + Math.sqrt (d)) / (2 * numA);
				double x2 = (-numB - Math.sqrt (d)) / (2 * numA);
				System.out.println ("Root 1: " + x1);
				System.out.println ("Root 2: " + x2);
				}
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 6:
				System.out.println("Type the radicand: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type the index: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getRoot (numberEnteredA, numberEnteredB));
				System.out.println ("«End Program»");
				System.out.println ("");
				break;
			case 7:
				System.out.println("Type the radicand: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type the index: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getPow (numberEnteredA, numberEnteredB));
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
	
	public static double getAdd (double numberA, double numberB) {
		return numberA + numberB;
	}
	
	public static double getSubtraction (double numberA, double numberB) {
		return numberA - numberB;
	}
	
	public static double getMultiplication (double numberA, double numberB) {
		return numberA * numberB;
	}
	
	public static double getDivision (double numberA, double numberB) {
		return numberA / numberB;
	}
	
	public static int getDiscriminant (int numA, int numB, int numC) {
		int answer = 0;
		answer = numB * numB - 4 * numA * numC;
		return answer;
	}
	
	public static double getRoot (double numberA, double numberB) {
		return Math.pow (numberA, 1 / numberB);
	}
	
	public static double getPow (double numberA, double numberB) {
		return Math.pow (numberA, numberB);
	}

	private static void showMenuResult () {
		System.out.println ("(0) Exit");
		System.out.println ("(1) Addition");
		System.out.println ("(2) Subtraction");
		System.out.println ("(3) Multiplication");
		System.out.println ("(4) Division");
		System.out.println ("(5) Quadratic");
		System.out.println ("(6) Root");
		System.out.println ("(7) Pow");
	}
	
}

