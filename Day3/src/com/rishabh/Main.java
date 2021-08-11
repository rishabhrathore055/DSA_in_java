package com.rishabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
//        String Numbers = in.next();
//        switch (Numbers) {
//            case "one" -> System.out.println("1");
//            case "two" -> System.out.println("2");
//            case "three" -> System.out.println("3");
//            case "four" -> System.out.println("4");
//            case "five" -> System.out.println("5");
//            default -> System.out.println("Invalid Number");
//        }


//        int month = in.nextInt();
//        switch (month) {
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("February");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("June");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("september");
//            case 10 -> System.out.println("october");
//            case 11 -> System.out.println("November");
//            case 12 -> System.out.println("December");
//            default -> System.out.println("Invalid Month");
//        }

        int day = in.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
