package com.rishabh;

import java.util.Scanner;

public class InvertLeftTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        invertT(num);
    }
static void invertT(int num){
    for (int row = 1; row <=num; row++) {

        for (int space = 1; space <= row; space++) {
            System.out.print(" ");
        }
        for (int col = 1; col <=num-row +1 ; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
