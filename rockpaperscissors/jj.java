import java.util.Random;
import java.util.Scanner;

public class jj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to rock paper scisors");
		
		System.out.println("(r)ock (p)aper (s)cisors");
		
		
		String[] rps = {"rock" , "paper", "scissors"};
		
		String randomWord = rps [new Random().nextInt(rps.length)];
		// randomWord will generate a random word from the rps array
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if (s.equals("r"))
				s="rock";
		
		else if (s.equals("p")) 
			s = "paper";
			
			
		else if (s.equals("s"))
			s = "scissors";
		
		else
			System.out.println("Invalid input");
		
		System.out.println(randomWord);
		
		
		
		
		
	
		
	}

}
