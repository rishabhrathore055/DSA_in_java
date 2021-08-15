package com.rishabh;

import java.util.Scanner;

public class swap_F {
    public static void main(String[] args) {
        swap();
    }

    private static void swap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd Num: ");
        int b = in.nextInt();
        int temp = a;
        a  = b;
        b  = temp;
        System.out.println("After Swapping : ");
        System.out.println(a);
        System.out.print(b);
    }
}
