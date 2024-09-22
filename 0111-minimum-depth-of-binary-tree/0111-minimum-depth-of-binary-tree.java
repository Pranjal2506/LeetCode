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
    public int minDepth(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        find(root, li, 1);
        if(li.size() != 0){
            return Collections.min(li);
        }
        return 0;
    }
    public void find(TreeNode root, List<Integer> li, int result){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            li.add(result);
        }
        find(root.left, li, result+1);
        find(root.right, li, result+1);
    }
}