package com.rishabh;

public class CellingOfNum{
    public static void main(String[] args) {
        int[] arr ={2,3,4,7,9,12,14,16,18,19};
        int target = 40;
        int ans = Celling(arr,target ) ;
        System.out.println(ans);

    }

    // It returns the index of Smaller Greater than Equal to the Target
    static int Celling(int[] arr,int target){
        if(target > arr.length){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //int mid = (start + end) /2;
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
