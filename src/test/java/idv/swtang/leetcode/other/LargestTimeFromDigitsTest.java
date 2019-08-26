package idv.swtang.leetcode.other;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LargestTimeFromDigitsTest {


	private LargestTimeFromDigits largestTimeFromDigits;
	private static int[] input1;
	private static int[] input2;
	
	 private static String expectedOutput1 = "23:41";
	 private static String expectedOutput2 = "";
	
	 
	@Before
	public void setUp() throws Exception {
		largestTimeFromDigits = new LargestTimeFromDigits();
		input1 = new int [] { 1,2,3,4} ;
		input2 = new int[] {5,5,5,5}; 
		
		
	}

	@Test
	public void test() {
		
		Assert.assertEquals(expectedOutput1, largestTimeFromDigits.largestTimeFromDigits(input1));
		Assert.assertEquals(expectedOutput2, largestTimeFromDigits.largestTimeFromDigits(input2));
	}

}
