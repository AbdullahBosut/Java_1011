import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double kdv,tutar,kdvli;
        float toplamtutar;
        int fark;
        boolean oran;
        System.out.print("Ürün Fiyatını Giriniz:");
        tutar = scn.nextDouble();
        oran = tutar<=1000;
        kdv = (oran) ? 0.20 : 0.10;
        kdvli = tutar*kdv;
        toplamtutar = (float) (kdvli+tutar);
        fark= (int) (kdv*100);
        System.out.println("KDV Oranı:" + "%" + fark);
        System.out.println("KDV Farkı:" + kdvli);
        System.out.println("KDV'siz Fiyatı:" + tutar);
        System.out.print("Toplam Fiyat:" + toplamtutar);








    }
}
