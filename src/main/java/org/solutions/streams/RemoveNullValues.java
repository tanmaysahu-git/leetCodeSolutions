package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class RemoveNullValues {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
        words.stream().filter(word -> word != null)
                .forEach(word -> System.out.print(word + " "));
    }
}
