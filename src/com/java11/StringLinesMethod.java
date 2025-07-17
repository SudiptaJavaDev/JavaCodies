package com.java11;

import java.util.Arrays;

//lines(): Returns an array of strings, each string representing one line of this string.
public class StringLinesMethod {
    public static void main(String[] args) {
        //example 1
        String str = "This is a string with multiple lines.\nLine 2\nLine 3";
        str.lines().forEach(System.out::println);
        //example 2
        String[] lines = str.lines().toArray(String[]::new);
        System.out.println(Arrays.toString(lines));
    }
}
