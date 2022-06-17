package com.houle.array;

import java.util.Arrays;

public class Solution_697 {
    public int findShortestSubArray(int[] nums) {
        // 定义一个长度为Max-Min+1的数组，相比直接定义长度为5000的进一步优化
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num: nums
             ) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        // 计数排序思想
        int[] count = new int[max - min + 1];
        // 计算最高频次
        int degree = 0;
        for (int num : nums) {
            degree = Math.max(degree, ++count[num - min]);
        }
        // 如果数组的度为 1，则结果必为1
        if (degree == 1) {
            return 1;
        }
        // 再次循环一遍原数组
        int result = nums.length;
        for (int i = 0; i < count.length; i++) {
            if (degree != count[i]) {
                continue;
            }
            // 还原原数的值
            int tmp = min + i;
            // 求该数出现的起始和结束的下标
            int start = 0, end = nums.length - 1;
            while (start < end && tmp != nums[start]) {
                start++;
            }
            while (start < end && tmp != nums[end]) {
                end--;
            }
            result = Math.min(result, end - start + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums_01 = {2,2};
        int[] nums_02 = {1,2,2,3,1,4,2};

        Solution_697 solution_697 = new Solution_697();
        System.out.println(solution_697.findShortestSubArray(nums_01));
        System.out.println(solution_697.findShortestSubArray(nums_02));
    }
}
