package com.rishabh;

import java.util.Scanner;

public class Dynamic_array {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {1,3,5,7},
                {2,4,6,8,10},
                {1,2,3,5,7}
        };

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();

        }

    }
}
