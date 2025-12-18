package org.solutions.easy;
//169. Majority Element
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    // my first attempt
//    public static int majorityElement(int[] nums) {
////        if(nums.length==1){
////            return nums[0];
////        }
////        for(int i = 0; i < nums.length; i++){
////            int count = 0;
////            for(int j = i+1 ; j < nums.length; j++){
////                if(nums[j] == nums[i]){
////                    count++;
////                }
////                if(count + 1> nums.length / 2){
////                    return nums[i];
////                }
////            }
////        }
////        return 0;
//    }

//    Boyer–Moore Voting Algorithm
//✅ Why this algorithm?
//
//    O(n) time
//
//    O(1) space
//
//    Specifically designed for problems where a majority element is guaranteed to exist
//
//    LeetCode 169 explicitly guarantees:
//
//    The majority element always exists.
//
//4️⃣ Intuition (Very Important)
//
//    Think of it like canceling votes:
//
//    If two different numbers meet → they cancel each other
//
//    Majority element survives because it appears more than all others combined
public static int majorityElement(int[] nums) {
    int count = 0;
    int value=0;

    for(int num : nums){
        if (count == 0){
            value = num;
        }

        count = count + ((num == value) ? 1 : -1);

    }
    return value;
}
}
