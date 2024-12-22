package week6FinalProject;


public class App {
	//Scanner scanner = new Scanner(System.in);
	static int tie = 0;
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		System.out.printf("%5s %5s %5s \n","-------","Shuffled","-------");
		
		deck.shuffle();
		deck.describe();
		
		System.out.println("\n-----------------");
		
		//deck.draw().describe();
		
		Player player1 = new Player("Jesus");
		Player player2 = new Player("Mike");
		
		//player1.draw(deck);
		
			for (int i =0; i < 52; i++) {
				if (i % 2 == 0) {
					player1.draw(deck);
				}else 
					player2.draw(deck);
			}
				
				
				for (int x =0; x < 26; x++) {
						System.out.println("\nround " + (x+1));
						Card p1Flip = player1.flip();
						Card p2Flip = player2.flip();
						
						System.out.print("\t" + player1.getPlayerName() + " has ");
						p1Flip.describe();
						
						System.out.print("\t" + player2.getPlayerName() + " has ");
						p2Flip.describe();
						
						if (p1Flip.getValue() > p2Flip.getValue()) {
							player1.incrementScore();
								winnerOfRound(player1, player2);
								currentScore(player1,player2);
							
						}else if(p2Flip.getValue() > p1Flip.getValue()) {
							player2.incrementScore();
								winnerOfRound(player2, player1);
								currentScore(player1,player2);
								
							
						} else {
						System.out.println("\t*Its a tie! No one gets a point*");
						currentScore(player1,player2);
						tie ++;
					} 
				}	

								endingScore(player1,player2);
						
					  System.out.print("\n");
					  									 
					  if (player1.getScore() == player2.getScore()) {
						  System.out.println("Its a Draw");
					  }else if (player1.getScore() > player2.getScore()) {
						  System.out.println(player1.getPlayerName() + " is the Winner!");
					  } else if (player1.getScore() < player2.getScore()) {
						  System.out.println(player2.getPlayerName() + " is the Winner!");
					  }
			
			
			
//			
//				a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
//
//				b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
//
//				c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
//
//				Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.
//				Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
//				d.      After the loop, compare the final score from each player.
//
//				e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
//		
//		
		
		
		
	
	
	}
	private static void winnerOfRound (Player winningPlayer, Player player ) {
		System.out.println("\t*" + winningPlayer.getPlayerName() + " wins this round*");
	}
	
	private static void currentScore (Player player1, Player player2) {
		System.out.println("---------------------------------------------");
		System.out.println("\t" + "Currect scores " + player1.getPlayerName() + ": " + player1.getScore()
											 + " \t" + player2.getPlayerName() + ": " + player2.getScore());
	}
	
	private static void endingScore (Player player1, Player player2) {
		System.out.printf("\n%20s %25s %25s\n",(player1.getPlayerName() + " total score: " + player1.getScore()), 
												(player2.getPlayerName() + " total score: " + player2.getScore()),
												("Number of ties: " + tie ));
	}
}
	

