package org.solutions.easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 0, 0,0, 0, 0 , 0 , 12 , 11, 21};
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }
    // 2 pointers approach greedy algorithm
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill remaining positions with zero
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
    // ====recusive approach =====// my first try
/*    public static void moveZeroes(int[] nums) {
        recursion(nums, 0, 1);
    }

    public static void recursion(int[] nums, int base, int next){
        if(base >= nums.length || next >= nums.length){
            return;
        } else if(nums[base] != 0){
            recursion(nums, ++base, ++next);
        } else if(nums[base] == 0 && nums[next] != 0){
            swap(nums, base, next);
            recursion(nums, ++base, ++next);
        } else {
            recursion(nums, base, ++next);
        }
    }

    public static void swap(int[] nums, int base, int next){
        nums[base] = nums[base] + nums[next];
        nums[next] = nums[base] - nums[next];
        nums[base] = nums[base] - nums[next];
    }

 */
    // ===== recusive approach =======//
//    class Solutionution {
//
//        //0 1 0 3 12
//        //1 0 0 3 12
//        //1 3 0 0 12              1
//        //1 3 12 0 0              0
//
//
//    }
}
