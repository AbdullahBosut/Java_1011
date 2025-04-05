import java.util.Scanner;

public class ForOdev {
    /*
    Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        int sayi;
        int kucuk=Integer.MAX_VALUE;
        int buyuk=Integer.MIN_VALUE;
        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        n = scn.nextInt();
        for (int i = 1; i<=n;i++){
            System.out.print(i+".Sayıyı Giriniz: ");
            sayi = scn.nextInt();
            if (sayi>buyuk){
                buyuk = sayi;
            }
            if (sayi<kucuk){
                kucuk = sayi;
            }
        }
        System.out.println("Büyük Sayı: "+buyuk);
        System.out.println("Küçük Sayı: "+kucuk);

    }
}
