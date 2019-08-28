package idv.swtang.leetcode.dynamic_programming;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import idv.swtang.leetcode.array.LargestTimeFromDigits;

public class LongestIncreasingSubsequenceTest {


	private LongestIncreasingSubsequence longestIncreasingSubsequence;
	private static int[] input1;
	private static int[] input2;
	

	 private static int expectedOutput1 = 4;
	
	 
	@Before
	public void setUp() throws Exception {
		longestIncreasingSubsequence = new LongestIncreasingSubsequence();
		input1 = new int []  {10,9,2,5,3,7,101,18};
		
	}

	@Test
	public void test() {
		
		Assert.assertEquals(expectedOutput1, longestIncreasingSubsequence.lengthOfLIS(input1));
		
	}

}
