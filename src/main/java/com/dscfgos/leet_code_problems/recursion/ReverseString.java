package com.dscfgos.leet_code_problems.recursion;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}

