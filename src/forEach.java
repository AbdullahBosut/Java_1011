public class forEach {
    public static void main(String[] args) {
        /*
        int list[] = {1,2,3,4,5};
        for (int i = 0; i<list.length; i++){
            System.out.println(list[i]);
        }
        int list2[] = {2,4,6,8,5};
        for (int a : list2){
            System.out.println(a);
        }


        String cars[] = {"Audi","Mercedes","BMW"};
        for (String a : cars){
            System.out.println(a);
        }


        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        for (int i =0; i<matris.length; i++){
            System.out.println();
            for (int m=0; m<matris[i].length; m++){
                System.out.print(matris[i][m]+" ");
            }

        }
        System.out.println();
        System.out.print("========");

        for (int[] a : matris){
            System.out.println();
            for (int b : a){
                System.out.print(b+" ");
            }
        }

         */
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}
