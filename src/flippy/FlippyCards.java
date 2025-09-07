package flippy;

/**
 * Keeps track of the cards and and answers questions
 * for the flippy card game. 
 * 
 * Red cards (hearts and diamonds) award positive points, while black cards 
 * (clubs and spades) award negative points.  Cards 2-10 have points worth 
 * their face value, Jack, Queen and King 10 and Ace 11.
 * 
 * @author Julian Chumacero
 *
 */
public class FlippyCards {
	private Card[] cards; // the cards for the game

	/**
	 * Create a new flippy card game state, which consists of the
	 * numCards cards for the game.
	 * 
	 * @param numCards number of cards in the game
	 */
	public FlippyCards(int numCards){
		this.cards = new Card[numCards];
	}

	/**
	 * Returns the flippy card at the given index 
	 * 
	 * @return the flippy card at the given index
	 */
	public Card getCard(int index) {
		return cards[index];
	}
	
	/**
	 * Flip the card over at this index.  Card indices
	 * start at 0 and go up the cards.length-1
	 * 
	 * @param cardIndex the index of the card to flip over
	 */
	public void flipCard(int cardIndex) {
		cards[cardIndex].flip();
	}

	/**
	 * Calculate the best possible score for the
	 * current cards.
	 * 
	 * @return the optimal score
	 */
	public int calculateOptimalScore(){
		int score = 0;

		for (int i = 0; i<cards.length; i++) {
			if (cards[i].isRedCard()) {
				score += cards[i].getFlippyCardValue();
			}
		}
		return score;
	}


	/**
	 * Calculate the flippy card score for the cards that are
	 * face up.  
	 * 
	 * @return the flippy card score for faceup cards
	 */
	public int faceUpTotal(){
		int total = 0;
		for (int i = 0; i<cards.length; i++) {
			if (cards[i].isFaceUp()) {
				if (cards[i].isRedCard())
					total += cards[i].getFlippyCardValue();
				else {
					total -= cards[i].getFlippyCardValue();
				}
			}
		}
		return total;
	}

	/**
	 * Calculate the flippy card score for the cards that are
	 * face down.  
	 * 
	 * @return the flippy card score for facedown cards
	 */
	public int faceDownTotal(){
		int total = 0;
		for (int i = 0; i<cards.length; i++) {
			if (!cards[i].isFaceUp()) {
				if (cards[i].isRedCard())
					total += cards[i].getFlippyCardValue();
				else {
					total -= cards[i].getFlippyCardValue();
				}
			}
		}
		return total;
	}


	public String toString() {
		String cardList = "";
		for (int i = 0; i<cards.length; i++) {
			if (cards[i].isFaceUp()) {
				cardList += cards[i].toString();
			}
			else {
				cardList += "FACE-DOWN";
			}
			if (i<cards.length-1) {
				cardList += " | ";
			}
		}
		return cardList;
	}
}
