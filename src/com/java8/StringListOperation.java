package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringListOperation {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python","Python","Microservices","C++", "COBOL", "C");
        //Remove duplicates from List of Strings
        List<String> uniqueList = listOfStrings.stream().distinct().collect(Collectors.toList());
        //System.out.println("Unique List: " + uniqueList);






        //Find out duplicates elements from List of Strings
        List<String> duplicateList = listOfStrings.stream()
                .filter(i -> listOfStrings.indexOf(i) != listOfStrings.lastIndexOf(i)).collect(Collectors.toList());
        //System.out.println("Duplicate List: " + duplicateList);
        //Print duplicates elements from List of Strings
        Set<String> duplicateSet = listOfStrings.stream().filter(e -> listOfStrings.indexOf(e) != listOfStrings.lastIndexOf(e))
                .collect(Collectors.toSet());
        //System.out.println("Duplicate Set: " + duplicateSet);






        //Find out longest element from List of Strings
        String longestString = listOfStrings.stream().max((s1, s2) -> s1.length() - s2.length()).get();
        //System.out.println("Longest String: " + longestString);
        //Find out shortest element from List of Strings
        String shortestString = listOfStrings.stream().min((s1, s2) -> s1.length() - s2.length()).get();
        //System.out.println("Shortest String: " + shortestString);





        //Find out friquency of elements from List of Strings
        Map<String, Long> friquencyString = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println("Friquency of Strings: " + friquencyString);




        //Sort List of Strings
        List<String> listOfSortStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        //Sort List of Strings in ascending order
        List<String> sortedAscList = listOfSortStrings.stream().sorted().collect(Collectors.toList());
        //System.out.println("Sorted asc List: " + sortedAscList);
        //Sort List of Strings in descending order
        List<String> sortedDescList = listOfSortStrings.stream().sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        //System.out.println("Sorted desc List: " + sortedDescList);
        List<String> sortedReverseOrder = listOfSortStrings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //System.out.println("Sorted reverse order: " + sortedReverseOrder);






        //Find out most repeated element from List of Strings
        List<String> listOfRepeatedStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        //Find out most repeated element from List of Strings
        String mostRepeatedString = listOfRepeatedStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getKey();
        //System.out.println("Most repeated String: " + mostRepeatedString);





        //Join List of Strings
        List<String> listOfFormatStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        //list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        String formattedString = listOfFormatStrings.stream().collect(Collectors.joining(",", "[", "]"));
        //System.out.println("Formatted String: " + formattedString);




        //Find maximum and minimum of those numbers
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        //find maximum and minimum of those numbers?
        //listOfIntegers.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        //listOfIntegers.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
