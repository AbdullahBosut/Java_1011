import java.util.Scanner;

public class Asal_Recu {
    static int asap(int sayi,int bolen) {
        /*if (a%2!=0){
            System.out.println("Bu Sayı Asal Bir Sayıdır");
        }

         */
        if (sayi < 2){
            System.out.println(sayi+" Sayısı Asal Değildir");
            return 0;
        }
        if (sayi == bolen){
            System.out.println(sayi+" Sayısı Asal Sayıdır");
            return 1;
        }
        if (sayi%bolen == 0){
            System.out.println(sayi+" Sayısı Asal Değildir");
            return 0;
        }
        return asap(sayi,bolen+1);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int a = scn.nextInt();
        asap(a,2);
    }
}
