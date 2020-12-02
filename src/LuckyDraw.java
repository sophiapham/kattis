import java.util.Scanner;
// NOT FINISHED
public class LuckyDraw {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int livesOfEachPlayer = sc.nextInt();
        double probabilityOfHeads = sc.nextDouble();
        // For it to be draw: All remaining players need to have tails the last round

        double losingProbability = (double) livesOfEachPlayer * (1-probabilityOfHeads);

        double probabilityOfDraw = losingProbability / (double) players;

        //TODO case 1
        //p1 p2
        //tail tail 0.5 * 0.5 , 4 kombinationer
        //tail tail 0.5 * 0.5
        // 1 / 5.4000000054 = probabilityOfDraw;

        //totalt 11 utfall per games

        //total combinations: 2^n
        //total combinations to further the game: 2^n-1, where n is players
        //-1 represent the case where all players have head

        //tail tail
        //tail head

        //tail tail
        //head tail

        //head tail
        //tail head
        //tail head

        //tail head
        //head tail
        //head tail

        //tail head
        //head tail
        //tail head

        //head tail
        //tail head
        //head tail

        //tail head
        //tail head

        //head tail
        //head tail

        //fall 1 / game
        //tail tail 0.25
        //tail tail 0.25
//+
        //fall 2 / game
        //head tail 0.25
        //tail head 0.25
        //tail tail 0.25
//+
        //fall 3 / game
        //tail head 0.25
        //head tail 0.25
        //tail tail 0.25

        //fall1/antamöjligafall + fall2/antamöjigafall + fall3/antalmöjligafall

        //TODO case 2
        //p1 p2
        //tail tail 0.2
        //tail tail 0.2


        //TODO case 3
        //p1 p2 p3 p4 p5
        //tail tail tail tail tail 0.15
        //tail tail tail tail tail 0.15
        //tail tail tail tail tail 0.15


        // /sannolikhetenFörTailsFörAlla


        System.out.println(probabilityOfDraw);

    }
}

