package com.houle.array;

public class Solution_41 {
    public int firstMissingPositive(int[] nums) {
        int result = 1;
        if (nums.length == 1) {
            if (nums[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }
        int[] count = new int[nums.length+1];
        for (int num: nums
             ) {
            if (num > 0 && num < (nums.length+1)) {
                ++count[num];
            }
        }
        for (int i=1; i<nums.length+1; i++) {
            if (count[i]==0) {
                result = i;
                break;
            }
            result = i+1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums_01 = {1,2,3};
        int[] nums_02 = {3,4,-1,1};
        int[] nums_03 = {7,8,9,11,12};
        int[] nums_04 = {1,2,3,10,2147483647,9};

        Solution_41 solution_41 = new Solution_41();
        System.out.println(solution_41.firstMissingPositive(nums_01));
        System.out.println(solution_41.firstMissingPositive(nums_02));
        System.out.println(solution_41.firstMissingPositive(nums_03));
        System.out.println(solution_41.firstMissingPositive(nums_04));
    }
}
