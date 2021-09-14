package com.rishabh;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder Builder = new StringBuilder();
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i);
            Builder.append(ch);
        }
        System.out.println(Builder.toString());
//        Builder.reverse();
//        System.out.println(Builder);
//        Builder.deleteCharAt(0) ;
//        System.out.println(Builder);
        Builder.length();
        System.out.println(Builder);

    }
}
