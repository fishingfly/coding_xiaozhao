/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }else{
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            if (Math.abs(left - right) <= 1) {
                if (isBalanced(root.left) && isBalanced(root.right))
                    return true;
            }
            return false;
        }
    }
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }else {
            int left = 1 + getHeight(root.left);
            int right = 1 + getHeight(root.right);
            int result = left > right ? left : right;
            return result;
        }
    }

}