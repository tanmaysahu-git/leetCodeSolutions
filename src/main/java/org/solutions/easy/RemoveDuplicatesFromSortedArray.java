package org.solutions.easy;
//26. Remove Duplicates from Sorted Array
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,5};
        System.out.println(removeDuplicates(nums));
    }
    // my answer
//    public int intremoveDuplicates(int[] nums) {
//        int index = 1;
//        int x = nums[0];
//        for(int num : nums){
//            if(num != x){
//                x = num;
//                nums[index++] = num;
//            }
//        }
//        return index;
//    }
    // altho mine is also a two pointer but below is better
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}
