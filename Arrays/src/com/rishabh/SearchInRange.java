package com.rishabh;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {21,12,32,23,43,34,54,45};
        int target = 18;
        System.out.println(linearsearch(arr,target,1,5));
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length ==0){
            return -1;
        }
        for(int index=start ;index<=end;index++){
            int value = arr[index];
            if(value==target){
                return index;
            }
        }
        return -1;
     }
}
