package org.solutions.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersintoEvenandOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<String, List<Integer>> stringListMap = numbers.stream().collect(Collectors.groupingBy(n-> n%2==0 ? "even": "odd", Collectors.toList()));
        System.out.println(stringListMap);
        Map<Boolean, List<Integer>> booleanListMap = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(booleanListMap);
    }
}
