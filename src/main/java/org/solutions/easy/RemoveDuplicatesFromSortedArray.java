package org.solutions.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

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
    public int removeDuplicates(int[] nums) {
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
