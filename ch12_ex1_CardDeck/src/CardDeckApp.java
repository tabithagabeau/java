import java.util.ArrayList; //question 2 and 8

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
       ArrayList <String> deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);
        
        //question 8 similar to question 3 below; question 10
        int count = 2;
        int hands=4; //integer hand must be declared and sysout, choose hands= 4 for question 10
		for (int i = 0; i < hands; i++) {
        ArrayList<String>  hand = dealCards(deck, count);
        displayCards(hand);
        }
        System.out.println("CARDS LEFT IN DECK: " + deck.size()); //question 9 size on page 389
    }
    	//question 4 
    private static ArrayList <String> getDeck() {
    	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    	String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", 
            "8", "9", "10", "Jack", "Queen", "King"};        
    	
    	//question 3 pg 381 instead of []  replaces with add ()
    	ArrayList<String> deck = new ArrayList<>(52); 
        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
                i++;
            }
        }
        return deck;
    }
    //question 5
    private static void displayCards(ArrayList<String> cards) {
        System.out.print("|");        
        for (String card : cards) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }
    //question 6 changes method - Page 389 use add, get, size
    //inside method changes remember collection uses size() vs length, [] vs add; [i] vs get(index)
    private static void shuffleDeck(ArrayList<String> deck) {
        for (int i = 0; i < deck.size (); i++) {
            String savedCard = deck.get(i);
            int randomIndex = (int) (Math.random() * deck.size( )-1);
            deck.set(i, deck.get(randomIndex));
            deck.set(randomIndex, savedCard);
        }
    }
    	//question 7 ...remove page 391 and add page 389
    private static ArrayList<String> dealCards(ArrayList<String> deck, int count) {
    	ArrayList<String> hand =new ArrayList<>(count);
    	for (int i = 0; i < count; i++) {
    		hand.add(deck.remove(i));
        }
        return hand;
    }
}