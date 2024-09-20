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
    int ans = 0;
    public int deepestLeavesSum(TreeNode root) {
        int height = find_height(root);
        find_ans(root, height);
        return ans;
    }
    public int find_height(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = find_height(root.left);
        int r = find_height(root.right);
        
        return Math.max(l, r) + 1;
    }
    public void find_ans(TreeNode root, int height){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && height == 1){
            ans += root.val;
        }
        find_ans(root.left, height-1);
        find_ans(root.right, height-1);
    }
}