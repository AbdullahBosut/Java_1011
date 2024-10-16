import java.util.Scanner;

public class Loop_Kuvvet_Alma {
    public static void main(String[] args) {
        int b=4,x,y=5;
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        x = scn.nextInt();

        System.out.print("4'ün Kuvvetleri: ");

        for (int i = 1;i<=x; i*=4){
            System.out.print(i+",");
        }

        System.out.println();
        System.out.print("5'in Kuvvetleri: ");

        for (int i = 1;i<=x; i*=5){
            System.out.print(i+",");
        }


    }
}
