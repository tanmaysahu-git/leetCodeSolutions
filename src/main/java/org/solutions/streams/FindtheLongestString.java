package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class FindtheLongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
        System.out.println(words.stream().reduce((a,b)->a.length() > b.length() ? a : b).orElse(null));
    }
}
