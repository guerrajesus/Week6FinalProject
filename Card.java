package week6FinalProject;

public class Card {
	
	private int value;
	private String suit;
	
//	1. Create the following classes:
//	       a.      Card
//	        i.     Fields
//	                           1.     value (contains a value from 2-14 representing cards 2-Ace)
//	                           2.     name (e.g. Ace of Diamonds, or Two of Hearts)
//	               ii.    Methods
//	                   1.     Getters and Setters
//	                   2.     describe (prints out information about a card)
	
	public Card (int value, String suit) {
		this.value = value;
		this.suit = suit;
		
	}
	
	public void describe () {
		String face = getFaceValue(this.value);
		System.out.println(face + " of " + this.suit + " - " + this.value);
	}
	
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getFaceValue(int value) {
		this.value = value;
		String name = "";
		
			switch(value) {
				case 2 : name = "Two";
					break;
				case 3 : name = "Three";
					break;
				case 4 : name = "Four";
					break;
				case 5 : name = "Five";
					break;
				case 6 : name = "Six";
					break;
				case 7 : name = "Seven";
					break;
				case 8 : name = "Eight";
					break;
				case 9 : name = "Nine";
					break;
				case 10 : name = "Ten";
					break;
				case 11 : name = "Jack";
					break;
				case 12 : name = "Queen";
					break;
				case 13 : name = "King";
					break;
				case 14 : name = "Ace";
					break;
	}   	return name;
	
}
	
	
	
	
	
	
}
	
	
	
