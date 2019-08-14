package idv.swtang.leetcode.dynamic_programming;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumCostForTicketsTest {


	 private MinimumCostForTickets minimumCostForTickets;
	private static int[] inputday;
	private static int[] inputcosts ;
	 private static int expectedOutput1 = 11;
	 private static int expectedOutput2 = 17;
		private static int[] inputday2;
		private static int[] inputcosts2 ;
	 
	@Before
	public void setUp() throws Exception {
		minimumCostForTickets = new MinimumCostForTickets();
		inputday = new int [] { 1,4,6,7,8,20} ;
		inputcosts = new int[] {2,7,15}; 
		inputday2 = new int [] {1,2,3,4,5,6,7,8,9,10,30,31} ;
		inputcosts2 = new int[] {2,7,15}; 
		
	}

	@Test
	public void test() {
		
		Assert.assertEquals(expectedOutput1, minimumCostForTickets.mincostTickets(inputday, inputcosts));
		Assert.assertEquals(expectedOutput2, minimumCostForTickets.mincostTickets2(inputday2, inputcosts2));
	}

}
