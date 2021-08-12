package com.rishabh;

import java.util.Scanner;

public class max_min_F {
    public static void main(String[] args) {
        max();
        min();
    }
    static void max()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("This Menthod Give Maximum Number");
        System.out.print("Enter 1st num: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd num: ");
        int num3 = in.nextInt();
        int max = Math.max(num3,(Math.max(num1,num2)));
        int min = Math.min(num3,(Math.min(num1,num2)));
        System.out.println("The maximum will be: "+max);
//        System.out.println("The minimum will be:"+min);
    }
    static void min()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("This Menthod Give Minimum Number");
        System.out.print("Enter 1st num: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd num: ");
        int num3 = in.nextInt();
        int min = Math.min(num3,(Math.min(num1,num2)));
        System.out.println("The minimum num will be : "+min);
    }



}
