package com.rishabh;

import java.util.Scanner;

public class even_F {
    public static void main(String[] args) {
        even();
    }

    private static void even() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
