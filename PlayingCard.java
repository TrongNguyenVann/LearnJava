import java.util.*;

enum CardSuit {
	HEART(0, "Heart"),
	CLUB(1, "Club"),
	DIAMOND(2, "Diamond"),
	SPADE(3, "Spade");

	private final int cardSuit;
	private final String cardSuitString;

	CardSuit(int cardSuit, String cardSuitString) {
		this.cardSuit = cardSuit;
		this.cardSuitString = cardSuitString;
	}

	public int getCardSuit() {
		return cardSuit;
	}

	public String getCardSuitString() {
		return cardSuitString;
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
	ACE(1, "Ace"),
	TWO(2, "Two"),
	THREE(3, "Three"),
	FOUR(4, "Four"),
	FIVE(5, "Five"),
	SIX(6, "Six"),
	SEVEN(7, "Seven"),
	EIGHT(8, "Eight"),
	NINE(9, "Nine"),
	TEN(10, "Ten"),
	JACK(11, "Jack"),
	QUEEN(12, "Queen"),
	KING(13, "King");

	private final int cardRank;
	private final String cardRankString;

	CardRank(int cardRank, String cardRankString) {
		this.cardRank = cardRank;
		this.cardRankString = cardRankString;
	}

	public int getCardRank() {
		return cardRank;
	}

	public String getCardRankString() {
		return cardRankString;
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

	@Override
	public String toString() {
		String res = "PlayingCard with rank " +  rank.getCardRankString() +
			           " of suit: " + suit.getCardSuitString();
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PlayingCard) {
			PlayingCard otherPlayingCard = (PlayingCard)obj;
			if (otherPlayingCard.rank.getCardRank() == rank.getCardRank() &&
				  otherPlayingCard.suit.getCardSuit() == suit.getCardSuit()) {
				return true;
			}
		}
		return false;
	}
}