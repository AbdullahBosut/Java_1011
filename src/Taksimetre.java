import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km,minkm;
        boolean min;
        double tututar,siftah,kmfiyat,s;
        Scanner scf = new Scanner(System.in);
        System.out.print("Kaç KM Yol: ");
        km = scf.nextInt();
        kmfiyat = 2.20;
        siftah = 10;
        minkm = 20;
        min = km<5;
        //int minn = (min) ? 5 : km;
        tututar = (km*kmfiyat)+siftah;
        s = (min) ? minkm : tututar;
        System.out.println("ToplamTutar: " + s);
    }
}
