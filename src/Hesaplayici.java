import java.util.Scanner;

public class Hesaplayici {
    public static void main(String[] args) {
        int n1,n2,islem;
        Scanner scn = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        n1 = scn.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2 = scn.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Hangi İşlem Yapılacak: ");
        String hata = "Sıfıra Bölünemez!";

        islem = scn.nextInt();
        switch (islem){
            case 1:
                System.out.println("Toplamı: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarımı: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpımı: "+(n1*n2));
                break;
            case 4:
                String c = (n2==0) ? hata : "bölümü: "+ String.valueOf(n1/n2);
                System.out.println(c);
                break;
            default:
                System.out.println("Yalnış Seçim");
                break;
        }

    }
}
