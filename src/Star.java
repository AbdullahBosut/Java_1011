import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n = scn.nextInt();
        int y;
        for (int i = 0; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (y = 1; y <= (2 * i) - 1; y++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n-1; i >= 0; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (y = 1; y <= (2 * i) - 1; y++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

