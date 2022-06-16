package com.houle.array;

public class Solution_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) {
            return 0;
        }
        if (timeSeries.length == 1) {
            return duration;
        }
        int result = duration;
        for (int i = 1; i<timeSeries.length; i++){
            if (timeSeries[i] - timeSeries[i-1] >= duration) {
                result += duration;
            } else {
                result += (timeSeries[i] - timeSeries[i-1]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1,4};
        int duration = 2;

        int[] timeSeries_02 = {1,4,5,10};
        int duration_02 = 3;

        Solution_495 solution_495 = new Solution_495();
        System.out.println(solution_495.findPoisonedDuration(timeSeries, duration));
        System.out.println(solution_495.findPoisonedDuration(timeSeries_02, duration_02));
    }
}
