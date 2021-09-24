package com.rishabh;

import java.util.Scanner;

public class NumSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        NumSquare(num);
    }
    static void NumSquare(int num){
        num = 2 * num;
        for (int row = 0; row <=num; row++) {
            for (int col = 0; col <= num ; col++) {
                int atEveryIndex = Math.min(Math.min(row,col),Math.min(num-row,num-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
