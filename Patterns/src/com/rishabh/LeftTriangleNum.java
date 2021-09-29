package com.rishabh;

import java.util.Scanner;

public class LeftTriangleNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        leftT(num);
    }
static void leftT(int num){
    for (int row = 1; row <= num; row++) {

        for (int space = 0; space <=num-row; space++) {
            System.out.print(" ");
        }
        for (int col = 1; col <=row; col++) {
            System.out.print(col);
        }
        System.out.println();
    }
}
}
