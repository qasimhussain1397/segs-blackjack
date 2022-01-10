import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player = new Player();

		player.getHand();
		player.displayHand();

		System.out.println("Would you like to hit or stand? H/S");
		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();

		if (input.equals("h")) {
			player.hit();
		}

		System.out.println(player.getScore());

	}

}




