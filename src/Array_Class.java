import java.util.Arrays;

public class Array_Class {
    public static void main(String[] args) {
        int[] a = {1,5,6,7,8,9};
        double[] b = {1.5,2.5,4.5,8.5};
        int[] dn = {1,8,-9,11,36,45,85,90,14,13,22,38,33,44};
        Arrays.sort(dn);
        int[] db = Arrays.copyOf(dn,dn.length);
        System.out.println(Arrays.binarySearch(db,11));
        System.out.println(Arrays.toString(dn));
        System.out.println(Arrays.toString(db));
        /*
        Helper_Array m = new Helper_Array();
        m.print(a);
        System.out.println();
        m.print(b);
        Arrays.fill(b,22); // boşlukları dolduran metod bütün diziyi bir değere dönüştürüyor
        Arrays.fill(a,1,4,5); // sayı aralğındaki dizileri belirlenen değer yapar
        Arrays.sort(a); //bu metod ile diziyi küçükten büyüğe sıralar
        System.out.println();
        System.out.println(Arrays.toString(a)); // bu metod dizideki bütün elemanları geziyor ekrana bastırıyor
        System.out.println(Arrays.toString(b));

         */

        System.out.println(Arrays.toString(dn));
        System.out.println(Arrays.binarySearch(dn,22));
    }
}
