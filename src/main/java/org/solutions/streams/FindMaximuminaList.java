package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaximuminaList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 60, 30, 40, 50);
        System.out.println(numbers.stream().max(Integer::compare).orElseThrow());
    }
}
