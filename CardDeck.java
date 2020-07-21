
class CardDeck {

  private static final int NUM_SUITS = 4;
  private static final int NUM_RANKS = 13;
  private PlayingCard[] cards;


  public CardDeck() {
    cards = new PlayingCard[NUM_SUITS * NUM_RANKS];
    int cardIndex = 0;
    for (int i = 0; i < NUM_SUITS; ++i) {
      for (int j = 1; j <= NUM_RANKS; ++j) {
        cards[cardIndex++] = new PlayingCard(i, j);
      }
    }
  }

  @Override
  public String toString() {
  	String res = "Display all playing card in Deck\n";
    for (PlayingCard p : cards) {
      res += p.toString() + '\n';
    }
    return res;
  }

  @Override
  public boolean equals(Object obj) {
  	if (obj instanceof CardDeck) {
  		CardDeck otherDeck = (CardDeck)obj;
  		if (cards.length == otherDeck.cards.length) {
  			for (int i = 0; i < cards.length; ++i) {
  				if (cards[i].equals(otherDeck.cards[i]) == false) {
  					return false;
  				}
  			}
  			return true;
  		}
  	}
  	return false;
  }
  
}