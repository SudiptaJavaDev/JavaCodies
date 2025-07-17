package com.java8;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberOperation {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        //sort the given list of decimals in reverse order
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        //From the given list of integers, print the numbers which are multiples of 5?
        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        //How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));
        System.out.println("-------------------------------------------------------");
        //How do you find the second largest number in an unsorted array using Java 8 streams?
        List<Integer> listOfIntegers1 = Arrays.asList(4, 2, 7, 1, 8, 3, 9, 5);
        listOfIntegers1.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        //How do you find the second smallest number in an unsorted array using Java 8 streams?
        listOfIntegers1.stream().sorted().distinct().skip(1).limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        //Find max and min number from an unsorted array
        listOfIntegers1.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        listOfIntegers1.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
        System.out.println("-------------------------------------------------------");
        //Find sum of all digits of a number
        int num = 123456789;
        int sum = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
        System.out.println("-------------------------------------------------------");
        //Given an integer array, find sum and average of all elements
        List<Integer> listOfIntegers2 = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 90, 100);
        int sumNumber = listOfIntegers2.stream().mapToInt(i -> i).sum();
        System.out.println("Sum of all numbers: " + sumNumber);
        double avgNumber = listOfIntegers2.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println("Average of all numbers: " + avgNumber);
        System.out.println("-------------------------------------------------------");
        //How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream().filter(list2::contains).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        //How do you find sum of first 10 natural numbers?
        int sumNumber1 = IntStream.range(1, 11).sum();
        System.out.println("Sum of first 10 natural numbers: " + sumNumber1);
        System.out.println("-------------------------------------------------------");
        //How do you find sum of even numbers between 1 to 10?
        int sumNumber2 = IntStream.range(1, 11).filter(i -> i % 2 == 0).sum();
        System.out.println("Sum of even numbers between 1 to 10: " + sumNumber2);
        System.out.println("-------------------------------------------------------");
        //How do you find sum of odd numbers between 1 to 10?
        int sumNumber3 = IntStream.range(1, 11).filter(i -> i % 2 != 0).sum();
        System.out.println("Sum of odd numbers between 1 to 10: " + sumNumber3);
        System.out.println("-------------------------------------------------------");
        //Reverse an integer array
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[] reverseArray = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - i - 1]).toArray();
        System.out.println(Arrays.toString(reverseArray));
        System.out.println("-------------------------------------------------------");
        //Print first 10 even numbers
        IntStream.range(1, 11).filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        //How do you extract duplicate elements from an array?
        List<Integer> listOfIntegers3 = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElements = new HashSet<>();
        listOfIntegers3.stream().filter(i -> !uniqueElements.add(i))
                .collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        //Fibonacci series generator

        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
        System.out.println("-------------------------------------------------------");
        //Fibonacci series generator using java
        int[] arr1 = new int[10];
        arr1[0] = 0;
        arr1[1] = 1;
        for (int i = 2; i < arr1.length; i++) {
            arr1[i] = arr1[i - 1] + arr1[i - 2];
        }
        System.out.println(Arrays.toString(arr1));




    }
}
