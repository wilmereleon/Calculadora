import java.util.*;

public class cuadraticCompares {
	public static double getDiscriminant(double x, double y, double z) {
		double answer = 0;
		answer = y * y - 4 * x * z;
		return answer;
	}
	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		double a, b, c, x1, x2;
		System.out.println("Enter the cuadratic ecuation's numbers.");
		System.out.println("Write a: ");
		a = sn.nextDouble();
		System.out.println("Write b: ");
		b = sn.nextDouble();
		System.out.println("Write c: ");
		c = sn.nextDouble();
		System.out.println("Write x1: ");
		x1 = sn.nextDouble();
		System.out.println("Write x2: ");
		x2 = sn.nextDouble();
		double q = comparson(a, b, c, x1, x2);
		if(q == -1){
			System.out.println();
		}
		else {
			System.out.println(q);
		}
		sn.close();
	}
	public static double comparson(double a, double b, double c, double x1, double x2){
		double d = getDiscriminant(a, b, c);
		double w = (-b+Math.sqrt(d))/(2*a);
		double x = (-b-Math.sqrt(d))/(2*a);
		if(d < 0){
			System.err.println("No real solution.");
		}
		else if(a == 0){
			System.err.println("Indeterminate result");
		}
		else if(areEquals(w, x1) && areEquals2(x, x2) || areEquals(w, x2) && areEquals2(x, x1)){
			System.out.println("Both values are roots of the cuadratic ecuation.");
		}
		else if(areEquals(w, x1) || areEquals2(x, x2) || areEquals(w, x2) || areEquals2(x, x1)){
			System.out.println("Only insertVariableHere is root of the cuadratic ecuation.");
		}
		else {
			System.out.println("None of the values is root of the cuadratic ecuation.");
		}
		return -1;
	}
	public static boolean areEquals(double a, double b){
		boolean answer = Math.abs(a-b) < 10e-1;
		return answer;
	}
	public static boolean areEquals2(double a, double b){
		boolean answer = Math.abs(a-b) < 10e-1;
		return answer;
	}
}