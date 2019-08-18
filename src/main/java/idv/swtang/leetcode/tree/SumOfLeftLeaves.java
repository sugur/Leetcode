package idv.swtang.leetcode.tree;

import idv.swtang.leetcode.common.TreeNode;

//404. Sum of Left Leaves
//Find the sum of all left leaves in a given binary tree.
//
//Example:
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

public class SumOfLeftLeaves {

	
	
	
	 public int sumOfLeftLeaves(TreeNode root) {
	        if (root == null) return 0;
	        return sumOfLeftLeavesHelper(root, false);
	    }

	    private int sumOfLeftLeavesHelper(TreeNode root, boolean leftFlag) {
	        if (root == null) return 0;
	        int left = sumOfLeftLeavesHelper(root.left, true);
	        int right = sumOfLeftLeavesHelper(root.right, false);
	        return left + right + (leftFlag && root.left == null && root.right == null ? root.val : 0);
	    }
}
