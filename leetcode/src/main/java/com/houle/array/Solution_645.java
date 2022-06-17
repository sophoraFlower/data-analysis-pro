package com.houle.array;

import java.util.Arrays;

public class Solution_645 {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length+1];
        for (int num : nums) {
            count[num]++;
        }
        int[] result = new int[2];
        for (int j=0; j<count.length; j++) {
            if (count[j] > 1) {
                result[0] = j;
            }
            if (count[j] < 1) {
                result[1] = j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums_01 = {1,2,2,4};
        int[] nums_02 = {1,1};
        Solution_645 solution_645 = new Solution_645();
        System.out.println(Arrays.toString(solution_645.findErrorNums(nums_01)));
        System.out.println(Arrays.toString(solution_645.findErrorNums(nums_02)));
    }
}
