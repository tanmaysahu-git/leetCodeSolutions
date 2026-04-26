package org.solutions.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindNthLargestElementinaList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 50, 40, 30);
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst());
    }
}
