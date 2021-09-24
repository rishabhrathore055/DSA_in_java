package com.rishabh;

import java.util.Scanner;

public class InvertRightTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of num: ");
        int num = in.nextInt();
        InvertRightTri(num);
    }
    static void InvertRightTri(int num){
        for (int row = 0; row <num ; row++) {
            for (int col = 0; col <num-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
