package com.rishabh;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int ans = 0;
        while(num>0)
        {
            int rem = num % 10;
            num /=10;
            ans = ans *10 + rem;
        }
        System.out.println(ans);
    }
}
