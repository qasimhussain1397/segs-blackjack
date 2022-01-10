
public class Card {

	private final Face face;
	private final Suit suit;

	public Card(Face face, Suit suit) {
		// TODO Auto-generated constructor stub
		this.face = face;
		this.suit = suit;

	}

	public Face getFace() {
		return face;
	}

	public Suit getSuit() {
		return suit;
	}

	public String toString() {
		return face + "of" + suit;
	}
}
