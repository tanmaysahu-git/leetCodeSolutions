package org.solutions.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsbyLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun", "panda", "poops");
        Map<Integer, List<String>> mapByLength = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(mapByLength);
    }
}
