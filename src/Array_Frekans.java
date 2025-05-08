import java.util.Arrays;

public class Array_Frekans {
    public static void main(String[] args) {
        int[] mlist = {4,5,6,7,4,2,1,5};
        Arrays.sort(mlist);
        System.out.println(Arrays.toString(mlist));
        int number = mlist[0];
        int count = 0;

        for (int i = 0; i<mlist.length; i++){
            if (number == mlist[i]) {
                count++;
            }else {
                System.out.println(number + " sayısı " + count + " kere tekrar edildi");
                number = mlist[i];
                count = 1;
            }
        }
        System.out.println(number + " sayısı " + count + " kere tekrar edildi");



    }
}