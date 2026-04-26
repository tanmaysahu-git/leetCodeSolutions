package org.solutions.streams;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountFrequencyofCharactersinaString {
    //Count Frequency of Characters in a String
    public static void main(String[] args) {
        String input = "success";
        Map<Character, Long> freq = input.chars().mapToObj(c -> (char)c ).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(freq
        );
    }
}
