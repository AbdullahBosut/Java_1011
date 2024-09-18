import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("a sayısını giriniz ");
        a = in.nextInt();
        System.out.print("b sayısını giriniz ");
        b = in.nextInt();
        c = ((a*a)+(b*b));
        double karekok = Math.sqrt(c);
        System.out.println("hipotenus:"+c);
        System.out.print("a+b=c ");
        System.out.println(a+"+"+b+"+"+"="+karekok);
        System.out.println("karesi: "+karekok);
    }
}