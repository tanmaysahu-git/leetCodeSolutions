package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class CheckifAnyStringMatchesaCondition {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        System.out.println(strings.stream().anyMatch(s->s.contains("API")));
    }
}
