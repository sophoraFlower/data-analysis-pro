package com.houle.sort;

import java.util.Arrays;

public class MergeSort {

    // 归并排序算法, A是数组，n表示数组大小
    public void merge_sort(int[] a, int n) {
        merge_sort_c(a, 0, n-1);
    }

    // 递归调用函数
    public void merge_sort_c(int[] a, int p, int r) {
        // 递归终止条件
        if (p >= r) return;
        // 取p到r之间的中间位置q
        int q = (p+r) / 2;
        // 分治递归
        merge_sort_c(a, p, q);
        merge_sort_c(a, q+1, r);
        // 将A[p...q]和A[q+1...r]合并为A[p...r]
        merge(a, p, q, r);
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q+1;
        int k = 0; // 初始化变量i, j, k
        int[] tmp = new int[r-p+1]; // 申请一个大小跟a[p...r]一样的临时数组
        while (i<=q && j<=r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++]; // i++等于i:=i+1
            } else {
                tmp[k++] = a[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组tmp
        while (start <= end) {
            tmp[k++] = a[start++];
        }

        // 将tmp中的数组拷贝回a[p...r]
        for (i = 0; i <= r-p; ++i) {
            a[p+i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 8, 2, 10, 5, 8, 2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.merge_sort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
