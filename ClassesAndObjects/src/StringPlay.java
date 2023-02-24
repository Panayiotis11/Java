
		// TODO Auto-generated method stub

		// **************************************************
	//   StringPlay.java
	//
	//   Play with String objects
	// **************************************************
	public class StringPlay
	{
	   public static void main (String[] args)
	   {
	      String college = new String ("Leeds Beckett University "); //Similar for part (a)

	       // part (a)
	      
	      
	      String town = new String("Anytown UK");
	      

	      int stringLength;
	      String change1, change2, change3, replace; 

	       // part (b)
	      
	      stringLength = college.length();

	      System.out.println (college + " contains " + stringLength + " characters.");

	      change1 =  college.toUpperCase();// part (c)

	      change2 =  college.replace("e" , "*"); // part (d)
	     
	      replace = change2.replace("s", "*"); //This code will replace the letter e and s with a *
	      
	      change3 = college.concat(town) ;// part (e)

	     System.out.println ("The final string is " + change3);
	     
	     System.out.println(replace);
	    
	}

}
