import java.util.*;

//import java.util.Scanner;
public class Player {

	List<Card> playerHand = new ArrayList<Card>();
	// private Deck deck;
	Deck deck = new Deck();
	private int totalScore;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public List<Card> getHand() {
		deck.shuffleDeck();
		for (int i = 0; i < 2; i++) {
			playerHand.add(deck.drawCard());
		}
		return playerHand;
	}

	public void displayHand() {
		for (Card card : playerHand) {

			System.out.println(card.getSuit() + " " + card.getFace());
		}
	}
	
	public int getHandSize() {
	    return playerHand.size();
	}

	
	public void hit() {
		if (getHandSize() < 3) {
			playerHand.add(deck.drawCard());
			displayHand();
		}
	}

	public int getScore() {
		int score = 0;
		for (Card card : playerHand) {
			if (card.getFace().toString().equals("ACE")) {
				determineAceValue();
				score = score + card.getFace().getValue();
			} else {
				score = score + card.getFace().getValue();
			}
			

		}

		return score;
	}

	public boolean isBusted() {
		int score = getScore();
		return score > 21;
	}
	
	public boolean isValidHand() {
		int score = getScore();
		return score <= 21;
	}

	public int checkForAces() {
		int aceCounter = 0;
		for (Card card : playerHand) {
			if (card.getFace().getValue() == 11) {
				aceCounter++;
			}
		}
		return aceCounter;
	}


	public void determineAceValue() {
		int aceCount = checkForAces();
		// int score = 0;
		if (aceCount == 0) {

		} else {
			for (Card card : playerHand) {
				if (card.getFace().getValue() == 11) {
					System.out.println("What value would you like this ace to be? 1 or 11");
					Scanner myObj = new Scanner(System.in);
					int input = myObj.nextInt();
					if (input == 1) {
						card.getFace().setAceValue(1);
					} else if (input == 11) {
						card.getFace().setAceValue(11);
					}
				}

			}
		}
	}
}
