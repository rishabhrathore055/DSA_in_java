//package com.Assignments;

import java.util.Scanner;

public class Sum_till_x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum =num;
        while(num!=0){
            num = in.nextInt();
            sum+=num;
        }
        System.out.println(sum);



    }
}
