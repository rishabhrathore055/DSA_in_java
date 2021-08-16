package com.rishabh;

import java.util.Arrays;

public class Search_in_2D_array {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 10},
                {1,2,-8,4,5},
                {2,4,6,8,10},
                {1,3,5,7,9}
        };
        int target = 5;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr ,int target){
        for (int row  = 0; row  <arr.length; row ++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]== target){
                    return new int[] {row,col};
                }
            }

        }
        return new int[] {-1,-1};
    }

}

