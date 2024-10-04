import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,nottop=0,sayi=0;
        Scanner scn = new Scanner(System.in);
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        System.out.println("Ders Notlarınızı 0 ve 100 arasında Giriniz Aksi Halde Ders ve Not Ortalamaya Katılmayacaktır.");
        System.out.print("Matematik Notunuzu Giriniz:");
        mat = scn.nextInt();
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = scn.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = scn.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = scn.nextInt();
        System.out.print("Muzik Notunuzu Giriniz:");
        muzik = scn.nextInt();
        if (mat>0 && mat<=100){
            nottop+=mat;
            sayi++;
        }
        if (fizik>0 && fizik<=100){
            nottop+=fizik;
            sayi++;
        }
        if (turkce>0 && turkce<=100) {
            nottop+=turkce;
            sayi++;
        }
        if (kimya>0 && kimya<=100) {
            nottop+=kimya;
            sayi++;
        }
       if (muzik>0 && muzik<=100) {
            nottop+=muzik;
            sayi++;
        }

       double ortalama = nottop/sayi;
       if (ortalama>=55){
           System.out.println("Tebrikler Geçtiniz.");

        }else {
           System.out.println("Sınıfta Kaldınız.");
       }
        System.out.println("Not Ortalamanız:"+ortalama);


    }
}
