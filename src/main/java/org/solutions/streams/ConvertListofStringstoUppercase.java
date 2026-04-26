package org.solutions.streams;

import java.util.Arrays;
import java.util.List;

public class ConvertListofStringstoUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
    }
}
