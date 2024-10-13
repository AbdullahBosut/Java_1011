import java.util.Scanner;

public class Loop_Ortalama_Hesaplama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k;
        int bol = 0;
        int toplam= 0;

        System.out.print("Sayı Giriniz: ");
        k = scn.nextInt();
        System.out.print("3 ve 4'e Tam Bölünen Sayılar: ");
           for (int i=0;i<=k;i++){
               if (i %3 == 0 && i%4 == 0 ){
                   System.out.print(i+",");
                   toplam += i;
                   bol++;

               }
           }
        System.out.println();
        System.out.println("Toplam: "+toplam);
        System.out.println("Bölen: " + bol);
        System.out.println("Ortalama: " + toplam/bol);


    }
}
