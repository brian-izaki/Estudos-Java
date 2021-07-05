package Arrays_ArrayList.deck;

public class Card {
    private final String face; // face
    private final String suit; // naipe

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String toString() {
        return face + " " + suit;
    }
}
