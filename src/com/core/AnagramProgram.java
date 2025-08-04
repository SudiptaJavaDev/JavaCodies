package com.core;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String str2 = scanner.nextLine();
        System.out.println("Checking Anagram or Not...");
        char[] char1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] char2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        if (char1.length != char2.length) {
            System.out.println("Strings are not Anagram");
        }
        else {
            Arrays.sort(char1);
            Arrays.sort(char2);
            if (Arrays.equals(char1, char2)) {
                System.out.println("Strings are Anagram");
            }
            else {
                System.out.println("Strings are not Anagram");
            }
        }

    }
}
