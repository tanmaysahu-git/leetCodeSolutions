package org.solutions.medium;

import java.util.Arrays;
//2348. Number of Zero-Filled Subarrays
// answered in 1st attempt
public class NumberOfZeroFilledSubArray {
    public static void main(String[] args) {
        int [] nums = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums) {
        long total = 0;
        long cont = 0;
        for(int i : nums)
        {
            if (i == 0){
                ++cont;
                total = total + cont;
            } else {
                cont = 0;
            }
        }
        return total;
    }
}
