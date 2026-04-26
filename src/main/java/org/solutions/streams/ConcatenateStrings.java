package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class ConcatenateStrings {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Stream", "API", "is", "powerful", "," , "and", "I'm", "weak");
        System.out.println(words.stream().reduce((a, b) -> a + " " + b).orElseThrow());

    }
}
