package com.rishabh;

import java.util.Scanner;

public class Half_Butterfly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        halfButter(num);
    }
    static void halfButter(int num){
        for (int row = 0; row < 2 *num; row++) {
            int totalColsInRow = row >num? 2 * num - row :row;
            for (int col = 0; col < totalColsInRow  ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
