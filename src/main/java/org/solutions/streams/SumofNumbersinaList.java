package org.solutions.streams;

import java.util.List;

public class SumofNumbersinaList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4);
        System.out.println(numbers.stream().reduce(Integer::sum).orElseThrow());
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }
}
