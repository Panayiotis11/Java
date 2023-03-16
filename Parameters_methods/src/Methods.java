
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Methods obj = new Methods();
		
		
	}
	
	public Methods() {   //Constructor 
		
		System.out.println("sss");
		System.out.println("food");
		int big, val1 =120, val2=180;
		big = biggest(val1,val2);
		big = biggest(50,100);
		big = biggest(50,50);
	}
	
	public int biggest(int num1 , int num2) //Method 
	{
		
		if (num1 < num2)
		{
			num1 = 999;
			return num1;
		}
			
		if (num2 > num1)
			return num2;
		return 0;
	}
	
}
