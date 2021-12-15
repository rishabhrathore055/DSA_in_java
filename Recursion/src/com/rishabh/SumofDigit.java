package com.rishabh;

public class SumofDigit {
    public static void main(String[] args) {
        int ans = sumD(1342);
        System.out.println(ans);
    }
    static int sumD(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumD (n/10);
    }

}
