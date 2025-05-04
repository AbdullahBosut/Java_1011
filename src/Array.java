public class Array {
    public static void main(String[] args) {
        //String[] F = new String[32];
        /*
        int[] list = new int[10];
        for (int i = 0; i<list.length; i++){
            System.out.println("i: " + i);
            list[i] = (i+1)*10;
            //list[i] = i*10+10;
            System.out.println(list[i]);
        }
        int cars[], count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++) {
            System.out.print(cars[j] + ",");
        }

         */
        int[] list = new int[5]; // Tek boyutlu dizi
        int[] list2 = {1,2,3,4,5,6};
        int number = 1;
        //int[][] matris = new int[6][6]; //ilk parantez satır sayısı  //2.ci parantez sutun sayısı
       // matris[0][0] = 0;
       // matris[2][3] = 839;
       // System.out.println(matris[2][3]);
        int[][] matris = new int[3][4];
        for (int i = 0; i< matris.length; i++){
            //System.out.println(matris[i].length);
            for (int j = 0; j<matris[i].length; j++){
                matris[i][j] = number++;
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(matris[2][3]);
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                arr[i][j] = j + 1;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i + 1; ++j)
                sum += arr[i][j];
        System.out.print(sum);









    }








}
