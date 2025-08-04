package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;


public class StringOperation {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        // find frequency of each character in a string
        Map<String, Long> collect = Arrays.stream(inputString.split(""))
                .filter(s -> !s.equals(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(collect);

        // convert any string to split array
        String input = "He is a very very good boy, isn't he?";
        String[] words = input.split("[^a-zA-Z]");
       // Remove empty strings from the array
        words = Arrays.stream(words)
                .filter(word -> !word.isEmpty())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty()){
                //print horizontally
                //System.out.print(words[i]+" ");
            }
        }

        //Find first non-repeated character in a string?
        String inputString1 = "Java Concept Of The Day";
        Arrays.stream(inputString1.replaceAll("\\s", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);




        //Find first repeated character in a string?
        String inputString2 = "Java Concept Of The Day";
        Arrays.stream(inputString2.replaceAll("\\s", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);



        //Find the duplicate characters in a string?
        String inputString3 = "Java Concept Of The Day";
        Arrays.stream(inputString3.replaceAll("\\s", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //Find the unique characters in a string?
        String inputString4 = "Java Concept Of The Day";
        Arrays.stream(inputString4.replaceAll("\\s", "").toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //check if two strings are anagrams or not
        String s1 = "RaceCar";
        String s2 = "CarRace";
        char[] charArray1 = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] charArray2 = s2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(Arrays.equals(charArray1, charArray2)) {
            System.out.println("Strings are Anagram");
        }
        else {
            System.out.println("Strings are not Anagram");
        }

        //Find the longest word in a string?
        String inputString5 = "Java Concept Of The Day";
        String[] words1 = inputString5.split("\\s+");
        String longestWord = Arrays.stream(words1)
                .max((e1, e2) -> e1.length() - e2.length())
                .get();
        System.out.println("Longest word: " + longestWord);

        //Find the shortest word in a string?
        String inputString6 = "Java Concept Of The Day";
        String[] words2 = inputString6.split("\\s+");
        String shortestWord = Arrays.stream(words2)
                .min((e1, e2) -> e1.length() - e2.length())
                .get();
        System.out.println("Shortest word: " + shortestWord);

        //Find the second longest word in a string?
        String inputString7 = "Java Concept Of The Day";
        String[] words3 = inputString7.split("\\s+");
        String secondLongestWord = Arrays.stream(words3)
                .sorted((e1, e2) -> e2.length() - e1.length())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second longest word: " + secondLongestWord);



    }
}
