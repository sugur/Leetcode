package idv.swtang.leetcode.dynamic_programming;

import java.util.HashSet;
import java.util.Set;

/*
 * 
 * dp(i)=min(dp(i+1)+costs[0],dp(i+7)+costs[1],dp(i+30)+costs[2])
 * 
 * */
public class MinimumCostForTickets {

	 public int mincostTickets(int[] days, int[] costs) {
	        int[] dp = new int[days.length];
	        dp[0] = costs[0];
	        for (int i = 1; i < days.length; i++) {
	            if (days[i] - days[0] < 7) dp[i] = costs[1];
	            else if (days[i] - days[0] < 30) dp[i] = costs[2];
	            else dp[i] = Integer.MAX_VALUE;
	            for (int j = 0; j < i; j++) {
	                if (days[j + 1] >= days[i]) {
	                    dp[i] = Math.min(dp[i], dp[j] + costs[0]);
	                } else if (days[j + 1] >= days[i] - 6) {
	                    dp[i] = Math.min(dp[i], dp[j] + costs[1]);
	                } else if (days[j + 1] >= days[i] - 29) {
	                    dp[i] = Math.min(dp[i], dp[j] + costs[2]);
	                }
	            }
	        }
	        return dp[dp.length - 1];
	    }

	    

	public int mincostTickets2(int[] days, int[] costs) {
		
        int n = days[days.length - 1];
        boolean[] willTravel = new boolean[n + 1];
        int[] dp = new int[n + 1];
        for (int day : days) {
            willTravel[day] = true;
        }
        dp[0] = 0;	

        for (int i = 1; i < dp.length; i++) {
            if (willTravel[i]) {
                dp[i] = dp[i - 1] + costs[0];
                dp[i] = Math.min(dp[i], dp[Math.max(0, i - 7)] + costs[1]);
                dp[i] = Math.min(dp[i], dp[Math.max(0, i - 30)] + costs[2]);
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[n];
    }
}
