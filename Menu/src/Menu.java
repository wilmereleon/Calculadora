//Imported libraries
import java.util.Scanner;

public class Menu {

	public static void main (String[] args) {
		Scanner mk = new Scanner (System.in); // «mk» is short for menu keyboard
		double numberEnteredA, numberEnteredB;
		int option;
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
				break;
			case 2:
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getSubtraction (numberEnteredA, numberEnteredB));
				break;
			case 3:
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getMultiplication (numberEnteredA, numberEnteredB));
				break;
			case 4:
				System.out.println("Type first number: ");
				numberEnteredA = mk.nextDouble();
				System.out.println("Type second number: ");
				numberEnteredB = mk.nextDouble();
				System.out.println (getDivision (numberEnteredA, numberEnteredB));
				break;
			default:
				System.err.println("Error");
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
	
	private static void showMenuResult () {
		System.out.println ("(0) Exit");
		System.out.println ("(1) Addition");
		System.out.println ("(2) Subtraction");
		System.out.println ("(3) Multiplication");
		System.out.println ("(4) Division");
	}
	
}

