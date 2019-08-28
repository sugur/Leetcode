package idv.swtang.leetcode.dynamic_programming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	 public int lengthOfLIS(int[] nums) {
		 System.out.println("Your test case: A: "+ Arrays.toString(nums) );
	        if (nums.length == 0) {
	        	 System.out.println("Returned value: 0" );
	            return 0;
	        }
	        int[] dp = new int[nums.length];
	        dp[0] = 1;
	        int maxans = 1;
	        for (int i = 1; i < dp.length; i++) {
	            int maxval = 0;
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j]) {
	                    maxval = Math.max(maxval, dp[j]);
	                }
	            }
	            dp[i] = maxval + 1;
	            maxans = Math.max(maxans, dp[i]);
	            
	            System.out.println(" dp["+ i +"]"+  dp[i]);
	        }
	        
	        System.out.println("Returned value::"+ maxans);
	        return maxans;
	    
	}
}
