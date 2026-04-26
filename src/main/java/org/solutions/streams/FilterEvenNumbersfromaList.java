package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbersfromaList{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = numbers.stream().filter(n->n%2 == 0).toList();
        even.stream().forEach(x-> System.out.print(x + " "));
    }
}

