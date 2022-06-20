package com.houle.recursion;

public class Stairs {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        int[] dp =new int[n+1];
        if(n==0){
            return 1;
        }
        dp[0]=1;
        dp[1]=1;
        if(n==1){
            return 1;
        }else{
            for(int i=2;i<=n;i++){
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    }
}
