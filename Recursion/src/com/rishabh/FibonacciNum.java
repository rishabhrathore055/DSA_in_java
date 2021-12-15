package com.rishabh;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter THe Value of Num: ");
        int num = in.nextInt();
        System.out.println(fibonacci(num));
    }
    static int fibonacci(int num){
        if(num< 2){
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
