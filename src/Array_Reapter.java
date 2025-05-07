import java.util.Arrays;

public class Array_Reapter {
    static boolean isfind(int[] arr,int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {12,24,15,12,10,8,2,10};
        int[] duplicate = new int[list.length];
        int startindex = 0;
        for (int i = 0; i<list.length; i++){
            for (int j = 0; j<list.length; j++){
                if ((i!=j) && (list[i] == list[j])){
                        if (!isfind(duplicate,list[i])) {
                            duplicate[startindex++] = list[i];
                        }
                        break;
                }
            }
        }
        for (int value : duplicate){
            if (value != 0){
                System.out.print(" "+value);
            }
        }
    }
}

