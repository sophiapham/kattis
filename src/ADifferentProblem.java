import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLong()) {
            Long tmp1 = sc.nextLong();
            Long tmp2 = sc.nextLong();
            Long maxValue = Math.max(tmp1, tmp2);
            Long minValue = Math.min(tmp1, tmp2);
            Long result = maxValue - minValue;
            System.out.println(result);
        }
    }
}

