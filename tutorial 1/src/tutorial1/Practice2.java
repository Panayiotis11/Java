package tutorial1;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input your age:");
		Scanner sc = new Scanner(System.in);
		String Scanned = sc.next();
		int age = Integer.parseInt(Scanned);
		
		
		if (age >= 18) {
			System.out.println("You are old enough");
		
			String food = sc.nextLine();
			if (food.equals("Chicken")) {
			System.out.println("Goodd");
			
		}
			else 
			{ 
				System.out.println("Not Goodd");
			}
		
		}
		  else {
			System.out.println("You are young");
			
		  		}
	}
}