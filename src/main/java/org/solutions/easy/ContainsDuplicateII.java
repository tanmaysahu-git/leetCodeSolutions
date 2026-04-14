package org.solutions.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//219. Contains Duplicate II
public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,0,0,7,8,9,10,11,12,0};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
    // works but to much memory
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> positions = new HashMap<>();
        Boolean result = false;
        for(int i = 0; i< nums.length; i++){
            if(positions.containsKey(nums[i])){
                result = (i - positions.get(nums[i])) <= k;
                if (result == true){
                    return result;
                }
            }
            positions.put(nums[i], i);
        }
        return result;
    }

//    sliding window solution    i didnt think of this
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> window = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            // If current element is already in the window, we found a nearby duplicate
//            if (window.contains(nums[i])) {
//                return true;
//            }
//            // Add current element to the window
//            window.add(nums[i]);
//            // Shrink window if it exceeds size k
//            if (window.size() > k) {
//                window.remove(nums[i - k]);
//            }
//        }
//        return false;
//    }
}
