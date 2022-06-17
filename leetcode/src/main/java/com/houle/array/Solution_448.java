package com.houle.array;

import java.util.ArrayList;
import java.util.List;

public class Solution_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int nums_length = nums.length;
        int[] count = new int[nums_length+1];
        for (int num: nums
             ) {
            ++count[num];
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<nums_length+1; i++) {
            if (count[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums_01 = {4,3,2,7,8,2,3,1};
        int[] nums_02 = {1,1};

        Solution_448 solution_448 = new Solution_448();
        System.out.println(solution_448.findDisappearedNumbers(nums_01).toString());
        System.out.println(solution_448.findDisappearedNumbers(nums_02).toString());
    }
}
