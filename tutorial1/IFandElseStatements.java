package tutorial1;

import java.util.Scanner;

public class IFandElseStatements {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	if (s.equals("tim")){
		System.out.println("You typed tim");
	}
	
	else if (s.equals("hello")) {
		System.out.println("Hi");
	}
	else {
		System.out.println("Wrong name");
	}
	
}

}