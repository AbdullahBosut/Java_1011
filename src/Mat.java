import java.util.Scanner;

public class Mat {
    //EBOB EKOK
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1,n2;
        int ebob = 1;
        System.out.print("N1 sayısını giriniz: ");
        n1 = scn.nextInt();
        System.out.print("N2 sayısını giriniz: ");
        n2 = scn.nextInt();
        for (int i = n1; i>=1; i--){
            if (n1%i == 0 && n2%i == 0){
                System.out.println("ebob " + i );
                break;
            }
        }
        //EKOK
        /*
        for (int i = 1; i <= (n1*n2); i++){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("ekok"+i);
                break;
            }
        }

         */
        int a = 1;
        boolean b = a <= (n1*n2);
        while (b){
            a++;
            if (a % n1 == 0 && a % n2 == 0){
                System.out.println("ekok"+a);
                break;
            }

        }


        /*
        for (int i = 1; i<=n1; i++){
            //System.out.println(i);
            if (n1%i ==0 && n2%i ==0){
                ebob = i;
            }
        }
        System.out.println(ebob);

         */
        int x = 1;
        boolean kn = x<=n1;
        while (kn){
            x++;
            if (n1%x ==0 && n2%x == 0){
                ebob = x;
                break;
            }
            System.out.println(ebob);
        }

    }
}
