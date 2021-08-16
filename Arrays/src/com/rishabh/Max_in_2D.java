package com.rishabh;

import java.util.Arrays;

public class Max_in_2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 10},
                {1,2,120,4,5},
                {2,4,6,19,10},
                {1,3,5,70,9}
        };
        System.out.println(max(arr));

    }
    static int max (int[][] arr){
        int max = Integer.MIN_VALUE ;
        for (int row  = 0; row  <arr.length; row ++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }

        }
        return max;
    }
}
