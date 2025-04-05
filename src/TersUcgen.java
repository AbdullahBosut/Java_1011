import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        int y = 0;
        System.out.print("Basamak Sayısını Giriniz: ");
        n = scn.nextInt();
        for (int i = n-1; i >= 0; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("");
            }
            for (y = 1; y <= (2 * i) - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
