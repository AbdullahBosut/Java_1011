import java.util.Scanner;

public class Power {
    static int pow(int a,int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        return result;
    }
    static int non(int taban,int us) {
        if (us == 0) {
            return 1;
        }
        return taban*non(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(non(3,3));

    }
}
