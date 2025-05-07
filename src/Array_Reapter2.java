public class Array_Reapter2 {
    static boolean isdou(int[] arr,int value){
        for (int o : arr){
            if (o == value){
                return true;
            }
        }
        return false;
    }
    // Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.
    public static void main(String[] args) {
        int[] mlist = {0,2,4,1,39,39,20,11,17,16,20,4,2,29,0,30};
        int[] dupi = new int[mlist.length];
        int start = 0;

        for (int i = 0; i<mlist.length; i++){
            for (int j = 0; j<mlist.length; j++){
                if (mlist[i] % 2 == 0){
                    if ((i != j) && (mlist[i] == mlist[j])){
                        if (!isdou(dupi,mlist[i])){
                            dupi[start++] = mlist[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int p : dupi){
            if (p != 0){
                System.out.println(" " + p);
            }

        }





    }
}
