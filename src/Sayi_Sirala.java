import java.util.Scanner;

public class Sayi_Sirala {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.print("A Sayısı: ");
        a = scn.nextInt();
        System.out.print("B Sayısı: ");
        b = scn.nextInt();
        System.out.print("C Sayısı: ");
        c = scn.nextInt();

        if (a < b && a < c){
            if (b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        } else if (b<a && b<c) {
            if (a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }
        }else {
            if (b<a){
                System.out.println("c<b<a");
            }else{
                System.out.println("c<a<b");
            }
        }


    }
}
