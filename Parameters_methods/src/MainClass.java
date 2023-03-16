
public class MainClass {
	
	int big = 111;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass sc = new MainClass();
		int big = 10;
		System.out.println("back in main" +big);
		
	}

	
	public MainClass()
	{
		System.out.println("ss");
		
		int big = 150;
		big = biggest(1,25);
		big = biggest(22,30);
		big =biggest(200,300,500); //Passing arguements to a method
		System.out.println("The constructor" +big);
		this.big = big;
		
		
		
	}
	
	public int biggest(int number1, int number2) {
		if (number1 > number2)
		{
			return number1;
		}
		else if (number2 > number1) {
			return number2;
		}
		
		else 
			return 0;
		
		
		
	}
		public int biggest(int num1 , int num2 , int num3) {
		
			if (num1>num2)
				System.out.println("I love you");
			else if (num3 > num1)
				System.out.println("That's right");
			else
				System.out.println("I am learning");
			return num3;
	}
		
	
}
