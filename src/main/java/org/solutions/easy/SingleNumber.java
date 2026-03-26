package org.solutions.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
//136. Single Number
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
//    fastest use of xor^ a^a = 0 a^0 = a
    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
//    public static int singleNumber(int[] nums) {
//        HashSet<Integer> find = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            if(find.contains(nums[i])){
//                find.remove(nums[i]);
//            }else{
//                find.add(nums[i]);
//            }
//        }
//
//        return find.stream().toList().get(0);
//    }
//    public static int singleNumber(int[] nums) {
//        HashMap<Integer, Integer> find = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            find.put(nums[i], find.getOrDefault(nums[i], 0)+1);
//        }
//        for(Map.Entry<Integer, Integer> i : find.entrySet()){
//            if(find.get(i.getKey()) == 1){
//                return i.getKey();
//            }
//        }
//        return 0;
//    }
}