package com.rishabh;

import java.util.Scanner;

public class Factorial_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int num = in.nextInt();
        int fact = 1;
        while(num>1)
        {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial_Q1 = "+fact);


    }
}
