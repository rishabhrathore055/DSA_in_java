package com.rishabh;

public class Min_in_2D {
    public static void main(String[] args) {
        int[][]  arr = {
                {46,1,89,11},
                {2,4,6,8,10},
                {1,3,5,7,9}   ,
                {1,21,21,21}
        };
        System.out.println(min(arr));
    }
    static int min(int [][] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] < min){
                    min = arr[i][j];
                }

            }

        }
        return min;
    }

}
