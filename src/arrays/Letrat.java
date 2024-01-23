package arrays;

public class Letrat {
    public static void main(String[] args) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        // String[] suits = {"\u2663","\u2666","\u2665","\u2660"};
        String[] suits = {"♣", "♦", "♥", "♠"};

        String[] fullDeck = new String[ranks.length * suits.length];
        int z = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                fullDeck[z++] = ranks[j] + suits[i];
                //fullDeck[i * ranks.length + j] = ranks[j] + suits[i];
            }
        }
        for (int i = 0; i < fullDeck.length; i++) {
            System.out.printf("%3s", fullDeck[i]);
        }

        int rndIndex = (int) (Math.random() * fullDeck.length);
        System.out.println("\n\n\nLetra: " + fullDeck[rndIndex]);
    }
}













