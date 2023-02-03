package tutorial1;

import java.util.Scanner;

public class NestedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input your age");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);

		if (age == 13) {
			System.out.println("Whats your fave food");
			String food = sc.nextLine();
			
			if (food.equals("pizza")) {
				System.out.println("mine too");
			}
		    else {
		    
		    	System.out.println("Not mine");
		    }
		}
		else if (age > 20){
			System.out.println("Keep going");
			
		}
		
		
		else {
			System.out.println("Your too young");
		}
	}	

}
