package week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private static int j =1;
//
//	b.     Deck
//    i.     Fields
//                    1.     cards (List of Card)
//          ii.    Methods
//                    1.     shuffle (randomizes the order of the cards)
//                    2.     draw (removes and returns the top card of the Cards field)
//                    3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	
	private List<Card> deck = new ArrayList<Card>();
	 
	 Deck() {
		 String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
		 	
		 	for (String suit : suits) {
		 		for (int i =2; i <= 14; i++) {
		 			Card card = new Card(i,suit);
		 			this.deck.add(card);
		 		}
		 	}
	}
	
	 public void describe() {
		 	
		 	for (Card card : this.deck) {
		 		System.out.print(j + "  ");
		 		card.describe();
		 		j++;
		 	}
		 	
	 }
	
	public Card draw () {
		
		return this.deck.remove(0);
	}
	
	public void shuffle () {
		Collections.shuffle(this.deck);
	}
	
	
	
	
	
	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	
		
		
//			
	
	
		
	














}
