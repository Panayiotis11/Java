package tutorial1;
import java.util.Scanner;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String x = ("sss");
		x.length();
		System.out.println(x.length());
		
		tim("Goodnight", 4); //Arguement
		
		System.out.println(panny(5));
		
		System.out.println(str("Are you ok")); //This wil add the question mark from the string function
	}
	

	public static void tim(String str, int x) {  //calling the arguement
		for (int i = 0; i<x; i++) {
			System.out.println(str);  //This will print tim() 
									
		}

	}
	public static int panny(int x) {
		return x + 9;
		
	}
	
	public static String str(String x) {
		return x + "?"; //returns a ? to x that is being called
	}
	
}
