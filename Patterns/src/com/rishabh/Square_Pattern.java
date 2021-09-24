package com.rishabh;

import java.util.Scanner;

public class Square_Pattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        Square(num);
    }
    static void Square(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
