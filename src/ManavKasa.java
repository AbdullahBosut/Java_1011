import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        int armutk,elmak,domak,muzk,patlk;
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5,top;
        Scanner snc = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?: ");
        armutk = snc.nextInt();
        System.out.print("Elma Kaç Kilo ?: ");
        elmak = snc.nextInt();
        System.out.print("Domates Kaç Kilo ?: ");
        domak = snc.nextInt();
        System.out.print("Muz Kaç Kilo ?: ");
        muzk = snc.nextInt();
        System.out.print("Patlıcan Kaç Kilo ?: ");
        patlk = snc.nextInt();
        top = (armut*armutk)+(elma*elmak)+(domak*domates)+(muz*muzk)+(patlk*patlıcan);
        System.out.println("Toplam Tutar : "+top+" TL");
    }
}
