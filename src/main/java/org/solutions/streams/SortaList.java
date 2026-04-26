package org.solutions.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortaList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        numbers.stream().sorted().forEach(x-> System.out.print(x + " "));
        System.out.println();
        numbers.stream().sorted((a, b) -> b - a).forEach(x-> System.out.print(x + " "));
        System.out.println();
        numbers.stream().sorted(Collections.reverseOrder()).forEach(x-> System.out.print(x + " "));
        System.out.println();
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(x-> System.out.print(x + " "));
    }
}
