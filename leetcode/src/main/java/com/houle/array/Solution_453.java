package com.houle.array;

public class Solution_453 {
    public int minMoves(int[] nums) {
        int min_value = Integer.MAX_VALUE;
        int result = 0;
        if(nums.length == 1){
            return result;
        }
        for (int num: nums
             ) {
            min_value = Math.min(num, min_value);
        }
        for (int i=0; i<nums.length; ++i) {
            result += nums[i] - min_value;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        Solution_453 solution_453 = new Solution_453();
        System.out.println(solution_453.minMoves(nums));
    }
}
