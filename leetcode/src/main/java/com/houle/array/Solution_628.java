package com.houle.array;

public class Solution_628 {
    public int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        int max_first = Integer.MIN_VALUE;
        int max_second = Integer.MIN_VALUE;
        int max_three = Integer.MIN_VALUE;
        int min_first = Integer.MAX_VALUE;
        int min_second = Integer.MAX_VALUE;
        // 提示：-1000 <= nums[i] <= 1000。故不再考虑值为Integer.MAX_VALUE、Integer.MIN_VALUE的情况
        for (int i=0; i<nums.length; i++) {
            if (nums[i] >= max_first) {
                max_three = max_second;
                max_second = max_first;
                max_first = nums[i];
            } else if (nums[i] >= max_second && nums[i] < max_first) {
                max_three = max_second;
                max_second = nums[i];
            } else if (nums[i] >= max_three && nums[i] < max_second) {
                max_three = nums[i];
            }
            if (nums[i] <= min_first) {
                min_second = min_first;
                min_first = nums[i];
            } else if (nums[i] <= min_second && nums[i] > min_first) {
                min_second = nums[i];
            }
        }
        return Math.max((max_first*max_second*max_three), (max_first*min_first*min_second));
    }

    public static void main(String[] args) {
        int[] nums_01 = {-1,-2,-3};
        int[] nums_02 = {-1,-2,-3,-3};
        int[] nums_03 = {1,2,3,4};
        int[] nums_04 = {2, 2, 2};

        Solution_628 solution_628 = new Solution_628();
        System.out.println(solution_628.maximumProduct(nums_01));
        System.out.println(solution_628.maximumProduct(nums_02));
        System.out.println(solution_628.maximumProduct(nums_03));
        System.out.println(solution_628.maximumProduct(nums_04));
    }
}
