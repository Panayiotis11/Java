package tutorial1;
import java.util.Scanner;

public class InputAndTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This code will allow the user to input a string 
		Scanner sc = new Scanner (System.in);
		String scanned = sc .next(); // It got scanned by the scanner object using sc.next() then got stored in the variable scanned then managed to print it out
		
		//The code below will convert the variable scanned to an integer
		int x = Integer.parseInt(scanned);
		System.out.println(scanned);
		
		
		//This code will allow the user to input an integer only
		Scanner yo = new Scanner (System.in);
		int scan = yo.nextInt();
		System.out.println(scan);
		
		
		// This code will allow the user to only input a boolean value (true or false)
		Scanner bool = new Scanner (System.in);
		boolean b = bool.nextBoolean();
		System.out.println(b);
		
		// This code will allow the user to input and output a float numebr 
		Scanner flo = new Scanner (System.in);
		double decimal = flo.nextDouble();
		System.out.println(decimal);
	}

}
