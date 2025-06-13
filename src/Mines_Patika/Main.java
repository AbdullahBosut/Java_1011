package Mines_Patika;

import Mines.Mines_Swepper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row,column;
        System.out.println("Mayın Tarlasına Hoşgeldiniz !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oyunu Oynamak İstediğiniz Boyutu giriniz!");
        System.out.print("Satır Sayısı: ");
        row = scanner.nextInt();
        System.out.print("Sutun Saysısı: ");
        column = scanner.nextInt();
        Mineswepper swepper = new Mineswepper(row,column);
        swepper.run();
    }
}
