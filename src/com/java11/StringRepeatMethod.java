package com.java11;
//repeat(int count): Returns a string whose value is
// the concatenation of this string repeated count times.
public class StringRepeatMethod {
    public static void main(String[] args) {
        String str = "Java 11 ";
        System.out.println(str.repeat(3)); //prints "Java 11Java 11Java 11"
        System.out.println("Hello\nWorld".indent(4));
        String result = str.transform(s -> s + " Transformed");
        System.out.println(result);
    }
}
