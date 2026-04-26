package org.solutions.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMapfromList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        Map<String, Integer> mapStringToLength = words.stream().collect(Collectors.toMap(String::toString, String::length, (s, sIdentical) -> s));
        System.out.println(mapStringToLength);
    }
}
