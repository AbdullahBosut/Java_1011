package Mines;

import java.util.Random;
import java.util.Scanner;

public class Mines_Swepper {
    int rownumber = 4,columnumber=4,size,success=0;
    int[][] map;
    int[][] board;
    boolean game = true;
    Random random = new Random();
    Scanner scn = new Scanner(System.in);

    Mines_Swepper(int rownumber,int columnumber){
        this.rownumber = rownumber;
        this.columnumber = columnumber;
        this.map = new int[rownumber][columnumber];
        this.board = new int[rownumber][columnumber];
        this.size = rownumber*columnumber;

    }
    void run(){
        prepaerGame();
        int row,col;
        print(map);
        System.out.println("Oyun Başladı !");
        while (game){
            print(board);
            System.out.print("Satır: ");
            row = scn.nextInt();
            System.out.print("Sutun: ");
            col = scn.nextInt();
            if (row < 0 || row > rownumber){
                System.out.println("Hatalı Kordinat Girdiniz.");
                continue;
            }
            if (col < 0 || col > columnumber){
                System.out.println("Hatalı Kordinat Girdiniz.");
                continue;
            }
            if (map[row][col] != -1){
                chechMines(row,col);
                success++;
                if (success == (size-(size/4))){
                    System.out.println("Tebrikler Kazandınız..");
                }
            }else {
                game = false;
                System.out.println("Oyun Bitti !");
                System.out.println("Kaybettiniz.");
            }

        }
    }
    void prepaerGame(){
        int randRow,randCol,count=0;
        while (count != (size/4)){
            randRow = random.nextInt(rownumber);
            randCol = random.nextInt(columnumber);
            if (map[randRow][randCol] !=1 ){
                map[randRow][randCol] = -1;
                count++;
            }

        }
    }
    void print(int[][] arr){
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j< arr[0].length; j++){
                if (arr[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
    void chechMines(int row,int col){
        if (map[row][col] == 0){
            if ((col < columnumber-1)&&(map[row][col+1] == -1)){
                board[row][col]++;
            }
            if ((row < rownumber-1)&&(map[row+1][col] == -1)){
                board[row][col]++;
            }
            if ((row > 0)&&(map[row-1][col] == -1)){
                board[row][col]++;
            }
            if ((col > 0)&&(map[row][col-1] == -1)){
                board[row][col]++;
            }
            if (board[row][col] == 0 ){
                board[row][col] = -2;
            }
        }

    }
}
