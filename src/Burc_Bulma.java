import java.util.Scanner;

public class Burc_Bulma {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ay,gun;
        System.out.print("Doğum Ayınızı Giriniz:");
        ay = scn.nextInt();
        System.out.print("Doğum Gününüzü Giriniz:");
        gun = scn.nextInt();
        boolean otuzbirgun = gun >= 1 && gun <= 31,
                yirmisekizgun = gun >= 1 && gun <= 28,
                otuzgun = gun >=1 && gun <= 30;

        if (ay == 1){   //Ocak  Oğlak Burcu : 22 Aralık - 21 Ocak
            if (otuzbirgun){
                if (gun <22){
                    System.out.println("Oğlak Burcu");
                }else {
                    System.out.println("Kova Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
        } else if (ay == 2) {  //Şubat  Kova Burcu : 22 Ocak - 19 Şubat
            if (yirmisekizgun){
                if (gun <20){
                    System.out.println("Kova Burcu");
                }else {
                    System.out.println("Balık Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
        } else if (ay == 3) {   //Mart  Balık Burcu : 20 Şubat - 20 Mart
            if (otuzbirgun){
                if (gun <21){
                    System.out.println("Balık Burcu");
                }else {
                    System.out.println("Koç Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 4) {   //Nisan   Koç Burcu : 21 Mart - 20 Nisan
            if (otuzgun){
                if (gun <21){
                    System.out.println("Koç Burcu");
                }else {
                    System.out.println("Boğa Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 5) {   //Mayıs  Boğa Burcu : 21 Nisan - 21 Mayıs
            if (otuzbirgun){
                if (gun <22){
                    System.out.println("Boğa Burcu");
                }else {
                    System.out.println("İkizler Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 6) {   //Haziran  İkizler Burcu : 22 Mayıs - 22 Haziran
            if (otuzgun){
                if (gun <23){
                    System.out.println("İkizler Burcu");
                }else {
                    System.out.println("Yengeç Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 7) {   //Temmuz  Yengeç Burcu : 23 Haziran - 22 Temmuz
            if (otuzbirgun){
                if (gun <23){
                    System.out.println("Yengeç Burcu");
                }else {
                    System.out.println("Aslan Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 8) {   //Ağustos  Aslan Burcu : 23 Temmuz - 22 Ağustos
            if (otuzbirgun){
                if (gun <23){
                    System.out.println("Aslan Burcu");
                }else {
                    System.out.println("Başak Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 9) {   //Eylül  Başak Burcu : 23 Ağustos - 22 Eylül
            if (otuzgun){
                if (gun <23){
                    System.out.println("Başak Burcu");
                }else {
                    System.out.println("Terazi Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 10) {  //Ekim  Terazi Burcu : 23 Eylül - 22 Ekim
            if (otuzbirgun){
                if (gun <23){
                    System.out.println("Terazi Burcu");
                }else {
                    System.out.println("Akrep Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 11) {  //Kasım  Akrep Burcu : 23 Ekim - 21 Kasım
            if (otuzgun){
                if (gun <22){
                    System.out.println("Akrep Burcu");
                }else {
                    System.out.println("Oğlak Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }
            
        } else if (ay == 12) {  //Aralık  Yay Burcu : 22 Kasım - 21 Aralık
            if (otuzbirgun){
                if (gun <22){
                    System.out.println("Kova Burcu");
                }else {
                    System.out.println("Oğlak Burcu");
                }
            }else {
                System.out.println("Geçersiz Bir Gün Girdiniz!!");
            }

        }else {
            System.out.println("Geçersiz Bir Ay Girdiniz!!!");
        }
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
         */
    }
}
