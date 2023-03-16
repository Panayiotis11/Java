import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Cards {

	
	private String suit;
	private String faceValue;
	
	public Cards(String suit , String faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	public String get_suit() {
		return suit;
	}
	
	public String get_faceValue() {
		return faceValue;
	}
	
	public String toString() {
		return faceValue + " of " + suit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String[] suits = {"Hearts","Diamonds","Clubs", "Spades"};
	String[] facevalues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};	
	
	Random random = new Random();
	System.out.println("Dealt Cards");
	for (int i=0; i<5; i++);{
		int suitIndex = random.nextInt(suits.length);
		int face_Index = random.nextInt(facevalues.length); //This will select a random value from the array list
		Cards card = new Cards(suits[suitIndex], facevalues[face_Index]);
		System.out.println(card);
	}
	}
		
	

}
