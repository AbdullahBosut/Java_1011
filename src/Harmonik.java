import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int n;
        double x = 0.0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        n = scn.nextInt();
        /*

        // For Döngüsüyle
        for (double i = 1; i<=n; i++){
            x += (1.0/i);
        }

        // While Döngüsüyle
        double i = 1;
        while (i<=n){
            x += (1.0/i);
            i++;
        }

         */
        // Do While Döngüsüyle
        double m=1;
        do {
            x += (1.0/m);
            m++;

        }while (m<=n);

        System.out.println(x);


    }
}
