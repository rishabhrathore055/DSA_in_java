package com.rishabh;

public class Reverse {
    public static void main(String[] args) {
        revr1(1234);
        System.out.println(sum);

    }
    static int sum = 0;
    static void revr1(int n){
        if(n == 0)
        {
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        revr1(n/10);
    }
}
