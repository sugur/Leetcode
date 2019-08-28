package idv.swtang.leetcode.greedy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import idv.swtang.leetcode.array.LargestTimeFromDigits;


public class StrWithout3a3bTest {


	private StrWithout3a3b strWithout3a3b;
	private static int inputA1;
	private static int inputB1;
	private static int inputA2;
	private static int inputB2;
	
	
	 private static String expectedOutput1 = "bab"; //bab //bba
	 private static String expectedOutput2 = "aabaa";
	
	 
	@Before
	public void setUp() throws Exception {
		strWithout3a3b = new StrWithout3a3b();
		inputA1 = 1;
		inputB1 = 2;
		
		inputA2 = 4;
		inputB2 = 1;
				
		
		
	}

	@Test
	public void test() {
		
		Assert.assertEquals(expectedOutput1, strWithout3a3b.strWithout3a3b(inputA1, inputB1));
		Assert.assertEquals(expectedOutput2,  strWithout3a3b.strWithout3a3b(inputA2, inputB2));
	}

}