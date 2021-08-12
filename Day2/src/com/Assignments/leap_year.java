//package com.day3;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year%400==0) System.out.println("yes");
        else if(year%100==0) System.out.println("no");
        else if(year%4==0) System.out.println("yes");
        else  System.out.println("no");
    }
}
