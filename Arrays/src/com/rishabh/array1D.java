package com.rishabh;

import java.util.Arrays;
import java.util.Scanner;

public class array1D {

    public static void main(String[] args) {
//	// write your code here
//        System.out.println(arr[0]);
//        String[] arr = new String[5] ;
       Scanner in = new Scanner(System.in);
//       int [] arr = new int[5];


//        for (int i = 0; i <arr.length; i++) {
//            arr[i] = in.nextInt();
//         }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        Enhanced for loop
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        // arrays of objects

        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));
    }
}

