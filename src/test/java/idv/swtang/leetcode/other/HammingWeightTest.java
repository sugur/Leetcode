package idv.swtang.leetcode.other;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import idv.swtang.leetcode.dynamic_programming.LongestIncreasingSubsequence;

public class HammingWeightTest {

	private HammingWeight hammingWeight;
	private static int input1;
	private static int input2;
	private static int input3;

	 private static int expectedOutput1 = 3;
	 private static int expectedOutput2 = 1;
	 private static int expectedOutput3 = 31;
	
	 
	@Before
	public void setUp() throws Exception {
		hammingWeight = new HammingWeight();
		input1 = 00000000000000000000000000001011;
		input2 = 00000000000000000000000010000000;
//		input3 = 11111111111111111111111111111101;
	}

	@Test
	public void test() {
		
		Assert.assertEquals(expectedOutput1, hammingWeight.hammingWeight(input1));
		Assert.assertEquals(expectedOutput2, hammingWeight.hammingWeight(input2));
//		Assert.assertEquals(expectedOutput3, hammingWeight.hammingWeight(input3));
		
	}
}
