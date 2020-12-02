package Easy;

import java.util.Scanner;

public class SimonSays {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sentences = sc.nextInt();
        sc.nextLine();
        String output  = "";
        for(int i = 0; i < sentences; i++){
            String tmp = sc.nextLine();
            if(tmp.length() > 10 && tmp.substring(0, 10).equals("simon says")){
                output = output + tmp.substring(11) + "\n";
            }
            else {
                output = output + "\n";
            }
        }
        System.out.print(output);
    }
}
