package com.rishabh;

import java.util.Scanner;

public class returnSum_f {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Num: ");
        int num2 = in.nextInt();
        int ans  = sum(num1,num2);
        System.out.println(ans);
    }

    static int sum(int a,int b){
        int sum = a+ b;
        return sum;

    }

}
