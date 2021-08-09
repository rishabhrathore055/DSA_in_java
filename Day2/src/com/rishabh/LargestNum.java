package com.rishabh;
import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
	// write your code here
        //WAP Program to find largest of given 3 Numbers
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int  max = a;
//        if(b >max) {
//            max = b;
//        }
//        if(c>max) {
//            max = c;
//        }
//        System.out.println(max);
        a = Math.max(c,(Math.max(a,b)));
        System.out.println(a);
    }
}
