package com.rishabh;

public class FirstLast {
    public static void main(String[] args) {
        int [] arr = {-18,-10,-7,-2,0,4,45,55,65,75,79,99};
        int target = 4;
        int[] ans = searchRange(arr,target ) ;
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1} ;
        ans[0]  = Search(nums ,target,true) ;
        if(ans[0] !=-1){
            ans[1] = Search(nums,target,false);
        }
        return ans ;
    }
    static int Search(int[] nums,int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //int mid = (start + end) /2;
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
    }

