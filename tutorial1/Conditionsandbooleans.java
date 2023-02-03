package tutorial1;

public class Conditionsandbooleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 6;
		int y = 23;
		int z = 10;
//	> <  = >= <= !=
		// == This will compare the values in java
		
		boolean compare = x < y && z > y; //&& = to and
		
		boolean comp = (y > x || z > y); // || = OR
		
		
		boolean not = !(x<y || z>y); // if not true
		
		System.out.println(compare); 
		System.out.println(comp);
		System.out.println(not);
		
		
		
		
	//String comparison
//		String x = "hello";
//		String y = "hi";
//		int j = 20;
//		
//		boolean compare = x!=y;
//		System.out.println(compare);
	}

}
