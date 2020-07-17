import java.util.*;

enum CardSuit {
	HEART,
	CLUB,
	DIAMOND,
	SPADE;

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

class PlayingCard {

	int rank;
	int suit;

	static final int HEART_SUIT = 0;
	static final int CLUB_SUIT = 1;
	static final int DIAMOND_SUIT = 2;
	static final int SPADE_SUIT = 3;

	static final int ACE_RANK = 1;
	static final int TWO_RANK = 2;
	static final int THREE_RANK = 3;
	static final int FOUR_RANK = 4;
	static final int FIVE_RANK = 5;
	static final int SIX_RANK = 6;
	static final int SEVEN_RANK = 7;
	static final int EIGHT_RANK = 8;
	static final int NIGHT_RANK = 9;
	static final int TEN_RANK = 10;
	static final int JACK_RANK = 11;
	static final int QUEEN_RANK = 12;
	static final int KING_RANK = 13;

	private boolean isValidSuit(int suit) {
		if (suit < HEART_SUIT || suit > SPADE_SUIT) {
			return false;
		}
		return true;
	}

	private boolean isValidRank(int rank) {
		if (rank < ACE_RANK || rank > KING_RANK) {
			return false;
		}
		return true;
	}

	public PlayingCard(int suit, int rank) {
		// Create random rank in range [1 - 13], random suit
		assert isValidSuit(suit);
		assert isValidRank(rank);
		this.suit = suit;
		this.rank = rank;
	}

	// Use method to convert number to string
	String convertCardSuitToString(int cardSuit) {
		switch (cardSuit) {
			case 0:
				return "Heart";
			case 1:
				return "Club";
			case 2:
				return "Diamond";
			case 3:
				return "Spade";
			default:
				return null;
		}
	}

	// Use method to convert number to string
	String convertCardRankToString(int cardRank) {
		switch (cardRank) {
			case 1:
				return "Ace";
			case 2:
				return "Two";
			case 3:
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			case 6:
				return "Six";
			case 7:
				return "Seven";
			case 8:
				return "Ten";
			case 9:
				return "Eleven";
			case 10:
				return "Ten";
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			default:
				return null;
		}
	}

	private static HashMap<Integer, String> suitMap;
	private static HashMap<Integer, String> rankMap;
	static {
		// suit map static initialization
		suitMap = new HashMap<Integer, String>();
		suitMap.put(HEART_SUIT, "Heart");
		suitMap.put(CLUB_SUIT, "Club");
		suitMap.put(DIAMOND_SUIT, "Diamond");
		suitMap.put(SPADE_SUIT, "Spade");

		// rank map static initialization
		rankMap = new HashMap<Integer, String>();
		rankMap.put(ACE_RANK, "Ace");
		rankMap.put(TWO_RANK, "Two");
		rankMap.put(THREE_RANK, "Three");
		rankMap.put(FOUR_RANK, "Four");
		rankMap.put(FIVE_RANK, "Five");
		rankMap.put(SIX_RANK, "Six");
		rankMap.put(SEVEN_RANK, "Seven");
		rankMap.put(EIGHT_RANK, "Eight");
		rankMap.put(NIGHT_RANK, "Night");
		rankMap.put(TEN_RANK, "Ten");
		rankMap.put(JACK_RANK, "Jack");
		rankMap.put(QUEEN_RANK, "Queen");
		rankMap.put(KING_RANK, "King");
	}

	public void display() {
		System.out.println("Rank: " + rankMap.get(rank) + 
			                 ", Suit: " + suitMap.get(suit));
	}
}