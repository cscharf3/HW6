package de.uni.koeln.se;
import java.util.concurrent.ThreadLocalRandom;

public class Player_2 {
    public static int start(){
        boolean user_selected = false;
        System.out.println("joining game");
        int i=1;
        int card_num = BetMore_Game.play();
        while(i<=5 && !user_selected){
            System.out.println("player_2 wants a new card");
            int temp = ThreadLocalRandom.current().nextInt(0,1);
            if(temp == 0){
                user_selected = false;
            } else{
                user_selected =true;
            }
            card_num = BetMore_Game.play();
            i++;
        }
        System.out.println("card is picked");
        return card_num;
    }
}
