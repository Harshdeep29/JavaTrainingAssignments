package Assignment_02_DiceGame;
import java.math.*;
public class Assignment2 {
    public static void main(String[] args) {

        int player1 = 0;
        int player2 = 0;
        int turn = 0;
        while (player1<50 && player2<50) {
            int rand = (int)(Math.random()*6)+1;
            if (turn==0){
                player1+=rand;
                System.out.println("Player 1 rolls the die: "+rand+" Total for Player "+player1);
                turn=1;
            }
            else if (turn==1){
                player2+=rand;
                System.out.println("Player 2 rolls the die: "+rand+" Total for Player "+player2);
                turn=0;
            }
        }

        if (player1>=50){
            System.out.println("Player 1 wins");
            System.out.println(player1 + " " + player2);
        }
        else if (player2>=50){
            System.out.println("Player 2 wins");
            System.out.println(player1 + " " + player2);
        }

    }
}
