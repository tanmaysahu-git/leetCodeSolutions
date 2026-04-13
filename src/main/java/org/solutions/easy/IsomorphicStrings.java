package org.solutions.easy;

import java.util.*;
//205. Isomorphic Strings
public class IsomorphicStrings{
    public static void main(String[] args) {
        String s = "egg";
        String t = "adg";
        System.out.println(isIsomorphic(s,t));
    }

    //copied to understand by debugging
    public static boolean isIsomorphic(String s, String t) {
        int[] lastSeenS = new int[256];
        int[] lastSeenT = new int[256];
        Arrays.fill(lastSeenS, -1);
        Arrays.fill(lastSeenT, -1);

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If the last seen positions differ, patterns don't match
            if (lastSeenS[charS] != lastSeenT[charT]) {
                return false;
            }

            lastSeenS[charS] = i;
            lastSeenT[charT] = i;
        }
        return true;
    }
//    public static boolean isIsomorphic(String s, String t) {
//        if(s.length() != t.length())
//            return false;
//        HashMap<Character, Deque<Integer>> sPosition = new HashMap<>();
//        HashMap<Character, Deque<Integer>> tPosition = new HashMap<>();
//        for(int i = 0; i < s.length(); i++){
//             if(!sPosition.containsKey(s.charAt(i))){
//                 sPosition.put(s.charAt(i), new ArrayDeque<>(List.of(i)));
//             } else {
//                 if (sPosition.get(s.charAt(i)).peek() != tPosition.get(t.charAt(i)).peek())
//                     return false;
//                 Deque<Integer> oldS = sPosition.getOrDefault(s.charAt(i), new ArrayDeque<>());
//                 oldS.push(i);
//                 sPosition.put(s.charAt(i), oldS);
//             }
//             if (!tPosition.containsKey(t.charAt(i))){
//                 tPosition.put(t.charAt(i), new ArrayDeque<>(List.of(i)));
//             } else {
//                 if (sPosition.get(s.charAt(i)).peek() != tPosition.get(t.charAt(i)).peek())
//                     return false;
//                 Deque<Integer> oldT = tPosition.getOrDefault(t.charAt(i), new ArrayDeque<>());
//                 oldT.push(i);
//                 sPosition.put(t.charAt(i), oldT);
//             }
//
//
//             if (sPosition.get(s.charAt(i)).size() != tPosition.get(t.charAt(i)).size())
//                 return false;
//
//        }
//        return true;
//    }

}
