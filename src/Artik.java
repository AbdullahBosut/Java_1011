import java.util.Scanner;

public class Artik {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int years=0;
        System.out.print("Yıl Giriniz: ");
        if (scn.hasNextInt()){
            years = scn.nextInt();
            scn.close();
            if (years%4==0){
                System.out.println(years+" Artık Yıldır");
            }else if (years%4==0 && years%400==0) {
                System.out.println(years+" Artık Yıldır");
            } else {
                System.out.println(years+" Artık Yıl Değildir");
            }
        }else {
            System.out.println("Hatalı Giriş");
        }
    }
}
