import java.util.Scanner;

public class Fly_Calculator {
    /*
            Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
            Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
            Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
            * cocuk 12 yas altı
            * genç 12-24 yaş arası
            * yetişkin indirim yok 24-65 arası
            * yaşlı 65 yaş büyük indirim
            * aktarmalı 0.20 indirim
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int kkm,yas,donus,toptututar;
        double cocuk = 0.50,genc = 0.10,yasli = 0.30,donuslu = 0.20,normtutar,fiyat = 0.10,indirimli = 0;
        boolean kmkosull,option;
        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        kkm = scn.nextInt();
        kmkosull = (kkm>0);
        System.out.print("Yaşınızı Giriniz: ");
        yas = scn.nextInt();
        System.out.print("Yolculuk tipini Giriniz(1 => Tek Yön, 2 => Gidiş Dönüş:) ");
        donus = scn.nextInt();
        option = (donus == 1 || donus == 2);

        if (kmkosull && option){
            normtutar = kkm*fiyat;

            if (yas<12){
                indirimli = normtutar-(normtutar*cocuk);

            } else if (yas>=12 && yas<=24) {
                indirimli = normtutar-(normtutar*genc);

            } else if (yas>65) {
                indirimli = normtutar-(normtutar*yasli);

            }else {
                indirimli = normtutar;
            }
        }else {
            System.out.println("hatalı Giriş");
        }
        if (donus==2){
            indirimli = 2*(indirimli-(indirimli*donuslu));
            System.out.println("Toplam Tutar: " + indirimli);
        }else {
            System.out.println("Toplam Tutar: "+indirimli);
        }



    }
}
