package tutorial1;

public class Classses_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Classes panny = new Classes(" Panny ", 21);
		panny.speak();
		
		Classes james = new Classes (" James " , 2);
		james.speak();
		
		Classes fd = new Classes (" Food " ,22);
		fd.speak();
		
		
		int x = panny.getAge(); //gets the age from panny
		System.out.println(x);
		
		james.setAge(50); //changes the age from 2 to 50
		
		james.speak();
		
	}

}
