import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number;
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        number = scn.nextInt();
        int basnum = 0,
        tepmnumber=number,
        basvalue,
        us,
        result = 0;

        while (tepmnumber != 0){
            tepmnumber /=10;
            basnum++;
        }
        //System.out.println(basnum);
        tepmnumber=number;
        while (tepmnumber!=0){
            basvalue=tepmnumber%10;
            us = 1;
            for (int i=1;i<=basnum;i++){
                us *= basvalue;
            }
            result+=us;
            tepmnumber/=10;
        }

        if (result == number){
            System.out.println(number+" Sayısı bir armstrong sayıdır.");
        }else {
            System.out.println(number+" Sayısı armstrong değildir.");
        }


    }
}
