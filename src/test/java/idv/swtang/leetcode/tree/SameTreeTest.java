package idv.swtang.leetcode.tree;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;

//import javax.swing.tree.TreeNode;

import org.junit.Before;
import org.junit.Test;

import idv.swtang.leetcode.common.TreeNode;
import idv.swtang.leetcode.dynamic_programming.MinimumCostForTickets;
import idv.swtang.leetcode.util.TreeUtils;

public class SameTreeTest {

	private SameTree sametree;
	private static TreeNode inputTree1;
	private static TreeNode inputTree2 ;
	private static TreeNode inputTree3 ;
	
	 private static Boolean expectedOutput1 = true;
	 private static Boolean expectedOutput2 = false;
	@Before
	public void setUp() throws Exception {
		
		sametree = new SameTree();
//		inputTree1 = new TreeNode(1,2,3) ;
//		inputTree2 = new TreeNode (1,2); 
//		inputTree3 = new TreeNode (1,null,2); 
		
		inputTree1 = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3));
		inputTree2 = TreeUtils.constructBinaryTree(Arrays.asList(1,2));
		inputTree3 = TreeUtils.constructBinaryTree(Arrays.asList(1,null,2));
	}

	@Test
	public void test() {
		Assert.assertEquals(expectedOutput1, sametree.isSameTree(inputTree1, inputTree1));
		Assert.assertEquals(expectedOutput2, sametree.isSameTree(inputTree2, inputTree3));
		
	}

}
