import java.util.*;

enum CardSuit {
	HEART(0),
	CLUB(1),
	DIAMOND(2),
	SPADE(3);

	private final int cardSuit;
	CardSuit(int cardSuit) {
		this.cardSuit = cardSuit;
	}

	public int getCardSuit() {
		return cardSuit;
	}

	public static CardSuit castFromInt(int number) {
		switch(number) {
			case 0:
				return HEART;
			case 1:
				return CLUB;
			case 2:
				return DIAMOND;
			case 3:
				return SPADE;
			default:
				return null;	
		}
	}
}

enum CardRank {
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13);

	private final int cardRank;

	CardRank(int cardRank) {
		this.cardRank = cardRank;
	}

	public int getCardRank() {
		return cardRank;
	}

	public static CardRank castFromInt(int cardRank) {
		switch(cardRank) {
			case 1:
				return ACE;
			case 2:
				return TWO;
			case 3:
				return THREE;
			case 4:
				return FOUR;
			case 5:
				return FIVE;
			case 6:
				return SIX;
			case 7:
				return SEVEN;
			case 8:
				return EIGHT;
			case 9:
				return NINE;
			case 10:
				return TEN;
			case 11:
				return JACK;
			case 12:
				return QUEEN;
			case 13:
				return KING;
			default:
				return null;					
		}
	}
}

class PlayingCard {

	CardRank rank;
	CardSuit suit;

	private boolean isValidSuit(int suit) {
		if (suit < 0 || suit > 3) {
			return false;
		}
		return true;
	}

	private boolean isValidRank(int rank) {
		if (rank < 1 || rank > 13) {
			return false;
		}
		return true;
	}

	public PlayingCard(int suit, int rank) {
		// Create random rank in range [1 - 13], random suit
		assert isValidSuit(suit);
		assert isValidRank(rank);
		this.suit = CardSuit.castFromInt(suit);
		this.rank = CardRank.castFromInt(rank);
	}

	private static HashMap<CardSuit, String> suitMap;
	private static HashMap<CardRank, String> rankMap;
	static {
		// suit map static initialization
		suitMap = new HashMap<CardSuit, String>();
		suitMap.put(CardSuit.HEART, "Heart");
		suitMap.put(CardSuit.CLUB, "Club");
		suitMap.put(CardSuit.DIAMOND, "Diamond");
		suitMap.put(CardSuit.SPADE, "Spade");

		// rank map static initialization
		rankMap = new HashMap<CardRank, String>();
		rankMap.put(CardRank.ACE, "Ace");
		rankMap.put(CardRank.TWO, "Two");
		rankMap.put(CardRank.THREE, "Three");
		rankMap.put(CardRank.FOUR, "Four");
		rankMap.put(CardRank.FIVE, "Five");
		rankMap.put(CardRank.SIX, "Six");
		rankMap.put(CardRank.SEVEN, "Seven");
		rankMap.put(CardRank.EIGHT, "Eight");
		rankMap.put(CardRank.NINE, "Nine");
		rankMap.put(CardRank.TEN, "Ten");
		rankMap.put(CardRank.JACK, "Jack");
		rankMap.put(CardRank.QUEEN, "Queen");
		rankMap.put(CardRank.KING, "King");
	}

	public void display() {
		System.out.println("Rank: " + rankMap.get(rank) + 
			                 ", Suit: " + suitMap.get(suit));
	}
}