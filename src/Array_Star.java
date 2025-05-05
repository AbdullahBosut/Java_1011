public class Array_Star {
    public static void main(String[] args) {
        String[][] letter = new String[9][4];

        for (int i = 0; i<letter.length; i++){
            for (int j = 0; j<letter[i].length; j++){
                letter[i][j] = "   ";
                if (j == 0) {
                    letter[i][j] = " * ";
                }if (j == 3){
                    letter[i][j] = " * ";
                    letter[0][j] = "";
                    letter[4][j] = "";
                    letter[8][j] = "";
                } if (i == 0 || i == 4 || i == 8){
                    letter[i][j] = " * ";
                    letter[i][3] = "";
                }

            }
        }

        for (String[] row: letter){
            for (String column : row){
                System.out.print(column);
            }
            System.out.println();
        }
        /*
            *  *  *
            *        *
            *        *
            *        *
            *  *  *
            *        *
            *        *
            *        *
            *  *  *

         */





    }



}
