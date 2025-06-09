import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sayi_Tahmin {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        Scanner scn = new Scanner(System.in);

        int right = 0;
        int input;
        int[] wrong = new int[5];
        int i = 0;
        boolean iswin = false;
        while (right<5){
            System.out.print("Bir Sayı Giriniz: ");
            input = scn.nextInt();
            if (input < 0 || input > 99){
                System.out.println("0-100 arasında değer giriniz!!!!!");
                continue;
            }
            if (input == number){
                iswin = true;
                System.out.println("Tebrikler Doğru Tahmin!!!");
                System.out.println("Tahmin Ettiğiniz Sayı: " + number);
                break;
            }else {
                wrong[right] = input;

                System.out.println("Hatalı Bir Sayı Girdiniz !");
                if (input>number){
                    System.out.println(input + " sayısı, tahmin edilen sayıdan büyüktür. ");
                }else {
                    System.out.println(input + " sayısı, tahmin edilen sayıdan küçüktür. ");
                }
                right++;
                System.out.println("Kalan Hakkı : "+ (5-right));

            }
        }
        if (!iswin){
            System.out.println("Kaybettiniz !!!");
            System.out.println("Tahmin Edilecek: " + number);
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}