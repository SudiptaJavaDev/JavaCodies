package com.java11;

/*
strip(): Removes leading and trailing white space.
stripLeading(): Removes leading white space.
stripTrailing(): Removes trailing white space.
*/
public class StringStripMethod {
    public static void main(String[] args) {
        String str = "  Java 11  ";
        //System.out.println(str.strip()); //prints "Java 11  "
        //System.out.println(str.stripLeading()); //prints "Java 11  "
        //System.out.println(str.stripTrailing()); //prints "  Java 11"

        //remove spaces in between words Java11
        //System.out.println(str.strip().replace(" ", ""));//prints "Java11"

        // strip() vs trim() methods with unicode characters, trim() method doesn’t remove unicode characters
        String str1 = "  Java 11  ";
        String str2 = '\u2003' + "  Hello World  " + '\u2003';
        System.out.println(str2);
        System.out.println(str1.strip()); //prints "Java 11  "
        System.out.println(str2.strip().replace(" ", "@"));

        System.out.println(str1.trim()); //prints "Java 11  "
        System.out.println(str2.trim().replace(" ", "@"));

    }
}
