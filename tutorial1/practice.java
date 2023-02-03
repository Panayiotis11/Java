package tutorial1;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generascted method stub
		
		System.out.println("Who is your fave player");
		Scanner g = new Scanner(System.in);
		String s = g.next();
		
		if (s.equals("Rashford")) {
			System.out.println("Well Said");
		
		}
		
		else if (s.equals("Casemiro")) {
			System.out.println("Not bad");
		}
		
	
		else {
			System.out.println("Learn the game");
		}
		
		

	}
}
		
		
