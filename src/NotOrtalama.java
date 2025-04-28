import java.util.Scanner;


public class NotOrtalama{
    public static void main(String[] args) {
        //Değişkenler
        int mat,fizik,kimya,turkce,tarih,resim;
        double nottop;
        Scanner scan = new Scanner(System.in);
        System.out.print("Türkçe Notunuzu girin:");
        turkce = scan.nextInt();
        System.out.print("Matematik Notunuzu girin:");
        mat = scan.nextInt();
        System.out.print("Tarih Notunuzu girin:");
        tarih = scan.nextInt();
        System.out.print("Resim Notunuzu girin:");
        resim = scan.nextInt();
        System.out.print("Fizik Notunuzu girin:");
        fizik = scan.nextInt();
        System.out.print("Kimya Notunuzu girin:");
        kimya = scan.nextInt();
        nottop = (double) (turkce + mat + tarih+ resim + fizik + kimya) /6;
        System.out.println("Not Ortalamanız:"+nottop);
        double gecti = 60;
        boolean sonuc = nottop>=gecti;
        String gectimi = (sonuc) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectimi);

    }
}