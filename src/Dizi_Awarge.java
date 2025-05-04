public class Dizi_Awarge {
    public static void main(String[] args) {
        int[] my = {2,3,4,5};
        double avarge = 0.0;

        for (int i = 0; i<my.length; i++){
            avarge += (1.0/my[i]);
            }
        System.out.println(my.length/avarge);



    }
}
