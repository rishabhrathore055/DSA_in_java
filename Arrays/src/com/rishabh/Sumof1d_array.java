package com.rishabh;

import java.util.Scanner;

public class Sumof1d_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Size of array: ");
        int num = in.nextInt();
        int [] arr = new int[num];
        int sum =0;
        for (int i = 0; i <arr.length; i++) {
            arr[i] = in.nextInt();
         }

        for (int i = 0; i <arr.length  ; i++) {
            sum += arr[i];
            System.out.print(sum +" ");
        }
    }
}
