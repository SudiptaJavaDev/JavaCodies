package com.java11;
//isBlank(): Returns true if the string is empty or contains only white space code points.
public class StringisBlankMethod {
    public static void main(String[] args) {
        final String exampleText1 = "";
        final String exampleText2 = " ";
        final String exampleText3 = " \n \t ";
        System.out.println("example with isBlank method");
        System.out.println(exampleText1.isBlank());//true
        System.out.println(exampleText2.isBlank());//true
        System.out.println(exampleText3.isBlank());//true
        System.out.println("example with isEmpty method");
        System.out.println(exampleText1.isEmpty());//true
        System.out.println(exampleText2.isEmpty());//false
        System.out.println(exampleText3.isEmpty());//false
    }
}
