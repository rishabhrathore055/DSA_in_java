package com.rishabh;

import java.util.Scanner;

public class vote_F {
    public static void main(String[] args) {
        vote();
    }

    private static void vote() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int num = in.nextInt();
        if(num<=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible to vote");
    }

}
