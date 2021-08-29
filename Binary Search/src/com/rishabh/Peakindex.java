package com.rishabh;

public class Peakindex {
    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peackindex(arr));
    }

    static int peackindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                /* you are in the dec part of array
                this maybe the ans but, first have a look or check at the left
                this is why  we use end!= mid-1;
                 */
                end = mid;

            } else {
                // that means you are come in the asc part of array
                start = mid + 1; // from  this condition we know the mid + 1 index > mid index
            }

        }
        /*
        int the last, start == end, and it's pointing to the largest index of array because of 2 checks above
        start and end are always trying to find max index in the above checks
        when they are pointing to the same index that is the max index
         */
        return end;
    }
}
