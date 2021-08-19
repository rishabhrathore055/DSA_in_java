package com.rishabh;

public class BinarySearch_Dc {
    public static void main(String[] args) {
        int[] arr ={99,79,54,46,22,18,4,2,0,-2,-10,-18,-22};
        int target = 4;
        int ans = binarySearch(arr,target ) ;
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //int mid = (start + end) /2;
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                start = mid + 1;
            }
            else if (target > arr[mid]){

                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
