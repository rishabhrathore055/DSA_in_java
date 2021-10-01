package com.rishabh;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {12,13,16,23,24,25,27,57};
        int target = 57;
        System.out.println(Search(arr,target,0,arr.length-1) );
    }
    static int Search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e -s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target <arr[m]){
            return Search(arr,target,s,m - 1);
        }

        return Search(arr,target,m+1,e);
    }

}
