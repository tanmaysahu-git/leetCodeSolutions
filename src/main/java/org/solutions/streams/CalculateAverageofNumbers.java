package org.solutions.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateAverageofNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(numbers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage());
        System.out.println(numbers.stream().mapToInt(Integer::intValue).average().orElse(0));
    }
}
