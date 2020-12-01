import java.util.Scanner;

public class LuckyDraw {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int livesOfEachPlayer = sc.nextInt();
        double probabilityOfHeads = sc.nextDouble();
        double result = 0; //when ends in a draw

        //if tails then -life
        //if 1 players then win
        //if all players lose in same round then draw
        //if winner then win n*bet
        //if draw then no win (all bets lost)

        System.out.println(result);

    }
}

