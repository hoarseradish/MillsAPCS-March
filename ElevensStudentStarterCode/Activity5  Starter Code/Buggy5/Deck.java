import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;


    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++) {
            for (String suitString : suits) {
                cards.add(new Card(ranks[i], suitString, values[i]));
            }
        }
        size = cards.size();
        shuffle();
    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return size;
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {
            int howMany = i + 1;
            int start = 0;
            int randPos = (int) (Math.random() * howMany) + start;
            Card temp = cards.get(i);
            cards.set(i, cards.get(randPos));
            cards.set(randPos, temp);
        }
        size = cards.size();
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        if (isEmpty()) {
            return null;
        }
        size--;
        Card c = cards.get(size);
        return c;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String returnString = "size = " + size + "\nUndealt cards: \n";

        for (int i = size - 1; i >= 0; i--) {
            returnString = returnString + cards.get(i);
            if (i != 0) {
                returnString = returnString + ", ";
            }
            if ((size - i) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                returnString = returnString + "\n";
            }
        }

        returnString = returnString + "\nDealt cards: \n";
        for (int i = cards.size() - 1; i >= size; i--) {
            returnString = returnString + cards.get(i);
            if (i != size) {
                returnString = returnString + ", ";
            }
            if ((i - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                returnString = returnString + "\n";
            }
        }

        returnString = returnString + "\n";
        return returnString;
    }
}
