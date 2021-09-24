package com.rishabh;

import java.util.Scanner;

public class NumDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        pyramid(num);
    }
    static void pyramid(int num){
        for (int row = 1; row <=2*num ; row++) {
            int totalColsInRow = row >num? 2 * num - row :row;
            for (int space = 0; space < num-totalColsInRow ; space++) {
                System.out.print("  ");
            }
            for (int col = totalColsInRow ; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=totalColsInRow; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
}
