import org.junit.*;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.plugins.MockMaker;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

	// Deck deck = new Deck();
	// Player player = new Player();
	@Mock
	Player playerMock;
	@Mock
	private ArrayList<Card> mockPlayerHand;

	
	Deck deck;
	private Card card;
		
	

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testThat2CardsAreDealt() {
		deck = new Deck();
		int handsize = 0;
		playerMock.getHand();
		handsize = playerMock.getHandSize();
		Assert.assertEquals(2, handsize);
	}
	
	@Test
	public void testHitMethod() {
		//List<Card> playerHand = new ArrayList<Card>();
		playerMock.getHand();
		String userInput = String.format("h", 0 );
		playerMock.hit();
		//playerHand.add(new Card(Face.FIVE, Suit.SPADES));
		Assert.assertEquals(playerMock.getHandSize(), 3);
		Assert.assertNotNull(playerMock.getScore());
	}
	
	@Test
	public void testStandMethod() {
		playerMock.getHand();
		String userInput = String.format("s", 0 );
		Assert.assertEquals(playerMock.getHandSize(), 2);
		//Assert.assertEquals(player.getScore(), );
		Assert.assertNotNull(playerMock.getScore());
	}
	
	@Test
	public void testIfHandIsValidWith2Cards() {
		Player mockPlayer = Mockito.mock(Player.class);
		//Player player = new Player();
		List<Card> playerHand = new ArrayList<Card>();
		playerMock.getHand();
		mockPlayerHand.add(new Card(Face.EIGHT, Suit.HEARTS));
		mockPlayerHand.add(new Card(Face.DEUCE, Suit.HEARTS));
		Mockito.when(mockPlayer.getHand()).thenReturn(mockPlayerHand);
		
		Assert.assertEquals(playerHand.size(), 2);
		//Assert.assertTrue(playerHand.);
		playerMock.getScore();
	}


}