import java.util.Scanner;

public class Donguler {
    public static void main(String[] args) {
        /*
        int left = 100,right = 200;
        while (++left < --right);
        System.out.println("100 ile 200'ün Ortası: " + left);

        int password;
        boolean online = false;
        Scanner scn = new Scanner(System.in);

        while (!online){
            System.out.print("Şifre Giriniz: ");
            password = scn.nextInt();
            if (password == 123){
                System.out.println("Doğru");
                online = true;
            }else {
                System.out.println("Yanlış");
            }
        }

        do {
            System.out.print("Şifre Gir: ");
            password = scn.nextInt();
            if (password == 244){
                System.out.println("Doğru");
                online = true;
            }else {
                System.out.println("Yanlış");
            }
        }while (!online);

        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }

         */
        /*
        for (int sayac = 0; sayac <= 10; sayac++){
            System.out.println("sayac: "+ sayac);
        }
        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
        int s = 0;
        while (s <=10){
            s++;
            if (s %2 == 0){
                continue;
            }
            System.out.println(s);
        }

         */

        for (int i = 1; i <= 2; ++i) {

            for (int j = 1; j < 4; ++j) {

                if (i == 1) continue;

                System.out.println(i + j);

            }

        }
        for (int k = 0; k < 9; k++) {

            System.out.print("*");

            if (k == 3)

                break;

        }




    }
}
