
public class MainClass {

	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		obj.go();

	}

	public void go()
	{
		int num1;
		String name = new String("Panayiotis");
		name = name.toUpperCase();
		num1 = name.length();
		System.out.println(name+ " your name is " + num1 + " characters");
		
		
		MyDate Past = new MyDate();
//		
		Past.setMonth(10);
		num1 = Past.getMonth();
		System.out.println("Month = " + num1);
		
		
//		thePast.day = 23;
//		thePast.month = 2;
//		thePast.year = 2000;
		
		
		//MyDate class is public
//		Scanner scan;
//		scan = new Scanner(System.in);
	}
}
