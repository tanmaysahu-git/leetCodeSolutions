package org.solutions.easy;

import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "bg";
        String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    // my solution was over complex and not efficient, efficient solution is commented below
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] countNote = new int[256];
        int[] countMag = new int[256];
        Arrays.fill(countNote, 0);
        Arrays.fill(countMag, 0);
        int ransomNoteLength = ransomNote.length();
        int magazineLength = magazine.length();
        int i = 0;
        while(ransomNoteLength > 0 || magazineLength > 0){
            ransomNoteLength--;
            magazineLength--;
            if(ransomNoteLength > -1){
                countNote[ransomNote.charAt(i)]++;
            }
            if(magazineLength > -1){
                countMag[magazine.charAt(i)]++;
            }
            i++;
        }
        for(int j = 0; j < ransomNote.length(); j++){
            if(countMag[ransomNote.charAt(j)] < countNote[ransomNote.charAt(j)]){
                return false;
            }
        }
        // for
        return true;
    }

//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[] countMag = new int[256];
//        int magazineLength = magazine.length();
//        int i = 0;
//        while( magazineLength > 0){
//            magazineLength--;
//            if(magazineLength > -1){
//                countMag[magazine.charAt(i)]++;
//            }
//            i++;
//        }
//        for(int j = 0; j < ransomNote.length(); j++){
//            if(countMag[ransomNote.charAt(j)] == 0){
//                return false;
//            }
//            countMag[ransomNote.charAt(j)]--;
//        }
//        // for
//        return true;
//    }
}
