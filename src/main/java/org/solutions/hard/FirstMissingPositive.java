package org.solutions.hard;

import java.util.Arrays;
//41. First Missing Positive
public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositiveCorrect(new int[]{3, 4, -1, 1}));
    }

    // also partially true
//    public static int firstMissingPositive(int[] nums) {
//        for (int i = 0 ; i < nums.length; i++){
//            if(nums[i] > 0 && nums[i] != i+1 && nums[i] <= nums.length){
//                int temp = nums[nums[i]-1];
//                nums[nums[i]-1] = nums[i];
//                nums[i] = temp;
//            }
//        }
//        for(int i = 0 ; i < nums.length; i++){
//            if (nums[i] >0 && nums[i] != i + 1){
//                return i+1;
//            }
//        }
//        return -1;
//    }
    // my first answer does not work because I used sort answer is correct but it is slow that excpeted range
//    public int firstMissingPositive(int[] nums) {
//        Arrays.sort(nums);
//        int smallest = 1;
//        for(int num: nums){
//            if(num == smallest){
//                smallest ++;
//            }
//        }
//        return smallest;
//    }

    public static int firstMissingPositiveCorrect(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Swap numbers to their correct positions
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Determine the first missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; // If all numbers 1 to n are present, return n+1
    }
//    this is incorrect because we are using if instead of while which causes an issue that is
//        if a number is moved to a position < i it will stay there and not be moved to correct position like in case of 3,4,-1,1
//    where when we move 4 to its position 3rd index and there fore 1 is moved to 1st index 1 will remain at 1st index forever
//    where as it should be moved to 0th index
//    public static int firstMissingPositive(int[] nums) {
//        for (int i = 0 ; i < nums.length; i++){
//            if(nums[i] > 0 && nums[i] != i+1 && nums[i] <= nums.length){
//                int temp = nums[nums[i]-1];
//                nums[nums[i]-1] = nums[i];
//                nums[i] = temp;
//            }
//        }
//        for(int i = 0 ; i < nums.length; i++){
//            if (nums[i] != i + 1){
//                return i+1;
//            }
//        }
//        return nums.length + 1;
//    }

}
