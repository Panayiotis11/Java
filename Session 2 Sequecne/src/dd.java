import java.util.Scanner;

public class dd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("What's your name?");
		
		Scanner sc = new Scanner (System.in); //scans the Scanner object to input
		String yo = sc.nextLine(); //creates a new line
		
		if (yo.equals("James")) 
			System.out.println("That's my name");
		
			
		else
			System.out.println("Wrong name");
		
		System.out.println("How old are you");
		int age = sc.nextInt();
		
		if (age==21)
			System.out.println("That's my age");
		
		else
			System.out.println("That's not my age");
	}

}
