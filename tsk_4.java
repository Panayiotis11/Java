package task_4;

import java.util.Scanner;
import java.util.Random;

public class tsk_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter a 4 digit pin number to encrypt");
		
		int hexa;
		
		Scanner sc = new Scanner(System.in);
		hexa = sc.nextInt();
		
		
		
		System.out.println(Integer.toHexString(hexa));
						
//		Random generator = new Random();
//		
//		int rand1;
//		int rand2;
//		
//		rand1 = generator.nextInt(1000,65536);
//		rand2 = generator.nextInt(1000,65536);
//		
		
		//System.out.println("Your encrypted pin number is" + Integer.toHexString(rand1) + Integer.toHexString(rand2) );
		
		
		

	
	}

}
