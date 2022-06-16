package com.houle.array;

import java.util.Arrays;

public class Solution_414 {

    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] nums_three_max = new int[3];
        if (nums.length >= 3) {
            nums_three_max[0] = nums[0];
            for (int i=1; i<nums.length; i++){
                for (int j=1; j<3; j++) {
                    if (nums[i] != nums_three_max[j] ) {
                        nums_three_max[j] = nums[i];
                    }
                    nums_three_max[j] = 0;
                }
                for () {

                }
            }
            for(int i=1; i<nums_three_max.length; i++) {
                if (nums_three_max[i] == nums_three_max[i-1]) {
                    return Math.max(Math.max(nums_three_max[0], nums_three_max[1]), nums_three_max[2]);
                }
            }
        }
        return Math.min(Math.min(nums_three_max[0], nums_three_max[1]), nums_three_max[2]);
    }

    public static void main(String[] args) {
        Solution_414 solution_414 = new Solution_414();
        int[] nums_01 = {2, 2, 3, 1};
        int[] nums_02 = {3, 2, 1};
        int[] nums_03 = {1, 2};
        int[] nums_04 = {2, 2, 3, 1};
        System.out.println(solution_414.thirdMax(nums_01));
        System.out.println(solution_414.thirdMax(nums_02));
        System.out.println(solution_414.thirdMax(nums_03));
        System.out.println(solution_414.thirdMax(nums_04));
    }
}
