package org.solutions.easy;
//392. Is Subsequence
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "";
        String t = "asbnc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        if(s.length() == 0 ){
            return true;
        }
        if(t.length() == 0){
            return false;
        }
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(count) == t.charAt(i)){
                count++;
            }
            if (count == s.length())
                return true;
        }
        return false;
    }
}
