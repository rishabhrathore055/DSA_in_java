package com.rishabh;

import java.util.Scanner;

public class array_max {
    public static void main(String[] args) {
        int[] arr = {5,1,21,332,443,504};
        System.out.println((max(arr) ));
    }

    static int max(int arr[]){
        int maxVal = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
