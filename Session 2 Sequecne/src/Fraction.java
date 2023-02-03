import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fraction");
		
		System.out.println("--------");
		
		System.out.println("Enter the numerator");
		Scanner sc = new Scanner(System.in);
		int numerator = sc.nextInt();
		
		
		System.out.println("Enter the denominator");
		int denominator = sc.nextInt();
		
		System.out.println("Fraction is " + numerator+"/"+denominator);
		
		
		double decimal = numerator / (double)denominator;
		
		System.out.println("--------");
		
		System.out.println("The decimal value is " + decimal);
		
		
		
		
		
		
	}

}
