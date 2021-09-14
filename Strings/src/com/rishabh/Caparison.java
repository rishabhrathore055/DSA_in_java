package com.rishabh;

public class Caparison {
    public static void main(String[] args) {
        String str1 = "rishu";
        String str2 = "rishu";
        System.out.println(str1==str2 );

        String name1 = new String("rishu");
        String name2 = new String("rishu");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
