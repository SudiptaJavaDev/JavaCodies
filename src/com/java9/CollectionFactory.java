package com.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Factory methods are spacial type of static method are used to create unmodifiable instance of collections
It means we can use these methods to create list,set and map of small number of elements
* List.of()
* Set.of()
* Map.of() Map.ofEntries()
* */
public class CollectionFactory {
    public static void main(String[] args) {

        // Creating Immutable List
        List < String > fruits = List.of("Banana", "Apple", "Mango", "Orange");
        fruits.forEach(element -> System.out.println(element));

        // You can't add Elements Immutable List
        // fruits.add("Strawberry"); // Exception in thread "main" java.lang.UnsupportedOperationException

        // Creating Immutable Set
        Set< String > fruitsSet = Set.of("Java", "SpringBoot", "MicroServices", "Angular");
        fruitsSet.forEach(System.out::println);

        // You can't add Elements Immutable Set
        // fruits.add("ReactJs"); // Exception in thread "main"
        // java.lang.UnsupportedOperationException

        Map<Integer, String> mapEntries = Map.of(101, "Java", 102, "SpringBoot",
                103, "MicroServices", 104, "Angular");
        mapEntries.forEach((key, value) -> System.out.println(key + " : " + value));

        Map.ofEntries(
                Map.entry(101, "Java"),
                Map.entry(102, "SpringBoot"),
                Map.entry(103, "MicroServices"),
                Map.entry(104, "Angular")
        ).forEach((key, value) -> System.out.println(key + " : " + value));


    }
}
