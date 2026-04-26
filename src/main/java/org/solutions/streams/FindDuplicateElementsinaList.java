package org.solutions.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsinaList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1,4,5,4);
        Set<Integer> unique = new HashSet<>();
        System.out.println(numbers.stream().filter(n-> !unique.add(n)).collect(Collectors.toSet()));
    }
}
