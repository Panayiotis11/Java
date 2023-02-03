import java.util.Scanner;

public class MilestoKilometres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a number in miles");
		
		Scanner sc = new Scanner (System.in);
		
		double flo = sc.nextFloat();
		
		double km = 1.609344; //assigns the km value in km variable
		
		double kilometers = flo * km ;
		
		System.out.println(kilometers);
	}

}
