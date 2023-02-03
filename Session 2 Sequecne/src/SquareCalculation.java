import java.util.Scanner;

public class SquareCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Square Calculation");
		
		System.out.println("--------------------");
		
		System.out.println("Enter a square sided number");
		Scanner sc = new Scanner(System.in);
		int square_side = sc.nextInt();
		
		int x = square_side + square_side;
		
		System.out.println("The parameter is " + x);
		
		int y = square_side * square_side;
		
		System.out.println("--------------------");
		
		System.out.print("The parameter is " + y);
		
		
	}

}
