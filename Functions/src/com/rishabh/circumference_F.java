package com.rishabh;

import java.util.Scanner;

public class circumference_F {
    public static void main(String[] args) {
        circumF();
    }
    static void circumF()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Radius of Circle: ");
        float radius = in.nextFloat();
        double  circumference = 2*radius*Math.PI;
        System.out.println(circumference);

    }

}
