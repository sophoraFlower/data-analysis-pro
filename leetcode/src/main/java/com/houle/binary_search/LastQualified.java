package com.houle.binary_search;

public class LastQualified {
    // 查找最后一个小于等于给定值的元素
    public int b_search(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                if ((mid == n-1) || (a[mid + 1] > value)) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 8, 8, 10, 12, 22, 30, 66, 66, 666, 100};
        LastQualified lastQualified  = new LastQualified();
        int result = lastQualified.b_search(nums, 12, 11);
        System.out.println(result);
    }
}
