package Mines_Patika;

import java.util.Random;
import java.util.Scanner;

public class Mineswepper {
    Random random = new Random();
    Scanner scn = new Scanner(System.in);
    String[][] map;
    String[][] board;
    boolean game = true;
    int rowNumber,colNumber,size,success=0,opp=1;

    Mineswepper(int rowNumber,int colnumber){
        this.rowNumber = rowNumber;
        this.colNumber = colnumber;
        this.map = new String[rowNumber][colnumber];
        this.board = new String[rowNumber][colnumber];
        this.size = rowNumber*colnumber;
    }
    void run(){
        int row,col;
        sprint(map);
        sprint(board);
        preaperGame();
        System.out.println("Mayınların Konumu ");
        dprint(map);
        System.out.println("Oyun Başladı !");
        while (game) {
            dprint(board);
            System.out.print("Satır: ");
            row = scn.nextInt();
            System.out.print("Sutun: ");
            col = scn.nextInt();
            if (row < 0 || row > rowNumber){
                System.out.println("Hatalı Kordinat Girdiniz.");
                continue;
            }
            if (col < 0 || col > colNumber){
                System.out.println("Hatalı Kordinat Girdiniz.");
                continue;
            }
            if (!map[row][col].equals("*")){
                checkMines(row,col);
                success++;
                if (success == (size-(size/4))){
                    System.out.println("Tebrikler Kazandınız..");
                    break;
                }
            }else {
                game = false;
                System.out.println("Oyun Bitti !");
                System.out.println("Kaybettiniz.");
            }
        }

    }

    void dprint(String[][] drr){
        for (int i = 0; i<drr.length; i++){
            for (int j = 0; j<drr[0].length; j++){
                if (drr[i][j].equals("-") && !drr[i][j].equals("-"))
                    System.out.print(" ");
                System.out.print(drr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void checkMines(int row,int col){
            if (map[row][col].equals("-")){
                if ((col < colNumber-1) && (map[row][col+1]).equals("*")){
                    opp = 1;
                    board[row][col] = String.valueOf(opp++);

                }
                if ((row < rowNumber-1)&&(map[row+1][col].equals("*"))){
                    opp = 1;
                    board[row][col] = String.valueOf(opp++);
                }
                if ((row > 0)&&(map[row-1][col].equals("*"))){
                    opp = 1;
                    board[row][col] = String.valueOf(opp++);
                }
                if ((col > 0)&&(map[row][col-1].equals("*"))){
                    opp = 1;
                    board[row][col] = String.valueOf(opp++);
                }
                if (board[row][col].equals("-")){
                    board[row][col] = "-2";
                }
            }
    }
    void preaperGame(){
        int randRow,randCol,count = 0;
        while (count != (size/4)){
            randRow = random.nextInt(rowNumber);
            randCol = random.nextInt(colNumber);
            if (!map[randRow][randCol].equals("1")){
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }
    void sprint(String[][] drr){
        for (int i = 0; i<drr.length; i++){
            for (int j = 0; j<drr[0].length; j++){
                drr[i][j] = "-";
            }

        }
    }






}
