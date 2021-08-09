package com.rishabh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int check =2;
        while(check<=num){
            int temp = b;
            b = b + a;
            a = temp;
            check++;
        }
        System.out.println(b);

    }
}
