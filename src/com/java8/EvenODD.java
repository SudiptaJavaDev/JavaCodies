package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenODD {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> evenNumbers = listOfIntegers.stream()
                .filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> oddNumber = listOfIntegers.stream()
                .filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumber);

    }
}
