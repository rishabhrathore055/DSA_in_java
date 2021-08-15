package com.rishabh;

import java.util.Scanner;

public class Armstrong_F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for(int i =100;i<10000;i++){
            if(isArmstrong(i)){
                System.out.print(i +" ");
            }
        }

    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum += rem * rem * rem * rem;
        }
        return sum == original;
    }

}
