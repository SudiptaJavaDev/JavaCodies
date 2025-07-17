package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOperation {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        // find frequency of each character in a string
        Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);

    }
}
