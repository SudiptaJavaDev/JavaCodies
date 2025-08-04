package com.core;

import java.util.Arrays;

public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        if(arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if(arrayOne[i] != arrayTwo[i]) {
                    System.out.println("Arrays are not equal");
                    return;
                }
            }
            System.out.println("Arrays are equal");
        }
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        }
    }
}
