package com.rishabh;

public class MinNum {
    public static void main(String[] args) {
        int[] arr = {12,123,11,9,7,10,1};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ans>arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }

}
