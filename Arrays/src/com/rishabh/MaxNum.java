package com.rishabh;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {12,12,132,11221,12212,33121};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (ans < arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
