package com.java11;
//indent(int n): Adjusts the indentation of each line in the string by the specified number of spaces.
//transform(Function: Applies a function to the string and returns the result.
public class StringOthersMethod {
    public static void main(String[] args) {
        String str = "Java 11 ";
        System.out.println("Hello\nWorld".indent(4).replace(" ", "@"));
        String result = str.transform(s -> s + " Transformed");
        System.out.println(result);
    }

}
