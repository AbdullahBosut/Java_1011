package HackerRank;

import java.util.Scanner;

public class ForMath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        n = scn.nextInt();
        for (int i = 1;i<=10; i++){
            int m = n*i;
            System.out.println(n +" x "+ i +" = "+ m);
        }


    }
}
