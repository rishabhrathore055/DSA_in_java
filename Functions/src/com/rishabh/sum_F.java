package com.rishabh;

import java.util.Scanner;

public class sum_F {
    public static void main(String[] args) {
        System.out.println(sum());

    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2 = in.nextInt();
        return num1 + num2;
    }

}
