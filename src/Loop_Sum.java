import java.util.Scanner;

public class Loop_Sum {
    public static void main(String[] args) {
        int x = 0;
        int total = 0;
        Scanner scn = new Scanner(System.in);
        boolean run = true;

        do {
            System.out.print("Sayı Giriniz: ");
            x = scn.nextInt();
            if (x%2==1 || x%2==-1){
                run = false;
            }else if (x%2==0 && x%4==0){
                System.out.println("Çift sayı ve dört ün katı");
                total+=x;
                System.out.println("Toplam Sayı: "+ total);
            } else if (x%2==0) {
                //System.out.println("Sadece Çift sayı");
            }
        }while (run);
    }
}
