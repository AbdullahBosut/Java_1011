import java.util.Arrays;
import java.util.Scanner;

public class Array_Max {
    public static void main(String[] args) {
        int[] mylist = {56,34,1,8,101,-2,-33};
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi: " +Arrays.toString(list));
        Scanner scn = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int inp = scn.nextInt();
        /*
        5 e kadar sayacak sonra duracak gösterecek
         */
        Arrays.sort(list);
        int min = list[0];
        int max = list[0];
        for (int m : list){
            /*
            if (m<min)
                min = m;
            if (m>max)
                max = m;

             */
            if (m<inp){
                min = m;
            }
            if (m>inp){
                max = m;
                break;
            }
        }
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maximum Değer: " + max);
    }
}
