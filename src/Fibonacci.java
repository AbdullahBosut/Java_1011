import java.util.Scanner;
/*
   fi + a = t      0+1=1
   a + t = fi      1+1=2
   fi + t = a      1+2=3
                   2+3=5
                   3+5=8
                   5+8=13
                   8+13=21
                   13+21=34
 */

public class Fibonacci {
    public static void main(String[] args) {
       int fi = 0;
       int a = 1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Fibonnaci Serisinin Eleman Sayısını Giriniz: ");
        int n = scn.nextInt();
        System.out.println("0"+"+"+"0"+"="+"0");
        for (int i = 1; i<=n; i++){
            int t = a+fi; //1
            //System.out.println(t+" ");
            System.out.println(a+"+"+fi+"="+t);
            a = fi;
            fi = t;


        }
    }
}
