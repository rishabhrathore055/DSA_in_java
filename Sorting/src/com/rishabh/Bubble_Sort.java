package com.rishabh;

import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {
	// write your code here
        int [] arr = {1,4,3,4,2};
        bubble(arr) ;
        System.out.print(Arrays.toString(arr));

    }
    static void bubble (int [] arr){
        boolean swapped;
        //it run n-1 times
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            //in each steps the largest number will come at the last index of the array
            for (int j = 1; j <arr.length-i; j++) {
                //swap the values if the value is smaller than previous value
                if(arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }

            }
            if(!swapped ){
                break;
            }
        }
    }
}
