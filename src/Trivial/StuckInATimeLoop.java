package Trivial;

import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 0;
        while(input > i){
            i++;
            System.out.println(i + " Abracadabra");
        }

    }
}