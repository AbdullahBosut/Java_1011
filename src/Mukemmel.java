import java.util.Scanner;

public class Mukemmel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int x = scn.nextInt();
        int n = 0;
        for (int i = 1; i<x; i++){
            if (x%i==0){
                n+=i;

            }
        }
        if (x == n){
            System.out.println("Mukkemel Bir Sayıdır.");
        }else {
            System.out.println("Mukemmel Bir Sayı Değildir.");
        }
    }
}
