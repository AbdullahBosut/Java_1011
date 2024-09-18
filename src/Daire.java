import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14,alan,cevre,dilim;
        Scanner scn = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz: ");
        r = scn.nextInt();
        System.out.print("Merkez Açı Ölçüsüni Giriniz: ");
        a = scn.nextInt();
        alan = pi*r*r;
        System.out.println("Dairenin Alanı:" + alan);
        cevre = 2*pi*r;
        System.out.println("Dairenin Çevresi:" + cevre);
        //Ödev
        dilim = (pi*(r*r)*a)/360;
        System.out.println("Daire Dilimin Alanı: "+dilim);



    }
}
