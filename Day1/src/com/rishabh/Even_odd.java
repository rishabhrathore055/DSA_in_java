package com.rishabh;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number");
        int num = input.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}
