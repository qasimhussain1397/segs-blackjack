import java.util.*;

public class Deck {

	List<Card> deck = new ArrayList<Card>();

	Deck() {
		for (Suit suit : Suit.values()) {
			for (Face cardValue : Face.values()) {
				this.deck.add(new Card(cardValue, suit));
			}
		}
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	public Card drawCard() {
		return deck.remove(0);
	}

	public void displayDeck() {
		for (Card card : deck) {
			System.out.println(card.getSuit() + " " + card.getFace());
		}
	}

}
