import java.util.Scanner;

public class Heat {
    public static void main(String[] args) {
        int heat;
        Scanner scn = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz:");
        heat = scn.nextInt();
        /*
            Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
            Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
            Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
            Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */
        if (heat<5){
            System.out.println("Kayak Yapabilirsin");
        } else if (heat >=5 && heat <= 15) {
            System.out.println("Sinemaya Gidebilirsin");
        } else if (heat>15 && heat <=25) {
            System.out.println("Piknik Yapabilirsin");
        } else {
            System.out.println("Denizde Yüzebilirsin");
        }


    }
}
