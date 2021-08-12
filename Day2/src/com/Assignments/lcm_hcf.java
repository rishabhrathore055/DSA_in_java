//package com.day3;

import java.util.Scanner;
import java.lang.Math;
public class lcm_hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
//        hcf
        int hcf=1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0) hcf = i;
        }
        System.out.println("HCF="+hcf);

//        lcm
        int lcm=(a*b)/hcf;
        System.out.println("LCM="+lcm);
    }
}
