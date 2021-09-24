package com.rishabh;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        Diamod(num);
    }
    static void Diamod (int num){
        for (int row = 0; row < 2 * num; row++) {
            int totalColsInRow = row >num? 2 * num - row :row;

            int NumOfSpaces = num -totalColsInRow;
            for (int space = 0; space < NumOfSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow  ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
