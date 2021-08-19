package com.rishabh;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,9,12,14,16,18,19};
        int target = 0;
        int ans = floorofnum(arr,target ) ;
        System.out.println(ans);
    }
    // It returns the index of Greatest Number Less Than Equal to the Target
    static int floorofnum(int[] arr,int target){
//        if(target < arr[0]){
//            return -1;
//        }
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start +(end-start)/2;
            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
