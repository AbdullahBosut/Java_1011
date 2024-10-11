package HackerRank;

import java.util.Scanner;
/*
    * n tek ise, Weired | garip yazdırın
    * n çift ise ve 2 ila 5 kapsayıcı aralıktaysa, yazdır Garip Değil | Not Weired
    * n eşitse ve 6 ila 20 kapsayıcı aralıktaysa, Tuhaf yazdırın | Weired
    * n çift ve 20'den büyükse, yazdır Garip Değil | Not Weired
 */

public class Code_One_If {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        if (n >=1 && n<=100){
            if (n %2 != 0){
                System.out.println("Weired : Tek");
            } else if (n %2 == 0 && n>2 && n<5) {
                System.out.println("Not Weired : Çift");
            }else if (n > 6 && n < 20){
                System.out.println("Weired : Garip");
            } else if (n %2 == 0 && n > 20) {
                System.out.println("Not Weired : Çift");
            }else {
                System.out.println("weired");
            }

            System.out.println("Sayı Geçerli");
        }else {
            System.out.println("Sayı Geçersiz");
        }


    }
}
