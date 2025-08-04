package com.core;

import java.util.Scanner;

public class RemovedSpaceString {
    public static void main(String[] args) {
        System.out.println("Please enter string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.replaceAll("\\s+", ""));
    }
}
