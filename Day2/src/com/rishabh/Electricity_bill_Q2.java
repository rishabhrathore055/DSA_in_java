package com.rishabh;

import java.util.Scanner;

public class Electricity_bill_Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the units of Bill: ");
        float unit = in.nextFloat();
        double bill = 0;
        if(unit<=100)
        {
            bill = unit * 6.6;
        }
        else if(unit<100 && unit>=200)
        {
            bill = unit * 7.66;
        }
        else if(unit<200 && unit>=500)
        {
            bill = unit * 8.46;
        }
        else if(unit<500){
            bill = unit *10.39;
        }
        System.out.println(bill);

    }
}
