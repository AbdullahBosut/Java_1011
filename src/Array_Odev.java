import java.util.Arrays;
import java.util.Scanner;

public class Array_Odev {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int n = scn.nextInt();
        int count = 1;


        int[] mlist = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print(count+".eleman: ");
            int a = scn.nextInt();
            count++;
            mlist[i] = a;
        }
        Arrays.sort(mlist);
        System.out.println(Arrays.toString(mlist));


    }
}
