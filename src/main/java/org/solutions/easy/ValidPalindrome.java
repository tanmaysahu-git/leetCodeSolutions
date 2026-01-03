package org.solutions.easy;
//125. Valid Palindrome
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "aa;';' bb aa";
        System.out.println(isPalindromeCorrect(s));
    }
    public static boolean isPalindromeCorrect(String s) {
        //Character.isLetterOrDigit(c)
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) !=
                    Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //althogh the logic is correct above is improved version as it uses while instead of if to check non letter value
    //also uses Charater.toLowerCase instead of converting to string and using toLowerCase
//    public static boolean isPalindrome(String s) {
//        //Character.isLetterOrDigit(c)
//        //Character.isLetterOrDigit(c)
//        int i = 0;
//        int j = s.length()-1;
//        while(i < s.length() && j < s.length() && i!=j){
//            if(!Character.isLetterOrDigit(s.charAt(i))){
//                i++;
//                continue;
//            }
//            if(!Character.isLetterOrDigit(s.charAt(j))){
//                j--;
//                continue;
//            }
//            if(!String.valueOf(s.charAt(i)).toLowerCase().equalsIgnoreCase(String.valueOf(s.charAt(j)).toLowerCase())){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
}
