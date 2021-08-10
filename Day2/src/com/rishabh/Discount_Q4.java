package com.rishabh;

import java.util.Scanner;

public class Discount_Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Amount of product: ");
        float  amount = in.nextFloat();
        System.out.print("Enter The Discount percent of product: ");
        float discount = in.nextFloat();
        double ans = (amount * discount) /100;
        System.out.println("The Discount of The Product is : " + ans);
    }
}
