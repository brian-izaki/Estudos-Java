package Arrays_ArrayList.deck;

public class DeckOfCardsTest {

    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for(int i = 1; i <= 52; i++) {
            System.out.printf("%-10s", myDeckOfCards.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }

}
