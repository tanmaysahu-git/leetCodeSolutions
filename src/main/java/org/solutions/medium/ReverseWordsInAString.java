package org.solutions.medium;

//151. Reverse Words in a String
public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
//        System.out.println(reverseWords(s));
    }
//    public static String reverseWords(String s){
//
//    }
//    even slower
//    public static String reverseWords(String s){
//        String r = "";
//        String trimmed = " " + s.trim();
//        int lastSpace = -1;
//        for (int i = trimmed.length() - 1; i >= 0; i--){
//            if(lastSpace == -1){
//                if(trimmed.charAt(i) == ' '){
//                    r = r + " " + trimmed.substring(i + 1);
//                    lastSpace = i;
//                }
//            } else {
//                if(trimmed.charAt(i) == ' '){
//                    r = r.trim() + " " + trimmed.substring(i + 1, lastSpace);
//                    lastSpace = i;
//                }
//            }
//        }
//        return r.trim();
//    }
//    works but slow
//    public static String reverseWords(String s) {
//        String r = "";
//        String[] strings = s.trim().split(" ");
//        for (int i = strings.length - 1; i >= 0; i--){
//            if(!strings[i].trim().equalsIgnoreCase(""))
//                r = r + " " + strings[i];
//        }
//        return r.trim();
//    }
}
