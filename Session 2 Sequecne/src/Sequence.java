import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Sequence Obj = new Sequence();
		Obj.go();{
			
		}
		
	}
	
	public void go()
	
	{	
		int age ;
		Scanner scan = new Scanner (System.in);
		System.out.println("What's your age");
		age = scan.nextInt();
		
		System.out.println("You are " +  age + " years old");
		
		if (age>20)
			System.out.println("You are too old");
		
		else
			System.out.println("You are young");
	}
}