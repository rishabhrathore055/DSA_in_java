package com.rishabh;

public class ConceptToUnderstand {
    public static void main(String[] args)
    {
fun(5);
    }
    static void fun(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);
    }


}
