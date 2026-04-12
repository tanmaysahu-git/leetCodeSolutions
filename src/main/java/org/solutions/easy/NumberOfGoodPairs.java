package org.solutions.easy;

import java.util.HashMap;
import java.util.stream.Stream;
//1512. Number of Good Pairs
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1, 2, 3, 3};
        System.out.println(numIdenticalPairs(nums));
    }
    // copied
//    public static int numIdenticalPairs(int[] nums) {
//        HashMap<Integer, Integer> freq = new HashMap<>();
//        int sum = 0;
//
//        for (int num : nums) {
//            int count = freq.getOrDefault(num, 0);
//            sum += count;  // existing elements form pairs
//            freq.put(num, count + 1);
//        }
//
//        return sum;
//    }

    //my first solution
//    public static int numIdenticalPairs(int[] nums) {
//        HashMap<Integer, Integer> pair = new HashMap();
//        for(int i = 0; i<nums.length;i++){
//            pair.put(nums[i], pair.getOrDefault(nums[i], 0) + 1);
//        }
//        for (Integer i : pair.keySet()){
//            int n = pair.get(i);
//            System.out.println(i + " " + n);
//        }
//        int sum = 0;
//        for (Integer i : pair.keySet()){
//            int n = pair.get(i);
//            sum = sum + (n * (n-1)/2);
//        }
//        return sum;
//    }
// second
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> pair = new HashMap();
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum += pair.getOrDefault(nums[i], 0);
            pair.put(nums[i], pair.getOrDefault(nums[i], 0) + 1);
        }
        return sum;
    }

}
