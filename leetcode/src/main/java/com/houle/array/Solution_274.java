package com.houle.array;

public class Solution_274 {
    public int hIndex(int[] citations) {
        // 引用指数：0 <= citations[i] <= 1000
        // 论文数：1 <= n <= 5000
        int result = 0;
        int citations_length = citations.length;
        if (citations_length == 1) {
            result = 1;
        }
        // 计算最少引用次数文章数、最多引用次数文章数
        int[] min_index_count = new int[1001];
        int[] max_index_count = new int[1001];
        for (int i=0; i<1001; i++) {
            for (int citation: citations) {
                if (citation >= i) {
                    ++min_index_count[i];
                }
                if (citation < i) {
                    ++max_index_count[i];
                }
            }
        }
        // 总共有h篇论文分别被引用了至少h次。且其余的n-h篇论文每篇被引用次数不超过h次
        for (int i=0; i<citations_length; i++) {
            if (min_index_count[i] >= i && max_index_count[i] <= citations_length-i){
                result = Math.max(result, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] citations_01 = {3,0,6,1,5};
        int[] citations_02 = {1,3,1};
        Solution_274 solution_274 = new Solution_274();
        System.out.println(solution_274.hIndex(citations_01));
        System.out.println(solution_274.hIndex(citations_02));
    }
}
