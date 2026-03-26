package org.solutions.easy;

//14. Longest Common Prefix
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
    }
    // works
    private static String longestCommonPrefix(String[] strs) {
        int index = 0;
        int indexC = 0;

        while(true){
            if (index+1 == strs.length) {
                indexC++;
                index = 0;
            }
            if(indexC < strs[index].length() && indexC < strs[index+1].length() && strs[index].charAt(indexC) == strs[index + 1].charAt(indexC)){
                index++;
            } else {
                return strs[0].length() == 0 ? "" : strs[0].substring(0, indexC);
            }
        }
    }

//    public static String longestCommonPrefix(String[] strs) {
//        if(strs.length < 2 || strs[0] == ""){
//            return strs[0];
//        }
//        String s = String.valueOf(strs[0].charAt(0));
//        int j = 0;
//        boolean end = false;
//        while(!end){
//        for(int i = 0; i < strs.length; i++){
//            if(j > strs[i].length()){
//                end = true;
//                break;
//            }
//            if(!strs[i].contains(s)){
//                return s.substring(0, s.length()-1);
//            }
//            if(i == strs.length-1){
//                s = strs[i].substring(0, ++j);
//            }
//        }
//        }
//        return s;
//    }
}
