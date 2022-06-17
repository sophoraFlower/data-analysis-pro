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
        int nums_max = Integer.MIN_VALUE;
        int nums_middle = Integer.MIN_VALUE;
        int nums_min = Integer.MIN_VALUE;
        boolean flag = true;
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i]==Integer.MIN_VALUE&&flag){
                count++;
                flag=false;
            }
            if (nums[i] > nums_max) {
                nums_min = nums_middle;
                nums_middle = nums_max;
                nums_max = nums[i];
                count++;
            } else if (nums[i] < nums_max && nums[i] > nums_middle) {
                nums_min = nums_middle;
                nums_middle = nums[i];
                count++;
            } else if (nums[i] < nums_middle && nums[i] > nums_min) {
                nums_min = nums[i];
                count++;
            }
        }
        return count>=3 ? nums_min : nums_max;
    }

    public static void main(String[] args) {
        Solution_414 solution_414 = new Solution_414();
        int[] nums_01 = {2, 2, 3, 1};
        int[] nums_02 = {3, 2, 1};
        int[] nums_03 = {1, 2};
        int[] nums_04 = {2, 2, 2};
        int[] nums_05 = {1,2,-2147483648};
        System.out.println(solution_414.thirdMax(nums_01));
        System.out.println(solution_414.thirdMax(nums_02));
        System.out.println(solution_414.thirdMax(nums_03));
        System.out.println(solution_414.thirdMax(nums_04));
        System.out.println(solution_414.thirdMax(nums_05));
    }
}
