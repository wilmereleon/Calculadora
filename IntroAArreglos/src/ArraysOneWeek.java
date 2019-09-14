import java.util.Scanner;
import java.lang.*;

public class ArraysOneWeek {

	public static void main(String[] args) {
		Scanner an = new Scanner (System.in);
		String pArray2 = (String) an.toString();
		String pArray1 = (String) an.toString();
		//String pArray2 [] = {"1", "8", "0", "4"};
		//String pArray1 [] = {"4", "9", "13", "2"};
		
		String[] result = concatenar(pArray1, pArray2);
		
		for (int i = 0; i < result.length; i ++) {
			System.out.println (result[i]);
		}
		an.close();

	}
	public static String[] concatenar(String pArray1, String pArray2) {
		String[] result = new String [pArray1.length() + pArray1.length()];
		
		System.arraycopy(pArray1, 0, result, 0, pArray1.length());
		System.arraycopy(pArray2, 0, result, pArray1.length(), pArray2.length());
		return result;
		
	}

}
