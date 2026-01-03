package org.solutions.medium;
//334. Increasing Triplet Subsequence
public class IncreasingTripletSequence {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(increasingTriplet(nums));
     }
    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= min1){
                min1 = num;
            } else if(num <= min2){
                min2 = num;
            } else return true;
        }
        return false;
    }
//    first attempt incorrect because I assumed that i j k are i+1 i+2 i+3
//    but the can be any where but just in order i j k
//    public static boolean increasingTriplet(int[] nums) {
//        int count = 0;
//        for(int i = 1 ; i < nums.length; i++){
//            if(nums[i - 1] < nums[i]){
//                count++;
//                if(count == 2){
//                    return true;
//                }
//            } else{
//                count = 0;
//            }
//        }
//        return false;
//    }
}
