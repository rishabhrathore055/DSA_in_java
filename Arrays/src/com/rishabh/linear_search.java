package com.rishabh;

public class linear_search {
    public static void main(String[] args) {
        int[] nums= { 20,321,-11,23,-200,31,21};
        int target = 21;
        System.out.println(linearsearch(nums,target) );
    }

    // Search Target and return true and false
//    static boolean  linearsearch3(int[] arr,int target){
//        if(arr.length ==0){
//            return false ;
//        }
//        for (int value : arr) {
//            if (value == target) {
//                return true;
//            }
//        }
//        return false;
//    }
    // search target and return target itself
//    static int linearsearch2(int[] arr,int target){
//        if(arr.length ==0){
//            return Integer.MAX_VALUE;
//        }
//        for (int value : arr) {
//            if (value == target) {
//                return value;
//            }
//        }
//        return Integer.MAX_VALUE;
//    }

    //search target return index of target
    static int linearsearch(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int value = arr[index];
            if(value==target){
                return index;
            }
        }
        return -1;
     }
}
