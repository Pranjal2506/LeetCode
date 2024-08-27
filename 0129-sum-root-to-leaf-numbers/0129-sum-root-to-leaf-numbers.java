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
    static int result = 0;
    public int sumNumbers(TreeNode root) {
        result = 0;
        total(root, 0);
        return result;
    }
    public void total(TreeNode root, int sum){
        if(root == null){
            return;
        }
        sum = sum*10+root.val;
        if(root.left == null && root.right == null){
            result = result + sum;
        }
        total(root.left, sum);
        total(root.right, sum);
        sum /= 10;
    }
}