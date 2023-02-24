import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class task5_sphere_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int r;
		
		
		System.out.println("What is the radius of your sphere? ");
		
		Scanner sphere = new Scanner(System.in);
		r = sphere.nextInt();
		
		double volume = 4 * Math.PI * Math.pow(r, 3) / 3;
		
		double surface_area = 4 * Math.PI * Math.pow(r, 2);
		
		DecimalFormat fmt = new DecimalFormat("0.0000");
		
		
		System.out.println("The volume is " + fmt.format(volume));
		
		System.out.println("Surface area = " + fmt.format(surface_area));
		
		
		
		
		
	}

}
