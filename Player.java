package week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String playerName;
	
	
	
	Player(String playerName) {
		this.playerName = playerName;
		this.score = 0;
	}
	
	//Player()
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public void describe () {
		System.out.println("\nPlayer: " + this.playerName + " has these cards" );
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip () {
		Card card = this.hand.remove(0);
		
		return card;
	}
	
	public Card draw (Deck deck) {
		  this.hand.add(deck.draw());
		  	return hand.get(0);
		
	}
	
	public void incrementScore () {
		this.score++;
	}
	
//	i.     Fields
//	                1.     hand (List of Card)
//	                	 2.     score (set to 0 in the constructor)
//	                		 3.     name
//	ii.    Methods
//	       1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)
//            2.     flip (removes and returns the top card of the Hand)
//	             3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//	                4.     incrementScore (adds 1 to the Player’s score field)
	
	
	
	
	
	
	
	
	
}
