
class CardDeck {

  private static final int NUM_SUITS = 4;
  private static final int NUM_RANKS = 13;
  private PlayingCard[][] cards;


  public CardDeck() {
    cards = new PlayingCard[NUM_SUITS][NUM_RANKS];
    for (int i = PlayingCard.HEART_SUIT; i < NUM_SUITS; ++i) {
      for (int j = PlayingCard.ACE_RANK; j <= NUM_RANKS; ++j) {
        cards[i][j - 1] = new PlayingCard(i, j);
      }
    }
  }

  void displayCards() {
    for (int i = 0; i < NUM_SUITS; ++i) {
      for (int j = 0; j < NUM_RANKS; ++j) {
        cards[i][j].display();
      }
    }
  }
  
}