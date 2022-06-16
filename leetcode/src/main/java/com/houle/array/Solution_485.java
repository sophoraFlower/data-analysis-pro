package com.houle.array;

public class Solution_485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 0, result = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > result) {
                    result = count;
                }
                count = 0;
            }
        }
        result = Math.max(result, count);
        return result;
    }

    public static void main(String[] args) {
        int[] nums_01 = {1,1,0,1,1,1};
        int[] nums_02 = {1,0,1,1,0,1};
        int[] nums_03 = {1};
        int[] nums_04 = {0};
        Solution_485 solution_485 = new Solution_485();
        System.out.println(solution_485.findMaxConsecutiveOnes(nums_01));
        System.out.println(solution_485.findMaxConsecutiveOnes(nums_02));
        System.out.println(solution_485.findMaxConsecutiveOnes(nums_03));
        System.out.println(solution_485.findMaxConsecutiveOnes(nums_04));
    }
}
