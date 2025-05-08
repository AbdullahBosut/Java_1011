package HackerRank;

import java.util.Scanner;

public class Array_odev_hack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] mlist = new int[n];
        for (int i = 0; i<n; i++){
            int m = scn.nextInt();
            mlist[i] = m;

        }
        scn.close();

        for (int y : mlist){
            System.out.println(y);
        }


    }



}
