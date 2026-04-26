package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class CountStringswithSpecificPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        System.out.println(names.stream().filter(name -> name.startsWith("A"))
                .count());
    }
}
