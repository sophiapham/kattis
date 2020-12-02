package Easy;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ABC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //get the current positions
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();

        //sort them by size
        int pos1 = min(min(p1, p2), p3);
        int pos3 = max(max(p1, p2), p3);
        int pos2 = (p1+p2+p3)-pos1-pos3;

        //get the
        sc.nextLine();
        String abcOrder = sc.nextLine();

        //Print out the correct order
        switch (abcOrder) {
            case "ABC":
                System.out.println(pos1 + " " + pos2 + " " + pos3);
                break;
            case "ACB":
                System.out.println(pos1 + " " + pos3 + " " + pos2);
                break;
                case "BAC":
                System.out.println(pos2 + " " + pos1 + " " + pos3);
                break;
            case "BCA":
                System.out.println(pos2 + " " + pos3 + " " + pos1);
                break;
            case "CAB":
                System.out.println(pos3 + " " + pos1 + " " + pos2);
                break;
            case "CBA":
                System.out.println(pos3 + " " + pos2 + " " + pos1);
                break;
            default:
                System.out.println(":)");
        }
    }
}
