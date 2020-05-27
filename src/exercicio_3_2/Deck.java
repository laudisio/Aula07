package exercicio_3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Deck {
	private static List<Card> cards;

	private static Deck deck = null;
	
	private Deck() {
		cards = new ArrayList<Card>();
		// build the deck
		Suit[] suits = {
			Suit.SPADES,
			Suit.HEARTS,
			Suit.CLUBS,
			Suit.DIAMONDS
		};

		for (Suit suit: suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}

		// shuffle it!
		Collections.shuffle(cards, new Random( ));
	}
	
	public static synchronized Deck getInstance() {
		if (deck == null) {
			deck = new Deck();
		}
		return deck;
	}

	public void print( ) {
		for (Card card: cards) {
			card.print( );
		}
	}	
}
