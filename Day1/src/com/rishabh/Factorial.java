package com.rishabh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int f = 1;
        while(num>0){
            f = f * num;
            num--;
        }
        System.out.println(f);

    }
}
