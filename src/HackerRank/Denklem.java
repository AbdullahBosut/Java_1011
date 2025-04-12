package HackerRank;

import java.util.Scanner;

public class Denklem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,n;
        System.out.print("a: ");
        a = scn.nextInt();
        System.out.print("b: ");
        b = scn.nextInt();
        System.out.print("n: ");
        n = scn.nextInt();
        int j = 2;
        System.out.println(a+b);
        for (int i = 0; i<n; i++){
            //System.out.println(a+b);
            j*=2;

            System.out.println(a+((j*b)*n));

        }

    }
}
