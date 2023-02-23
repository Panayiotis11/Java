import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice1;
		int dice2;
		int dice1_first_roll;
		int dice2_first_roll;
		int dice1_second_roll;
		int dice2_second_roll;
		int rand_num1;
		int rand_num2;
		int rand_num3;
		int rand_num4;
		int rand_num5;
		int rand_num6;
		int dice3_first_roll;
		int dice3_second_roll;
		
		System.out.println("How many sides does dice 1 have");
		Scanner roll = new Scanner(System.in);
		dice1 = roll.nextInt();
		
		System.out.println("How many sides does dice 2 have?");
		dice2 = roll.nextInt();
		
		Random generator = new Random();
		
		int[] num = {1, 2, 3, 4, 5 , 6, 7};
		
		rand_num1 = num[generator.nextInt(num.length)];
	
		System.out.println("Die 1 first roll = " + rand_num1);
		
		rand_num2 = num[generator.nextInt(num.length)];
		
		System.out.println("Die 2 first roll = " + rand_num2);
		
		rand_num3 = num[generator.nextInt(num.length)];
		
		System.out.println("Die 1 second roll = " + rand_num3);
		
		rand_num4 = num[generator.nextInt(num.length)];
		
		System.out.println("Die 2 second roll = " + rand_num4);
		
		rand_num5 = num[generator.nextInt(num.length)];
		
		System.out.println("Die 1 third roll = " + rand_num5);
		
		rand_num6 = num[generator.nextInt(num.length)];
		
		System.out.println("Die 2 third roll = " + rand_num6);
		
		
		int Dice1_total = rand_num1 + rand_num3 + rand_num5;
		int avg1 = Dice1_total / 3;
		System.out.println("Die 1 rolled a total of " + Dice1_total + "and rolled " + avg1 + " on average");
		
		int Dice2_total = rand_num2 + rand_num4 + rand_num6;
		double avg2 = Dice2_total / 3;
		System.out.println("Die 2 rolled a total of " + Dice2_total + "and rolled " + avg2 + " on average");
		
		
		
		
		
		
		
		
	}

}
