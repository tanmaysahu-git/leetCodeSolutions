package org.solutions.streams;

public class FindFirstNonRepeatedCharacterinaString {
    public static void main(String[] args) {
        String input = "nandani";
        System.out.println(input.chars().mapToObj(c->(char)c).filter(c-> input.indexOf(c) == input.lastIndexOf(c)).findFirst());
    }
}
