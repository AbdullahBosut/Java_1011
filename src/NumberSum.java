import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {

    /*
          kullanıcadan bir sayı alınacak basamaklar toplanıcak
          kullanıcıdan alınan sayı 10 a bolunecek sonrasında mod 10 alınarak sayılar elde edinip toplanıcak
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = 0, fx = 0, top = 0;
        number = scanner.nextInt();
        number *= 10;
        while (number != 0) {
            number /= 10;
            fx = number % 10;
            //System.out.println(admin);
           /*
            for (int i=0;i<1;i++){
                fx = admin%10;
                System.out.println(fx);
            }

            */
            top += fx;
        }

        System.out.println("toplam: " + top);
    }
}

