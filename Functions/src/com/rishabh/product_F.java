package com.rishabh;

import java.util.Scanner;

public class product_F {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        product();
    }

    static  void  product(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Num: ");
        int num2 = in.nextInt();
        System.out.println(num1*num2);

    }
}
