package de.uni.koeln.se;

public class Computer {
    public static int start(){
        System.out.println("Start game");
        int card_number = BetMore_Game.play();
        return card_number;
    }
}
