import java.util.Scanner;

public class Uslu_Sayilar {
    public static void main(String[] args) {
        int n,k,s;
        Scanner scn = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı:");
        n = scn.nextInt();
        System.out.print("Üs Sayısı:");
        k = scn.nextInt();
        s = n;
        /*
        while (m<k){
            n*=s;
            m++;
        }
        System.out.println(n);

         */
        for (int m=1;m<k;m++){
            n*=s;
        }
        System.out.println(n);

    }
}
