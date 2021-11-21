package de.uni.koeln.se;
import java.util.concurrent.ThreadLocalRandom;

public class BetMore_Game {
    public static int play(){
        int card_number = Shuffle.pick_card();
        System.out.println("picking a card");
        return card_number;
    }
    public static int findWinner(int cardnum1, int cardnum2){
        System.out.println("The winner is...");
        if(cardnum1 < cardnum2){
            return 2;
        } else if(cardnum1> cardnum2){
            return 1;
        } else return 0;
    }
}
