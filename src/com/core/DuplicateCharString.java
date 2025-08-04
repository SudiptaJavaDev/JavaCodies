package com.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DuplicateCharString {
    public static void main(String[] args) {
        String str = "Sudipta Sarkar";
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            if (!set.add(c)) {
                System.out.println("Duplicate character: " + c);
            }

        }
        //java 8 way get duplicate char in string
        System.out.println(str.chars());
        Map<Character, Long> collect =  str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        collect.entrySet().stream().filter(e->e.getValue()>1)
                .forEach(e->System.out.println(e.getKey()));

    }
}
