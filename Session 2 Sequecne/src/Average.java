import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter three integers and " +
                "I will compute their average");
		
		int vall, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first value: ");
		vall = scan.nextInt();
		
		System.out.println("Enter the second value: ");
		val2 = scan.nextInt();
		
		System.out.println("Enter the third value: ");
		val3 = scan.nextInt();
		
		
		int x = 3;
		int sum = vall + val2 + val3;
		
		double avg = sum / (double)x;
		System.out.println("The aveages is " + avg);
		
		

		
	}

}
