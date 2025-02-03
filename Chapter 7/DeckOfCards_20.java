import java.util.ArrayList;
import java.util.Collections;
enum Face {
    ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}



enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES
}

class Card {
    private Face face;
    private Suit suit;

    // Constructor
    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    // Get face of card
    public Face getFace() {
        return face;
    }

    // Get suit of card
    public Suit getSuit() {
        return suit;
    }

    // Return string representation of Card
    @Override
    public String toString() {
        return face + " of " + suit;
    }
}




public class DeckOfCards_20 {
    private ArrayList<Card> deck;

    // Constructor
    public DeckOfCards() {
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();

        deck = new ArrayList<>();

        // Populate deck with all 52 possible cards
        for (Face face : faces) {
            for (Suit suit : suits) {
                deck.add(new Card(face, suit));
            }
        }
    }

    // Shuffle deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    // Deal one card
    public Card dealCard() {
        return deck.remove(0);
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        // Deal 5 cards
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.dealCard());
        }
    }
}
