package com.houle.array;

public class Solution_665 {
    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) {
            return false;
        }
        boolean result = false;
        int flag = 0;
        int min_value = 0;
        int max_value = 0;
        for (int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]){
                if(flag > 1){
                    break;
                }
                if (i>1) {
                    min_value = nums[i-1];
                    max_value = nums[i+1];
                }
                ++flag;
            }
        }
        System.out.println("flag " + flag);
        System.out.println("@@ " + min_value);
        System.out.println("## " + max_value);
        if (flag == 0) {
            result = true;
        }
        if (flag == 1 && (min_value <= max_value)) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums_01 = {4,2,3};  // true
        int[] nums_02 = {3,4,2,3};  // false
        Solution_665 solution_665 = new Solution_665();
        // System.out.println(solution_665.checkPossibility(nums_01));
        System.out.println(solution_665.checkPossibility(nums_02));
    }
}
