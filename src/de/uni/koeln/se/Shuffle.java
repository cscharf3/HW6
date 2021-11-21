package de.uni.koeln.se;

import java.util.concurrent.ThreadLocalRandom;

public class Shuffle {
    public static int pick_card(){
        int card_number = ThreadLocalRandom.current().nextInt(0,
                50);
        return card_number;
    }
}
