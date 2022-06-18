package com.houle.array;

import java.util.ArrayList;
import java.util.List;

public class Solution_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[nums.length+1];
        if (nums.length == 1) {
            return list;
        }
        for (Integer num: nums
             ) {
            ++count[num];
        }
        for(int i=0; i<=nums.length; i++){
            System.out.println("count(" + i + ")= " + count[i]);
            if (count[i] == 2) {
                list.add(i);
            }
        }
        count = null;
        System.gc();
        return list;
    }

    public static void main(String[] args) {
        int[] nums_01 = {4,3,2,7,8,2,3,1};
        int[] nums_02 = {1,1,2};
        int[] nums_03 = {1};

        Solution_442 solution_442 = new Solution_442();
        System.out.println(solution_442.findDuplicates(nums_01).toString());
        // System.out.println(solution_442.findDuplicates(nums_02).toString());
        // System.out.println(solution_442.findDuplicates(nums_03).toString());
    }
}
