package org.solutions.medium;

import java.util.Arrays;
//189. Rotate Array
public class RotateArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        Arrays.stream(nums).forEach(System.out::println);
        rotate(nums, 7);
        Arrays.stream(nums).forEach(x-> System.out.print(x));
        System.out.println();
    }

    // first attemp slow
//    public static void rotate(int[] nums, int k) {
//        int temp = nums[0];
//        for (int i = 0; i < k; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (j< nums.length){
//                    temp = nums[j] + temp;
//                    nums[j] = temp - nums[j];
//                    temp = temp - nums[j];
//                }
//            }
//        }
//        nums[0]= temp;
//    }
    //When an array problem involves rotation, stop thinking about shifting elements.
    //Think about where each index must end up, then look for an in-place permutation trick.
    public static void rotate(int[] nums, int k){
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, (nums.length+k)%nums.length-1);
        reverse(nums, (nums.length+k)%nums.length, nums.length-1);
    }
    public static void reverse(int[] nums, int left, int right){
        while (left<right){
            nums[left] = nums[left] + nums[right];
            nums[right] = nums[left] - nums[right];
            nums[left] = nums[left] -nums[right];
            right--;
            left++;
        }
    }
}
// 7
// 7 8 9 10
// 8
//Reusable problem-solving framework
//
//When you see an array problem:
//
//Step 1: Write the index mapping
//
//Ask:
//
//Where does index i go?
//
//
//If you can express it as a formula → you’re close.
//
//Step 2: Look for block structure
//
//Ask:
//
//Is the array split into parts?
//
//Do parts move together?
//
//Rotation = block rearrangement.
//
//Step 3: Ask about reversals
//
//Whenever you see:
//
//rotation
//
//palindrome
//
//block swap
//
//reverse order
//
//👉 Think reversal first
//
//Reversal is one of the most powerful in-place tools.