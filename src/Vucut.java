import java.util.Locale;
import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        double boy,kitle;
        int kilo;
        Scanner scn = new Scanner(System.in);
        scn.useLocale(new Locale("tr","TR"));
        System.out.print("Lütfen Boyunuzu (metre cinsinden) giriniz: ");
        boy = scn.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = scn.nextInt();
        kitle = kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: "+kitle);

    }
}
