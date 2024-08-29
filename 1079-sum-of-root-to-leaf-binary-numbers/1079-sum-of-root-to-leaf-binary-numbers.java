/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int finall = 0;
    public int sumRootToLeaf(TreeNode root) {
        finall = 0;
        ans(root, "");
        return finall;
    }
    public void ans(TreeNode root, String ans){
        if(root == null){
            return;
        }
        ans += root.val;
        if(root.left == null && root.right == null){
            finall += Integer.parseInt(ans, 2);
            return;
        }
        ans(root.left, ans);
        ans(root.right, ans);
    }
}