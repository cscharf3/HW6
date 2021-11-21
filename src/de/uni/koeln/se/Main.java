package de.uni.koeln.se;

public class Main {

    public static void main(String[] args) {
        int card_num = Computer.start();
        System.out.println("card number of player_1: " +card_num);
        int card_num2 = Player_2.start();
        System.out.println("card number of player_2: " + card_num2);

        int winner = BetMore_Game.findWinner(card_num, card_num2);
        if(winner == 1){
            System.out.println("The winner is Player_1!");
        } else if(winner == 2){
            System.out.println("The winner is Player_2!");
        } else{
            System.out.println("tie!");
        }

    }
}
