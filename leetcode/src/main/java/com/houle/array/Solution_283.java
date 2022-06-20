package com.houle.array;

import java.util.Arrays;

public class Solution_283 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int flag = 0;
        for (int i=0; i<nums.length; ++i) {
            if (nums[i] == 0) {
                ++flag;
                continue;
            }
            if(nums[i] != 0 && flag > 0){
                nums[i-flag] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums_0 = {0,1,0,3,12};
        int[] nums_1 = {0};
        Solution_283 solution_283 = new Solution_283();
        solution_283.moveZeroes(nums_0);
        solution_283.moveZeroes(nums_1);
        System.out.println(Arrays.toString(nums_0));
        System.out.println(Arrays.toString(nums_1));
    }
}
