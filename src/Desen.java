import java.util.Scanner;

public class Desen {

    static void recursive(int n,int b){
        if(n <=0){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        recursive(n-5,b);

        if (n != b){
            System.out.println(n + 5);

        }


    }


    /*
    static void rev(int a,int b){
        if (a<=0){
            System.out.println(a);
            return;
        }
        System.out.print(a);
        System.out.print(" ");
        if (a!=b){
            System.out.print(a+5);
            System.out.print(" ");

        }
        rev(a-5,b);

    }

     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scn.nextInt();
        recursive(n,n);
        //rev(n,n);
        scn.close();
        //16-11-6-1-(-4)-1-6-11-16

    }
}
