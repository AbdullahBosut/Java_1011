import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3,alan,kare;
        Scanner scn = new Scanner(System.in);
        System.out.print("1.Kenar:");
        kenar1 = scn.nextDouble();
        System.out.print("2.Kenar:");
        kenar2 = scn.nextDouble();
        System.out.print("3.Kenar:");
        kenar3 = scn.nextDouble();
        kare = (kenar1+kenar2+kenar3)/2;
        alan = Math.sqrt(kare*(kare-kenar1)*(kare-kenar2)*(kare-kenar3));
        System.out.println("alan: " + alan);
    }
}
