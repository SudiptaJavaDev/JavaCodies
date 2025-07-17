package com.java11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*In Java 11, the var keyword can be used for local variable type inference in lambda expressions.
This means you can declare the type of lambda parameters using var,
making the code more concise and readable.*/
public class UseVar {
    public static void main(String[] args) {
        //example1
        List<String> list = List.of("Java", "Kotlin", "Scala");
        list.forEach((var item) -> System.out.println(item));

        List<String> collect = Stream.of("one", "two", "three")
                .map((var s) -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
